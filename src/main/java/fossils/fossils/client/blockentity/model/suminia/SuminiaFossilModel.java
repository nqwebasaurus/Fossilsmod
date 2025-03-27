package fossils.fossils.client.blockentity.model.suminia;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.SkullModelBase;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;

@SuppressWarnings("unused")
public class SuminiaFossilModel extends SkullModelBase {
	private final ModelPart root;
	private final ModelPart Hips;
	private final ModelPart Tail1;
	private final ModelPart Tail2;
	private final ModelPart Tail3;
	private final ModelPart Tail4;
	private final ModelPart Tail5;
	private final ModelPart Bodymiddle;
	private final ModelPart Bodyfront;
	private final ModelPart Neck;
	private final ModelPart Head;
	private final ModelPart Lowerjawbase;
	private final ModelPart Lowerjawmiddle;
	private final ModelPart Lowerjawfront;
	private final ModelPart Lowerfrontteeth;
	private final ModelPart Lowermiddleteeth;
	private final ModelPart Lowerbackteeth;
	private final ModelPart Jawparting;
	private final ModelPart Upperjawback;
	private final ModelPart Upperjawfront;
	private final ModelPart Upperfrontteeth;
	private final ModelPart Uppermiddleteeth;
	private final ModelPart Upperbackteeth;
	private final ModelPart Browslope;
	private final ModelPart Snoutslope;
	private final ModelPart Rightupperarm;
	private final ModelPart Rightlowerarm;
	private final ModelPart Righthand;
	private final ModelPart Rightthumb;
	private final ModelPart Leftupperarm;
	private final ModelPart Leftlowerarm;
	private final ModelPart Lefthand;
	private final ModelPart Leftthumb;
	private final ModelPart Rightthigh;
	private final ModelPart Rightshin;
	private final ModelPart Righthindfoot;
	private final ModelPart Rightopposabletoe;
	private final ModelPart Leftthigh;
	private final ModelPart Leftshin;
	private final ModelPart Lefthindfoot;
	private final ModelPart Leftopposabletoe;

	public SuminiaFossilModel(ModelPart root) {
		this.root = root.getChild("root");
		this.Hips = this.root.getChild("Hips");
		this.Tail1 = this.Hips.getChild("Tail1");
		this.Tail2 = this.Tail1.getChild("Tail2");
		this.Tail3 = this.Tail2.getChild("Tail3");
		this.Tail4 = this.Tail3.getChild("Tail4");
		this.Tail5 = this.Tail4.getChild("Tail5");
		this.Bodymiddle = this.Hips.getChild("Bodymiddle");
		this.Bodyfront = this.Bodymiddle.getChild("Bodyfront");
		this.Neck = this.Bodyfront.getChild("Neck");
		this.Head = this.Neck.getChild("Head");
		this.Lowerjawbase = this.Head.getChild("Lowerjawbase");
		this.Lowerjawmiddle = this.Lowerjawbase.getChild("Lowerjawmiddle");
		this.Lowerjawfront = this.Lowerjawmiddle.getChild("Lowerjawfront");
		this.Lowerfrontteeth = this.Lowerjawfront.getChild("Lowerfrontteeth");
		this.Lowermiddleteeth = this.Lowerjawfront.getChild("Lowermiddleteeth");
		this.Lowerbackteeth = this.Lowerjawmiddle.getChild("Lowerbackteeth");
		this.Jawparting = this.Lowerjawbase.getChild("Jawparting");
		this.Upperjawback = this.Head.getChild("Upperjawback");
		this.Upperjawfront = this.Upperjawback.getChild("Upperjawfront");
		this.Upperfrontteeth = this.Upperjawfront.getChild("Upperfrontteeth");
		this.Uppermiddleteeth = this.Upperjawfront.getChild("Uppermiddleteeth");
		this.Upperbackteeth = this.Upperjawback.getChild("Upperbackteeth");
		this.Browslope = this.Head.getChild("Browslope");
		this.Snoutslope = this.Browslope.getChild("Snoutslope");
		this.Rightupperarm = this.Bodyfront.getChild("Rightupperarm");
		this.Rightlowerarm = this.Rightupperarm.getChild("Rightlowerarm");
		this.Righthand = this.Rightlowerarm.getChild("Righthand");
		this.Rightthumb = this.Righthand.getChild("Rightthumb");
		this.Leftupperarm = this.Bodyfront.getChild("Leftupperarm");
		this.Leftlowerarm = this.Leftupperarm.getChild("Leftlowerarm");
		this.Lefthand = this.Leftlowerarm.getChild("Lefthand");
		this.Leftthumb = this.Lefthand.getChild("Leftthumb");
		this.Rightthigh = this.Hips.getChild("Rightthigh");
		this.Rightshin = this.Rightthigh.getChild("Rightshin");
		this.Righthindfoot = this.Rightshin.getChild("Righthindfoot");
		this.Rightopposabletoe = this.Righthindfoot.getChild("Rightopposabletoe");
		this.Leftthigh = this.Hips.getChild("Leftthigh");
		this.Leftshin = this.Leftthigh.getChild("Leftshin");
		this.Lefthindfoot = this.Leftshin.getChild("Lefthindfoot");
		this.Leftopposabletoe = this.Lefthindfoot.getChild("Leftopposabletoe");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition root = partdefinition.addOrReplaceChild("root", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition Hips = root.addOrReplaceChild("Hips", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 14.7F, -1.0F, -0.6533F, 0.0F, 0.0F));

		PartDefinition Hips_r1 = Hips.addOrReplaceChild("Hips_r1", CubeListBuilder.create().texOffs(25, 29).mirror().addBox(-2.9868F, 2.961F, -2.6185F, 1.0F, 4.0F, 8.0F, new CubeDeformation(0.001F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -7.6941F, 8.5588F, -0.228F, -0.1298F, -0.4215F));

		PartDefinition Hips_r2 = Hips.addOrReplaceChild("Hips_r2", CubeListBuilder.create().texOffs(16, 15).mirror().addBox(-1.4421F, 1.902F, -0.6185F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.001F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -7.6941F, 8.5588F, -0.2608F, -0.0226F, 0.003F));

		PartDefinition Hips_r3 = Hips.addOrReplaceChild("Hips_r3", CubeListBuilder.create().texOffs(49, 33).mirror().addBox(-0.9748F, 0.1096F, -0.6185F, 1.0F, 2.0F, 6.0F, new CubeDeformation(0.001F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -7.6941F, 8.5588F, -0.2597F, 0.0338F, 0.2138F));

		PartDefinition Hips_r4 = Hips.addOrReplaceChild("Hips_r4", CubeListBuilder.create().texOffs(25, 29).addBox(1.9868F, 2.961F, -2.6185F, 1.0F, 4.0F, 8.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(1.0F, -7.6941F, 8.5588F, -0.228F, 0.1298F, 0.4215F));

		PartDefinition Hips_r5 = Hips.addOrReplaceChild("Hips_r5", CubeListBuilder.create().texOffs(16, 15).addBox(0.4421F, 1.902F, -0.6185F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(1.0F, -7.6941F, 8.5588F, -0.2608F, 0.0226F, -0.003F));

		PartDefinition Hips_r6 = Hips.addOrReplaceChild("Hips_r6", CubeListBuilder.create().texOffs(49, 33).addBox(-0.0252F, 0.1096F, -0.6185F, 1.0F, 2.0F, 6.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(1.0F, -7.6941F, 8.5588F, -0.2597F, -0.0338F, -0.2138F));

		PartDefinition Hips_r7 = Hips.addOrReplaceChild("Hips_r7", CubeListBuilder.create().texOffs(34, 0).addBox(-1.0F, -1.2F, 0.0F, 2.0F, 2.0F, 8.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.0F, -6.9941F, 5.5588F, -0.0873F, 0.0F, 0.0F));

		PartDefinition Tail1 = Hips.addOrReplaceChild("Tail1", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -6.4941F, 13.4588F, 0.3485F, 0.3296F, 0.1171F));

		PartDefinition Tail4_r1 = Tail1.addOrReplaceChild("Tail4_r1", CubeListBuilder.create().texOffs(49, 33).addBox(0.0F, 1.9655F, 4.022F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(43, 14).addBox(0.0F, 0.9655F, 2.022F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(23, 15).addBox(0.0F, -0.0345F, 0.022F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.3624F, 1.6402F, 0.3491F, 0.0F, 0.0F));

		PartDefinition Tail1_r1 = Tail1.addOrReplaceChild("Tail1_r1", CubeListBuilder.create().texOffs(38, 11).addBox(-1.0F, -1.2F, 0.2F, 2.0F, 2.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.1624F, -0.3598F, -0.1745F, 0.0F, 0.0F));

		PartDefinition Tail2 = Tail1.addOrReplaceChild("Tail2", CubeListBuilder.create().texOffs(0, 26).addBox(-1.0F, -0.7774F, -0.7406F, 2.0F, 2.0F, 10.0F, new CubeDeformation(-0.001F)), PartPose.offsetAndRotation(0.0F, 1.1624F, 7.5402F, 0.245F, 0.4248F, 0.1027F));

		PartDefinition Tail8_r1 = Tail2.addOrReplaceChild("Tail8_r1", CubeListBuilder.create().texOffs(0, 12).addBox(0.0F, 2.7257F, 5.752F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(7, 12).addBox(0.0F, 1.7257F, 3.752F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(25, 29).addBox(0.0F, 0.7257F, 1.752F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(0, 39).addBox(0.0F, -0.2743F, -0.248F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.2226F, 1.0594F, 0.5672F, 0.0F, 0.0F));

		PartDefinition Tail3 = Tail2.addOrReplaceChild("Tail3", CubeListBuilder.create().texOffs(38, 22).addBox(-0.5F, -0.324F, -0.3927F, 1.0F, 1.0F, 9.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.3774F, 8.7594F, 0.0341F, 0.6542F, 0.0208F));

		PartDefinition Tail4 = Tail3.addOrReplaceChild("Tail4", CubeListBuilder.create().texOffs(29, 45).addBox(-0.5F, -0.4391F, 0.1893F, 1.0F, 1.0F, 7.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.0F, 0.176F, 8.3073F, -0.2439F, 0.5107F, -0.121F));

		PartDefinition Tail5 = Tail4.addOrReplaceChild("Tail5", CubeListBuilder.create().texOffs(46, 45).addBox(-0.5F, -0.4928F, -0.0845F, 1.0F, 1.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0709F, 6.5893F, -0.2486F, 0.8135F, -0.1824F));

		PartDefinition Bodymiddle = Hips.addOrReplaceChild("Bodymiddle", CubeListBuilder.create().texOffs(0, 12).addBox(-1.0F, -0.8626F, -10.8347F, 2.0F, 2.0F, 11.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -7.3941F, 5.6588F, 0.0424F, 0.0F, 0.0F));

		PartDefinition Neck_r1 = Bodymiddle.addOrReplaceChild("Neck_r1", CubeListBuilder.create().texOffs(3, 50).mirror().addBox(0.334F, 0.9693F, -0.6274F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.6F, 0.2818F, -0.2671F, -0.1212F, -0.09F, 0.422F));

		PartDefinition Neck_r2 = Bodymiddle.addOrReplaceChild("Neck_r2", CubeListBuilder.create().texOffs(38, 15).mirror().addBox(0.8454F, -1.3939F, -0.6274F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.6F, 0.2818F, -0.2671F, -0.1504F, -0.0111F, 0.9846F));

		PartDefinition Neck_r3 = Bodymiddle.addOrReplaceChild("Neck_r3", CubeListBuilder.create().texOffs(0, 50).mirror().addBox(0.334F, 0.9693F, -0.6274F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.6F, 0.2818F, -2.2671F, -0.0812F, -0.1078F, 0.4181F));

		PartDefinition Neck_r4 = Bodymiddle.addOrReplaceChild("Neck_r4", CubeListBuilder.create().texOffs(32, 42).mirror().addBox(0.8454F, -1.3939F, -0.6274F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.6F, 0.2818F, -2.2671F, -0.1263F, -0.0474F, 0.9839F));

		PartDefinition Neck_r5 = Bodymiddle.addOrReplaceChild("Neck_r5", CubeListBuilder.create().texOffs(16, 12).mirror().addBox(0.334F, 0.9693F, -0.6274F, 0.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.6F, 0.2818F, -4.2671F, -0.0812F, -0.1078F, 0.4181F));

		PartDefinition Neck_r6 = Bodymiddle.addOrReplaceChild("Neck_r6", CubeListBuilder.create().texOffs(39, 45).mirror().addBox(0.8454F, -1.3939F, -0.6274F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.6F, 0.2818F, -4.2671F, -0.1263F, -0.0474F, 0.9839F));

		PartDefinition Neck_r7 = Bodymiddle.addOrReplaceChild("Neck_r7", CubeListBuilder.create().texOffs(59, 59).mirror().addBox(0.334F, 0.9693F, -0.6274F, 0.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.6F, 0.2818F, -6.2671F, -0.0006F, -0.1428F, 0.408F));

		PartDefinition Neck_r8 = Bodymiddle.addOrReplaceChild("Neck_r8", CubeListBuilder.create().texOffs(47, 0).mirror().addBox(0.8454F, -1.3939F, -0.6274F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.6F, 0.2818F, -6.2671F, -0.0776F, -0.12F, 0.9798F));

		PartDefinition Neck_r9 = Bodymiddle.addOrReplaceChild("Neck_r9", CubeListBuilder.create().texOffs(48, 45).mirror().addBox(0.8454F, -1.3939F, -0.6274F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.6F, 0.2818F, -8.2671F, -0.0776F, -0.12F, 0.9798F));

		PartDefinition Neck_r10 = Bodymiddle.addOrReplaceChild("Neck_r10", CubeListBuilder.create().texOffs(15, 26).mirror().addBox(0.334F, 0.9693F, -0.6274F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.6F, 0.2818F, -8.2671F, -0.0006F, -0.1428F, 0.408F));

		PartDefinition Neck_r11 = Bodymiddle.addOrReplaceChild("Neck_r11", CubeListBuilder.create().texOffs(38, 15).addBox(-0.8454F, -1.3939F, -0.6274F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.6F, 0.2818F, -0.2671F, -0.1504F, 0.0111F, -0.9846F));

		PartDefinition Neck_r12 = Bodymiddle.addOrReplaceChild("Neck_r12", CubeListBuilder.create().texOffs(3, 50).addBox(-0.334F, 0.9693F, -0.6274F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.6F, 0.2818F, -0.2671F, -0.1212F, 0.09F, -0.422F));

		PartDefinition Neck_r13 = Bodymiddle.addOrReplaceChild("Neck_r13", CubeListBuilder.create().texOffs(0, 50).addBox(-0.334F, 0.9693F, -0.6274F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.6F, 0.2818F, -2.2671F, -0.0812F, 0.1078F, -0.4181F));

		PartDefinition Neck_r14 = Bodymiddle.addOrReplaceChild("Neck_r14", CubeListBuilder.create().texOffs(32, 42).addBox(-0.8454F, -1.3939F, -0.6274F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.6F, 0.2818F, -2.2671F, -0.1263F, 0.0474F, -0.9839F));

		PartDefinition Neck_r15 = Bodymiddle.addOrReplaceChild("Neck_r15", CubeListBuilder.create().texOffs(16, 12).addBox(-0.334F, 0.9693F, -0.6274F, 0.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.6F, 0.2818F, -4.2671F, -0.0812F, 0.1078F, -0.4181F));

		PartDefinition Neck_r16 = Bodymiddle.addOrReplaceChild("Neck_r16", CubeListBuilder.create().texOffs(39, 45).addBox(-0.8454F, -1.3939F, -0.6274F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.6F, 0.2818F, -4.2671F, -0.1263F, 0.0474F, -0.9839F));

		PartDefinition Neck_r17 = Bodymiddle.addOrReplaceChild("Neck_r17", CubeListBuilder.create().texOffs(47, 0).addBox(-0.8454F, -1.3939F, -0.6274F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.6F, 0.2818F, -6.2671F, -0.0776F, 0.12F, -0.9798F));

		PartDefinition Neck_r18 = Bodymiddle.addOrReplaceChild("Neck_r18", CubeListBuilder.create().texOffs(59, 59).addBox(-0.334F, 0.9693F, -0.6274F, 0.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.6F, 0.2818F, -6.2671F, -0.0006F, 0.1428F, -0.408F));

		PartDefinition Neck_r19 = Bodymiddle.addOrReplaceChild("Neck_r19", CubeListBuilder.create().texOffs(48, 45).addBox(-0.8454F, -1.3939F, -0.6274F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.6F, 0.2818F, -8.2671F, -0.0776F, 0.12F, -0.9798F));

		PartDefinition Neck_r20 = Bodymiddle.addOrReplaceChild("Neck_r20", CubeListBuilder.create().texOffs(15, 26).addBox(-0.334F, 0.9693F, -0.6274F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.6F, 0.2818F, -8.2671F, -0.0006F, 0.1428F, -0.408F));

		PartDefinition Bodyfront = Bodymiddle.addOrReplaceChild("Bodyfront", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.1626F, -10.1347F, 0.2806F, 0.0F, 0.0F));

		PartDefinition Neck_r21 = Bodyfront.addOrReplaceChild("Neck_r21", CubeListBuilder.create().texOffs(30, 29).mirror().addBox(0.334F, 0.9693F, -0.6274F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.6F, 0.6404F, -0.2066F, -0.0006F, -0.1428F, 0.408F));

		PartDefinition Neck_r22 = Bodyfront.addOrReplaceChild("Neck_r22", CubeListBuilder.create().texOffs(12, 50).mirror().addBox(0.8454F, -1.3939F, -0.6274F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.6F, 0.6404F, -0.2066F, -0.0776F, -0.12F, 0.9798F));

		PartDefinition Neck_r23 = Bodyfront.addOrReplaceChild("Neck_r23", CubeListBuilder.create().texOffs(9, 59).mirror().addBox(0.334F, 0.9693F, -0.6274F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.6F, 0.6404F, -2.2066F, 0.0807F, -0.1769F, 0.395F));

		PartDefinition Neck_r24 = Bodyfront.addOrReplaceChild("Neck_r24", CubeListBuilder.create().texOffs(50, 22).mirror().addBox(0.8454F, -1.3939F, -0.6274F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.6F, 0.6404F, -2.2066F, -0.0281F, -0.1923F, 0.9721F));

		PartDefinition Neck_r25 = Bodyfront.addOrReplaceChild("Neck_r25", CubeListBuilder.create().texOffs(12, 59).mirror().addBox(0.334F, 0.9693F, -0.6274F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.6F, 1.0404F, -4.2066F, 0.1631F, -0.2099F, 0.3792F));

		PartDefinition Neck_r26 = Bodyfront.addOrReplaceChild("Neck_r26", CubeListBuilder.create().texOffs(52, 33).mirror().addBox(0.8454F, -1.3939F, -0.6274F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.6F, 1.0404F, -4.2066F, 0.0228F, -0.2641F, 0.9606F));

		PartDefinition Neck_r27 = Bodyfront.addOrReplaceChild("Neck_r27", CubeListBuilder.create().texOffs(61, 19).mirror().addBox(0.334F, 0.9693F, -0.6274F, 0.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.6F, 1.3404F, -6.2066F, 0.2466F, -0.2415F, 0.3605F));

		PartDefinition Neck_r28 = Bodyfront.addOrReplaceChild("Neck_r28", CubeListBuilder.create().texOffs(58, 0).mirror().addBox(0.8454F, -1.3939F, -0.6274F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.6F, 1.3404F, -6.2066F, 0.0757F, -0.3352F, 0.945F));

		PartDefinition Neck_r29 = Bodyfront.addOrReplaceChild("Neck_r29", CubeListBuilder.create().texOffs(58, 35).mirror().addBox(-0.0334F, -0.0895F, 0.0312F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.6F, 3.0404F, -8.2066F, 0.4611F, -0.3126F, 0.3016F));

		PartDefinition Neck_r30 = Bodyfront.addOrReplaceChild("Neck_r30", CubeListBuilder.create().texOffs(59, 28).mirror().addBox(0.028F, -0.024F, -0.4687F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 1.6404F, -8.2066F, 0.2213F, -0.5085F, 0.885F));

		PartDefinition Bodyfront_r1 = Bodyfront.addOrReplaceChild("Bodyfront_r1", CubeListBuilder.create().texOffs(50, 22).mirror().addBox(-2.0F, -2.157F, -0.0251F, 3.0F, 1.0F, 4.0F, new CubeDeformation(0.001F)).mirror(false)
				.texOffs(50, 22).addBox(-1.0F, -2.157F, -0.0251F, 3.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 9.3961F, -11.3741F, -0.3054F, 0.0F, 0.0F));

		PartDefinition Bodyfront_r2 = Bodyfront.addOrReplaceChild("Bodyfront_r2", CubeListBuilder.create().texOffs(0, 50).mirror().addBox(-0.3F, -4.4101F, -5.9734F, 1.0F, 2.0F, 6.0F, new CubeDeformation(0.001F)).mirror(false), PartPose.offsetAndRotation(-3.0F, 1.5961F, -3.0741F, 1.2828F, 0.103F, 0.3341F));

		PartDefinition Bodyfront_r3 = Bodyfront.addOrReplaceChild("Bodyfront_r3", CubeListBuilder.create().texOffs(0, 12).mirror().addBox(-0.463F, -3.0988F, -3.678F, 1.0F, 5.0F, 4.0F, new CubeDeformation(0.001F)).mirror(false), PartPose.offsetAndRotation(-5.0F, 6.5961F, -7.0741F, 1.3919F, -0.2489F, -0.9375F));

		PartDefinition Bodyfront_r4 = Bodyfront.addOrReplaceChild("Bodyfront_r4", CubeListBuilder.create().texOffs(0, 12).addBox(-0.537F, -3.0988F, -3.678F, 1.0F, 5.0F, 4.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(5.0F, 6.5961F, -7.0741F, 1.3919F, 0.2489F, 0.9375F));

		PartDefinition Bodyfront_r5 = Bodyfront.addOrReplaceChild("Bodyfront_r5", CubeListBuilder.create().texOffs(0, 50).addBox(-0.7F, -4.4101F, -5.9734F, 1.0F, 2.0F, 6.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(3.0F, 1.5961F, -3.0741F, 1.2828F, -0.103F, -0.3341F));

		PartDefinition Bodyfront_r6 = Bodyfront.addOrReplaceChild("Bodyfront_r6", CubeListBuilder.create().texOffs(19, 2).addBox(-1.0F, -1.5F, 0.0F, 2.0F, 2.0F, 10.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.0F, 1.5961F, -10.0741F, 0.0873F, 0.0F, 0.0F));

		PartDefinition Neck_r31 = Bodyfront.addOrReplaceChild("Neck_r31", CubeListBuilder.create().texOffs(12, 50).addBox(-0.8454F, -1.3939F, -0.6274F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.6F, 0.6404F, -0.2066F, -0.0776F, 0.12F, -0.9798F));

		PartDefinition Neck_r32 = Bodyfront.addOrReplaceChild("Neck_r32", CubeListBuilder.create().texOffs(30, 29).addBox(-0.334F, 0.9693F, -0.6274F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.6F, 0.6404F, -0.2066F, -0.0006F, 0.1428F, -0.408F));

		PartDefinition Neck_r33 = Bodyfront.addOrReplaceChild("Neck_r33", CubeListBuilder.create().texOffs(9, 59).addBox(-0.334F, 0.9693F, -0.6274F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.6F, 0.6404F, -2.2066F, 0.0807F, 0.1769F, -0.395F));

		PartDefinition Neck_r34 = Bodyfront.addOrReplaceChild("Neck_r34", CubeListBuilder.create().texOffs(50, 22).addBox(-0.8454F, -1.3939F, -0.6274F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.6F, 0.6404F, -2.2066F, -0.0281F, 0.1923F, -0.9721F));

		PartDefinition Neck_r35 = Bodyfront.addOrReplaceChild("Neck_r35", CubeListBuilder.create().texOffs(12, 59).addBox(-0.334F, 0.9693F, -0.6274F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.6F, 1.0404F, -4.2066F, 0.1631F, 0.2099F, -0.3792F));

		PartDefinition Neck_r36 = Bodyfront.addOrReplaceChild("Neck_r36", CubeListBuilder.create().texOffs(52, 33).addBox(-0.8454F, -1.3939F, -0.6274F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.6F, 1.0404F, -4.2066F, 0.0228F, 0.2641F, -0.9606F));

		PartDefinition Neck_r37 = Bodyfront.addOrReplaceChild("Neck_r37", CubeListBuilder.create().texOffs(58, 0).addBox(-0.8454F, -1.3939F, -0.6274F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.6F, 1.3404F, -6.2066F, 0.0757F, 0.3352F, -0.945F));

		PartDefinition Neck_r38 = Bodyfront.addOrReplaceChild("Neck_r38", CubeListBuilder.create().texOffs(61, 19).addBox(-0.334F, 0.9693F, -0.6274F, 0.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.6F, 1.3404F, -6.2066F, 0.2466F, 0.2415F, -0.3605F));

		PartDefinition Neck_r39 = Bodyfront.addOrReplaceChild("Neck_r39", CubeListBuilder.create().texOffs(58, 35).addBox(0.0334F, -0.0895F, 0.0312F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.6F, 3.0404F, -8.2066F, 0.4611F, 0.3126F, -0.3016F));

		PartDefinition Neck_r40 = Bodyfront.addOrReplaceChild("Neck_r40", CubeListBuilder.create().texOffs(59, 28).addBox(-0.028F, -0.024F, -0.4687F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 1.6404F, -8.2066F, 0.2213F, 0.5085F, -0.885F));

		PartDefinition Neck = Bodyfront.addOrReplaceChild("Neck", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.5961F, -9.2741F, -0.8786F, 0.0F, 0.0F));

		PartDefinition Neck_r41 = Neck.addOrReplaceChild("Neck_r41", CubeListBuilder.create().texOffs(9, 50).mirror().addBox(0.601F, 1.9214F, 1.0324F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(61, 13).mirror().addBox(0.0F, 0.0099F, 0.04F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 1.5831F, -3.0281F, 1.0954F, -0.2729F, 0.2204F));

		PartDefinition Neck_r42 = Neck.addOrReplaceChild("Neck_r42", CubeListBuilder.create().texOffs(9, 50).addBox(-0.601F, 1.9214F, 1.0324F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(61, 13).addBox(0.0F, 0.0099F, 0.04F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 1.5831F, -3.0281F, 1.0954F, 0.2729F, -0.2204F));

		PartDefinition Neck_r43 = Neck.addOrReplaceChild("Neck_r43", CubeListBuilder.create().texOffs(36, 34).addBox(-1.0F, -0.8F, -1.9F, 2.0F, 2.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.4831F, -5.6281F, 0.0349F, 0.0F, 0.0F));

		PartDefinition Head = Neck.addOrReplaceChild("Head", CubeListBuilder.create().texOffs(0, 39).addBox(-2.0F, -3.2321F, -4.6351F, 4.0F, 5.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.01F, 0.5831F, -6.0281F, 1.0779F, 0.0F, 0.0F));

		PartDefinition Head_r1 = Head.addOrReplaceChild("Head_r1", CubeListBuilder.create().texOffs(15, 29).mirror().addBox(-0.39F, -0.4F, 0.1F, 2.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.99F, 0.5679F, -4.7351F, 0.3551F, -0.2106F, -0.0573F));

		PartDefinition Head_r2 = Head.addOrReplaceChild("Head_r2", CubeListBuilder.create().texOffs(15, 29).addBox(-1.61F, -0.4F, 0.1F, 2.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.01F, 0.5679F, -4.7351F, 0.3551F, 0.2106F, 0.0573F));

		PartDefinition Lowerjawbase = Head.addOrReplaceChild("Lowerjawbase", CubeListBuilder.create().texOffs(0, 0).addBox(1.5F, 0.0F, -5.0F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.0F))
				.texOffs(34, 0).addBox(1.5F, 0.0F, -2.0F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(34, 0).mirror().addBox(-2.48F, 0.0F, -2.0F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(0, 0).mirror().addBox(-2.48F, 0.0F, -5.0F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 1.7679F, 0.3649F, 0.4363F, 0.0F, 0.0F));

		PartDefinition Lowerjawbase_r1 = Lowerjawbase.addOrReplaceChild("Lowerjawbase_r1", CubeListBuilder.create().texOffs(51, 7).mirror().addBox(0.01F, -1.6F, -5.6F, 0.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.99F, 3.8F, -0.1F, -0.2182F, -0.2007F, 0.0F));

		PartDefinition Lowerjawbase_r2 = Lowerjawbase.addOrReplaceChild("Lowerjawbase_r2", CubeListBuilder.create().texOffs(51, 7).addBox(-0.01F, -1.6F, -5.6F, 0.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.01F, 3.8F, -0.1F, -0.2182F, 0.2007F, 0.0F));

		PartDefinition Lowerjawmiddle = Lowerjawbase.addOrReplaceChild("Lowerjawmiddle", CubeListBuilder.create().texOffs(20, 0).addBox(1.0F, 0.0F, -3.0F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.0F))
				.texOffs(20, 0).mirror().addBox(-1.98F, 0.0F, -3.0F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, -4.9F, 0.0637F, 0.0F, 0.0F));

		PartDefinition Lowerjawmiddle_r1 = Lowerjawmiddle.addOrReplaceChild("Lowerjawmiddle_r1", CubeListBuilder.create().texOffs(14, 39).mirror().addBox(-1.99F, -0.8F, -2.7F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.001F)).mirror(false)
				.texOffs(14, 39).addBox(0.99F, -0.8F, -2.7F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.001F)), PartPose.offsetAndRotation(0.01F, 1.8F, -0.3F, 0.384F, 0.0F, 0.0F));

		PartDefinition Lowerjawfront = Lowerjawmiddle.addOrReplaceChild("Lowerjawfront", CubeListBuilder.create().texOffs(52, 59).addBox(0.5F, 0.0F, -2.0F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(52, 59).mirror().addBox(-1.48F, 0.0F, -2.0F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(56, 47).addBox(-1.5F, 0.0F, -3.0F, 3.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, -3.0F, 0.0848F, 0.0F, 0.0F));

		PartDefinition Lowerfrontteeth = Lowerjawfront.addOrReplaceChild("Lowerfrontteeth", CubeListBuilder.create().texOffs(0, 6).addBox(-1.0F, -1.0F, 0.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(0, 6).addBox(-1.0F, -1.4F, 0.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.01F, 0.1F, -2.6F, 0.0637F, 0.0F, 0.0F));

		PartDefinition Lowermiddleteeth = Lowerjawfront.addOrReplaceChild("Lowermiddleteeth", CubeListBuilder.create().texOffs(38, 22).addBox(-1.0F, -1.0F, 0.0F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.01F, 0.2F, -1.6F, -0.0848F, 0.0F, 0.0F));

		PartDefinition Lowerbackteeth = Lowerjawmiddle.addOrReplaceChild("Lowerbackteeth", CubeListBuilder.create().texOffs(56, 42).addBox(-1.5F, -1.0F, 0.0F, 3.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.01F, 0.2F, -2.7F, -0.1698F, 0.0F, 0.0F));

		PartDefinition Jawparting = Lowerjawbase.addOrReplaceChild("Jawparting", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.1F, -5.0F, -0.4882F, 0.0F, 0.0F));

		PartDefinition Upperjawback = Head.addOrReplaceChild("Upperjawback", CubeListBuilder.create().texOffs(19, 42).addBox(-2.0F, 0.0F, -3.3F, 4.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.01F, -2.2321F, -4.5051F, 0.0637F, 0.0F, 0.0F));

		PartDefinition Upperjawfront = Upperjawback.addOrReplaceChild("Upperjawfront", CubeListBuilder.create().texOffs(47, 0).addBox(-1.5F, 0.0F, -3.0F, 3.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 2.0F, -3.46F, 0.0848F, 0.0F, 0.0F));

		PartDefinition Upperfrontteeth = Upperjawfront.addOrReplaceChild("Upperfrontteeth", CubeListBuilder.create().texOffs(36, 33).addBox(-1.0F, 1.0F, -0.2F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.01F, 0.7F, -1.9F, -0.5732F, 0.0F, 0.0F));

		PartDefinition Uppermiddleteeth = Upperjawfront.addOrReplaceChild("Uppermiddleteeth", CubeListBuilder.create().texOffs(0, 59).addBox(-1.0F, 0.2F, 0.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.01F, 1.0F, -1.7F, -0.0848F, 0.0F, 0.0F));

		PartDefinition Upperbackteeth = Upperjawback.addOrReplaceChild("Upperbackteeth", CubeListBuilder.create().texOffs(52, 54).addBox(-1.5F, 0.0F, 0.0F, 3.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.01F, 3.9F, -3.2F, 0.1274F, 0.0F, 0.0F));

		PartDefinition Browslope = Head.addOrReplaceChild("Browslope", CubeListBuilder.create().texOffs(51, 14).addBox(-1.5F, 0.0F, -3.0F, 3.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -3.2321F, -4.6351F, 0.2546F, 0.0F, 0.0F));

		PartDefinition Snoutslope = Browslope.addOrReplaceChild("Snoutslope", CubeListBuilder.create().texOffs(39, 45).addBox(-1.0F, 0.0F, -4.0F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, -3.0F, 0.536F, 0.0F, 0.0F));

		PartDefinition Rightupperarm = Bodyfront.addOrReplaceChild("Rightupperarm", CubeListBuilder.create().texOffs(0, 26).addBox(-0.8246F, -1.0098F, -0.6481F, 2.0F, 7.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(5.0F, 6.1961F, -6.4741F, 0.9226F, 0.0392F, -0.0994F));

		PartDefinition Rightlowerarm = Rightupperarm.addOrReplaceChild("Rightlowerarm", CubeListBuilder.create().texOffs(45, 54).addBox(-0.7306F, -0.239F, -0.3747F, 2.0F, 9.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(38, 54).addBox(-0.7306F, -0.239F, -2.1747F, 2.0F, 9.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.3346F, 5.4902F, 0.3519F, -0.7098F, 0.1651F, 0.4196F));

		PartDefinition Righthand = Rightlowerarm.addOrReplaceChild("Righthand", CubeListBuilder.create().texOffs(18, 17).addBox(-2.5F, -0.5F, -8.0F, 5.0F, 2.0F, 9.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.2306F, 7.861F, -0.8747F, 0.1783F, -0.3264F, -0.3394F));

		PartDefinition Rightthumb = Righthand.addOrReplaceChild("Rightthumb", CubeListBuilder.create().texOffs(58, 29).addBox(-0.5F, -0.5F, -4.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.2F, 0.7F, -1.5F, 0.0F, 0.6793F, 0.0F));

		PartDefinition Leftupperarm = Bodyfront.addOrReplaceChild("Leftupperarm", CubeListBuilder.create().texOffs(0, 26).mirror().addBox(-1.1754F, -1.0098F, -0.6481F, 2.0F, 7.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-5.0F, 6.1961F, -6.4741F, 0.9226F, -0.0392F, 0.0994F));

		PartDefinition Leftlowerarm = Leftupperarm.addOrReplaceChild("Leftlowerarm", CubeListBuilder.create().texOffs(45, 54).mirror().addBox(-1.2694F, -0.239F, -0.3747F, 2.0F, 9.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(38, 54).mirror().addBox(-1.2694F, -0.239F, -2.1747F, 2.0F, 9.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.3346F, 5.4902F, 0.3519F, -0.7098F, -0.1651F, -0.4196F));

		PartDefinition Lefthand = Leftlowerarm.addOrReplaceChild("Lefthand", CubeListBuilder.create().texOffs(18, 17).mirror().addBox(-2.5F, -0.5F, -8.0F, 5.0F, 2.0F, 9.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.2306F, 7.861F, -0.8747F, 0.1783F, 0.3264F, 0.3394F));

		PartDefinition Leftthumb = Lefthand.addOrReplaceChild("Leftthumb", CubeListBuilder.create().texOffs(58, 29).mirror().addBox(-0.5F, -0.5F, -4.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(2.2F, 0.7F, -1.5F, 0.0F, -0.6793F, 0.0F));

		PartDefinition Rightthigh = Hips.addOrReplaceChild("Rightthigh", CubeListBuilder.create().texOffs(15, 51).addBox(-0.5892F, -0.4822F, -1.2552F, 2.0F, 10.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.0F, -3.9941F, 9.5588F, -1.25F, -0.5519F, -0.1061F));

		PartDefinition Rightshin = Rightthigh.addOrReplaceChild("Rightshin", CubeListBuilder.create().texOffs(31, 54).addBox(-1.2F, 0.0F, 0.0F, 2.0F, 10.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(24, 54).addBox(-1.2F, 0.0F, 2.0F, 2.0F, 10.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4108F, 9.5178F, -1.2552F, 1.6368F, 0.0F, 0.1061F));

		PartDefinition Righthindfoot = Rightshin.addOrReplaceChild("Righthindfoot", CubeListBuilder.create().texOffs(0, 0).addBox(-2.5F, -0.5F, -7.5F, 5.0F, 2.0F, 9.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 9.0F, 2.5F, 0.219F, 0.0308F, -0.1931F));

		PartDefinition Rightopposabletoe = Righthindfoot.addOrReplaceChild("Rightopposabletoe", CubeListBuilder.create().texOffs(58, 3).addBox(-0.5F, -0.5F, -4.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.2F, 0.7F, -1.5F, 0.0F, 0.6793F, 0.0F));

		PartDefinition Leftthigh = Hips.addOrReplaceChild("Leftthigh", CubeListBuilder.create().texOffs(15, 51).mirror().addBox(-1.4108F, -0.4822F, -1.2552F, 2.0F, 10.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-3.0F, -3.9941F, 9.5588F, -1.25F, 0.5519F, 0.1061F));

		PartDefinition Leftshin = Leftthigh.addOrReplaceChild("Leftshin", CubeListBuilder.create().texOffs(31, 54).mirror().addBox(-0.8F, 0.0F, 0.0F, 2.0F, 10.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(24, 54).mirror().addBox(-0.8F, 0.0F, 2.0F, 2.0F, 10.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4108F, 9.5178F, -1.2552F, 1.6368F, 0.0F, -0.1061F));

		PartDefinition Lefthindfoot = Leftshin.addOrReplaceChild("Lefthindfoot", CubeListBuilder.create().texOffs(0, 0).mirror().addBox(-2.5F, -0.5F, -7.5F, 5.0F, 2.0F, 9.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 9.0F, 2.5F, 0.219F, -0.0308F, 0.1931F));

		PartDefinition Leftopposabletoe = Lefthindfoot.addOrReplaceChild("Leftopposabletoe", CubeListBuilder.create().texOffs(58, 3).mirror().addBox(-0.5F, -0.5F, -4.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(2.2F, 0.7F, -1.5F, 0.0F, -0.6793F, 0.0F));

		return LayerDefinition.create(meshdefinition, 75, 75);
	}

	@Override
	public void setupAnim(float p_170950_, float p_170951_, float p_170952_) {		
		this.root.yRot = p_170951_ * ((float)Math.PI / 180F);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
		root.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}
}