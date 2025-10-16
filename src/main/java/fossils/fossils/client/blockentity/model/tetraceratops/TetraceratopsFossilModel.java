package fossils.fossils.client.blockentity.model.tetraceratops;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.SkullModelBase;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;

@SuppressWarnings("unused")
public class TetraceratopsFossilModel extends SkullModelBase {
	private final ModelPart fossil;
	private final ModelPart Tetraceratops;
	private final ModelPart hips;
	private final ModelPart Rightthigh;
	private final ModelPart Rightshin;
	private final ModelPart leftFoot3;
	private final ModelPart leftFoot4;
	private final ModelPart Leftthigh;
	private final ModelPart Leftshin;
	private final ModelPart rightFoot3;
	private final ModelPart rightFoot4;
	private final ModelPart bone2;
	private final ModelPart bone4;
	private final ModelPart tail;
	private final ModelPart tail2;
	private final ModelPart tail3;
	private final ModelPart tail4;
	private final ModelPart tail5;
	private final ModelPart tail6;
	private final ModelPart tail7;
	private final ModelPart tail8;
	private final ModelPart tail9;
	private final ModelPart tail10;
	private final ModelPart body;
	private final ModelPart body2;
	private final ModelPart body3;
	private final ModelPart body4;
	private final ModelPart chest;
	private final ModelPart Rightupperarm;
	private final ModelPart Rightlowerarm;
	private final ModelPart leftFoot;
	private final ModelPart leftFoot2;
	private final ModelPart Leftupperarm;
	private final ModelPart Leftlowerarm;
	private final ModelPart rightFoot;
	private final ModelPart rightFoot2;
	private final ModelPart bone;
	private final ModelPart bone3;
	private final ModelPart neck;
	private final ModelPart head;
	private final ModelPart leftFace;
	private final ModelPart rightFace;
	private final ModelPart lower_jaw;

	public TetraceratopsFossilModel(ModelPart root) {
		this.fossil = root.getChild("fossil");
		this.Tetraceratops = this.fossil.getChild("Tetraceratops");
		this.hips = this.Tetraceratops.getChild("hips");
		this.Rightthigh = this.hips.getChild("Rightthigh");
		this.Rightshin = this.Rightthigh.getChild("Rightshin");
		this.leftFoot3 = this.Rightshin.getChild("leftFoot3");
		this.leftFoot4 = this.leftFoot3.getChild("leftFoot4");
		this.Leftthigh = this.hips.getChild("Leftthigh");
		this.Leftshin = this.Leftthigh.getChild("Leftshin");
		this.rightFoot3 = this.Leftshin.getChild("rightFoot3");
		this.rightFoot4 = this.rightFoot3.getChild("rightFoot4");
		this.bone2 = this.hips.getChild("bone2");
		this.bone4 = this.hips.getChild("bone4");
		this.tail = this.hips.getChild("tail");
		this.tail2 = this.tail.getChild("tail2");
		this.tail3 = this.tail2.getChild("tail3");
		this.tail4 = this.tail3.getChild("tail4");
		this.tail5 = this.tail4.getChild("tail5");
		this.tail6 = this.tail5.getChild("tail6");
		this.tail7 = this.tail6.getChild("tail7");
		this.tail8 = this.tail7.getChild("tail8");
		this.tail9 = this.tail8.getChild("tail9");
		this.tail10 = this.tail9.getChild("tail10");
		this.body = this.hips.getChild("body");
		this.body2 = this.body.getChild("body2");
		this.body3 = this.body2.getChild("body3");
		this.body4 = this.body3.getChild("body4");
		this.chest = this.body4.getChild("chest");
		this.Rightupperarm = this.chest.getChild("Rightupperarm");
		this.Rightlowerarm = this.Rightupperarm.getChild("Rightlowerarm");
		this.leftFoot = this.Rightlowerarm.getChild("leftFoot");
		this.leftFoot2 = this.leftFoot.getChild("leftFoot2");
		this.Leftupperarm = this.chest.getChild("Leftupperarm");
		this.Leftlowerarm = this.Leftupperarm.getChild("Leftlowerarm");
		this.rightFoot = this.Leftlowerarm.getChild("rightFoot");
		this.rightFoot2 = this.rightFoot.getChild("rightFoot2");
		this.bone = this.chest.getChild("bone");
		this.bone3 = this.chest.getChild("bone3");
		this.neck = this.chest.getChild("neck");
		this.head = this.neck.getChild("head");
		this.leftFace = this.head.getChild("leftFace");
		this.rightFace = this.head.getChild("rightFace");
		this.lower_jaw = this.head.getChild("lower_jaw");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition fossil = partdefinition.addOrReplaceChild("fossil", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition Tetraceratops = fossil.addOrReplaceChild("Tetraceratops", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -11.6973F, -0.939F, -0.0873F, 0.0F, 0.0F));

		PartDefinition hips = Tetraceratops.addOrReplaceChild("hips", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -4.279F, 18.3157F, 0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r1 = hips.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(53, 97).addBox(0.0F, -1.9963F, 0.0626F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.0F, -0.7266F, 2.8245F, -0.3316F, 0.0F, 0.0F));

		PartDefinition cube_r2 = hips.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(47, 97).addBox(0.0F, -2.3051F, 0.0273F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.0F, -1.2266F, 0.9245F, -0.3316F, 0.0F, 0.0F));

		PartDefinition cube_r3 = hips.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(22, 59).addBox(0.0F, -2.6139F, -0.0081F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.0F, -1.7266F, -0.9755F, -0.3491F, 0.0F, 0.0F));

		PartDefinition cube_r4 = hips.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(19, 31).addBox(0.0F, -2.8227F, -0.0434F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.0F, -2.2266F, -2.8755F, -0.3665F, 0.0F, 0.0F));

		PartDefinition Bodyfront_r1 = hips.addOrReplaceChild("Bodyfront_r1", CubeListBuilder.create().texOffs(99, 59).mirror().addBox(-1.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -1.8502F, -2.5333F, -0.2852F, -0.1342F, -0.6243F));

		PartDefinition Bodyfront_r2 = hips.addOrReplaceChild("Bodyfront_r2", CubeListBuilder.create().texOffs(89, 20).mirror().addBox(-2.9397F, -0.3395F, -0.5417F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -1.8502F, -2.5333F, -0.2295F, -0.1817F, -0.9746F));

		PartDefinition cube_r5 = hips.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(44, 0).mirror().addBox(-2.4F, -0.5904F, 1.891F, 2.0F, 0.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(44, 0).addBox(0.4F, -0.5904F, 1.891F, 2.0F, 0.0F, 5.0F, new CubeDeformation(0.0F))
				.texOffs(23, 16).addBox(-0.5F, -1.0904F, -0.109F, 1.0F, 1.0F, 8.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.0F, -1.2266F, -3.0755F, -0.2618F, 0.0F, 0.0F));

		PartDefinition Bodyfront_r3 = hips.addOrReplaceChild("Bodyfront_r3", CubeListBuilder.create().texOffs(89, 20).addBox(0.9397F, -0.3395F, -0.5417F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -1.8502F, -2.5333F, -0.2295F, 0.1817F, 0.9746F));

		PartDefinition Bodyfront_r4 = hips.addOrReplaceChild("Bodyfront_r4", CubeListBuilder.create().texOffs(99, 59).addBox(0.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -1.8502F, -2.5333F, -0.2852F, 0.1342F, 0.6243F));

		PartDefinition Rightthigh = hips.addOrReplaceChild("Rightthigh", CubeListBuilder.create().texOffs(77, 0).addBox(-0.3136F, -0.6328F, -0.6681F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(2.3046F, 2.4699F, 0.4417F, -0.4794F, 0.3791F, -0.6442F));

		PartDefinition Rightthigh_r1 = Rightthigh.addOrReplaceChild("Rightthigh_r1", CubeListBuilder.create().texOffs(93, 97).addBox(-0.5F, 2.375F, -0.625F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(27, 92).addBox(-0.5F, 0.375F, -0.625F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.1864F, 3.4672F, -0.1681F, -0.1302F, -0.0079F, -0.0004F));

		PartDefinition Rightthigh_r2 = Rightthigh.addOrReplaceChild("Rightthigh_r2", CubeListBuilder.create().texOffs(88, 97).addBox(-0.5F, -0.3F, -0.925F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.1787F, 5.0552F, 0.9001F, 1.0916F, -0.0079F, -0.0004F));

		PartDefinition Rightthigh_r3 = Rightthigh.addOrReplaceChild("Rightthigh_r3", CubeListBuilder.create().texOffs(17, 91).addBox(-0.5F, -1.4F, -1.1F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(0.1845F, 5.1264F, 0.171F, 2.0515F, -0.0079F, -0.0004F));

		PartDefinition Rightthigh_r4 = Rightthigh.addOrReplaceChild("Rightthigh_r4", CubeListBuilder.create().texOffs(22, 92).addBox(-0.5F, 0.275F, -0.75F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(0.1864F, 3.4672F, -0.1681F, 0.3498F, -0.0079F, -0.0004F));

		PartDefinition Rightthigh_r5 = Rightthigh.addOrReplaceChild("Rightthigh_r5", CubeListBuilder.create().texOffs(57, 83).addBox(-0.5F, -1.625F, -0.65F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.1864F, 2.8672F, -0.1681F, -0.0865F, -0.0079F, -0.0004F));

		PartDefinition Rightthigh_r6 = Rightthigh.addOrReplaceChild("Rightthigh_r6", CubeListBuilder.create().texOffs(88, 46).addBox(-0.5F, -1.1F, -1.3F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.1864F, 2.3672F, 0.8319F, -0.7418F, 0.0F, 0.0F));

		PartDefinition Rightshin = Rightthigh.addOrReplaceChild("Rightshin", CubeListBuilder.create(), PartPose.offsetAndRotation(0.6347F, 7.0502F, -0.6217F, 1.0841F, -1.0933F, -0.6303F));

		PartDefinition Rightshin_r1 = Rightshin.addOrReplaceChild("Rightshin_r1", CubeListBuilder.create().texOffs(0, 86).addBox(-0.5901F, 0.8698F, 0.4046F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.198F)), PartPose.offsetAndRotation(0.6826F, 3.0105F, 0.6973F, -0.2618F, 1.3526F, 0.0F));

		PartDefinition Rightshin_r2 = Rightshin.addOrReplaceChild("Rightshin_r2", CubeListBuilder.create().texOffs(81, 85).addBox(-0.5901F, 0.6748F, 0.6356F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.6826F, 3.0105F, 0.6973F, -0.48F, 1.3526F, 0.0F));

		PartDefinition Rightshin_r3 = Rightshin.addOrReplaceChild("Rightshin_r3", CubeListBuilder.create().texOffs(42, 92).addBox(-0.5901F, -1.6148F, 0.3721F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(7, 85).addBox(-0.4039F, -3.6571F, -1.6073F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.4576F, 4.0105F, 0.6473F, -0.2182F, 1.3526F, 0.0F));

		PartDefinition Rightshin_r4 = Rightshin.addOrReplaceChild("Rightshin_r4", CubeListBuilder.create().texOffs(86, 85).addBox(-0.5901F, -3.934F, 0.6637F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.198F)), PartPose.offsetAndRotation(0.4576F, 4.0105F, 0.6473F, 0.0F, 1.3526F, 0.0F));

		PartDefinition Rightshin_r5 = Rightshin.addOrReplaceChild("Rightshin_r5", CubeListBuilder.create().texOffs(38, 86).addBox(-0.4039F, -3.2277F, -1.8008F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4576F, 4.0105F, 0.6473F, -0.5672F, 1.3526F, 0.0F));

		PartDefinition Rightshin_r6 = Rightshin.addOrReplaceChild("Rightshin_r6", CubeListBuilder.create().texOffs(17, 86).addBox(-0.4039F, -0.9602F, -1.507F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(0.4576F, 4.0105F, 0.6473F, -0.0873F, 1.3526F, 0.0F));

		PartDefinition leftFoot3 = Rightshin.addOrReplaceChild("leftFoot3", CubeListBuilder.create().texOffs(57, 26).addBox(0.0F, -0.4F, -2.1F, 2.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0562F, 6.1685F, 0.6928F, 2.7388F, 0.6285F, 2.9398F));

		PartDefinition leftFoot4 = leftFoot3.addOrReplaceChild("leftFoot4", CubeListBuilder.create().texOffs(0, 31).addBox(0.0F, -1.0F, -3.0F, 5.0F, 1.0F, 4.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(2.0F, 0.6F, 0.9F, 0.0F, 0.0F, -0.3054F));

		PartDefinition Leftthigh = hips.addOrReplaceChild("Leftthigh", CubeListBuilder.create().texOffs(77, 0).mirror().addBox(-0.6864F, -0.6328F, -0.6681F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.007F)).mirror(false), PartPose.offsetAndRotation(-2.3046F, 2.4699F, 0.4417F, -0.0422F, 0.0006F, 0.3225F));

		PartDefinition Leftthigh_r1 = Leftthigh.addOrReplaceChild("Leftthigh_r1", CubeListBuilder.create().texOffs(93, 97).mirror().addBox(-0.5F, 2.375F, -0.625F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(27, 92).mirror().addBox(-0.5F, 0.375F, -0.625F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.1864F, 3.4672F, -0.1681F, -0.1302F, 0.0079F, 0.0004F));

		PartDefinition Leftthigh_r2 = Leftthigh.addOrReplaceChild("Leftthigh_r2", CubeListBuilder.create().texOffs(88, 97).mirror().addBox(-0.5F, -0.3F, -0.925F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.1787F, 5.0552F, 0.9001F, 1.0916F, 0.0079F, 0.0004F));

		PartDefinition Leftthigh_r3 = Leftthigh.addOrReplaceChild("Leftthigh_r3", CubeListBuilder.create().texOffs(17, 91).mirror().addBox(-0.5F, -1.4F, -1.1F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.007F)).mirror(false), PartPose.offsetAndRotation(-0.1845F, 5.1264F, 0.171F, 2.0515F, 0.0079F, 0.0004F));

		PartDefinition Leftthigh_r4 = Leftthigh.addOrReplaceChild("Leftthigh_r4", CubeListBuilder.create().texOffs(22, 92).mirror().addBox(-0.5F, 0.275F, -0.75F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(-0.1864F, 3.4672F, -0.1681F, 0.3498F, 0.0079F, 0.0004F));

		PartDefinition Leftthigh_r5 = Leftthigh.addOrReplaceChild("Leftthigh_r5", CubeListBuilder.create().texOffs(57, 83).mirror().addBox(-0.5F, -1.625F, -0.65F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.1864F, 2.8672F, -0.1681F, -0.0865F, 0.0079F, 0.0004F));

		PartDefinition Leftthigh_r6 = Leftthigh.addOrReplaceChild("Leftthigh_r6", CubeListBuilder.create().texOffs(88, 46).mirror().addBox(-0.5F, -1.1F, -1.3F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.1864F, 2.3672F, 0.8319F, -0.7418F, 0.0F, 0.0F));

		PartDefinition Leftshin = Leftthigh.addOrReplaceChild("Leftshin", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.6347F, 7.0502F, -0.6217F, 1.8742F, 0.6017F, 0.9179F));

		PartDefinition Leftshin_r1 = Leftshin.addOrReplaceChild("Leftshin_r1", CubeListBuilder.create().texOffs(0, 86).mirror().addBox(-0.4099F, 0.8698F, 0.4046F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.198F)).mirror(false), PartPose.offsetAndRotation(-0.6826F, 3.0105F, 0.6973F, -0.2618F, -1.3526F, 0.0F));

		PartDefinition Leftshin_r2 = Leftshin.addOrReplaceChild("Leftshin_r2", CubeListBuilder.create().texOffs(81, 85).mirror().addBox(-0.4099F, 0.6748F, 0.6356F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.6826F, 3.0105F, 0.6973F, -0.48F, -1.3526F, 0.0F));

		PartDefinition Leftshin_r3 = Leftshin.addOrReplaceChild("Leftshin_r3", CubeListBuilder.create().texOffs(42, 92).mirror().addBox(-0.4099F, -1.6148F, 0.3721F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(7, 85).mirror().addBox(-0.5961F, -3.6571F, -1.6073F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(-0.4576F, 4.0105F, 0.6473F, -0.2182F, -1.3526F, 0.0F));

		PartDefinition Leftshin_r4 = Leftshin.addOrReplaceChild("Leftshin_r4", CubeListBuilder.create().texOffs(86, 85).mirror().addBox(-0.4099F, -3.934F, 0.6637F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.198F)).mirror(false), PartPose.offsetAndRotation(-0.4576F, 4.0105F, 0.6473F, 0.0F, -1.3526F, 0.0F));

		PartDefinition Leftshin_r5 = Leftshin.addOrReplaceChild("Leftshin_r5", CubeListBuilder.create().texOffs(38, 86).mirror().addBox(-0.5961F, -3.2277F, -1.8008F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4576F, 4.0105F, 0.6473F, -0.5672F, -1.3526F, 0.0F));

		PartDefinition Leftshin_r6 = Leftshin.addOrReplaceChild("Leftshin_r6", CubeListBuilder.create().texOffs(17, 86).mirror().addBox(-0.5961F, -0.9602F, -1.507F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(-0.4576F, 4.0105F, 0.6473F, -0.0873F, -1.3526F, 0.0F));

		PartDefinition rightFoot3 = Leftshin.addOrReplaceChild("rightFoot3", CubeListBuilder.create().texOffs(57, 26).mirror().addBox(-2.0F, -0.4F, -2.1F, 2.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.0562F, 6.1685F, 0.6928F, 3.1284F, -0.7314F, 2.736F));

		PartDefinition rightFoot4 = rightFoot3.addOrReplaceChild("rightFoot4", CubeListBuilder.create().texOffs(0, 31).mirror().addBox(-5.0F, -1.0F, -3.0F, 5.0F, 1.0F, 4.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(-2.0F, 0.6F, 0.9F, 0.0F, 0.0F, 0.5672F));

		PartDefinition bone2 = hips.addOrReplaceChild("bone2", CubeListBuilder.create(), PartPose.offsetAndRotation(1.769F, 0.224F, 1.5557F, 0.0F, 0.0F, 0.3142F));

		PartDefinition Hips_r1 = bone2.addOrReplaceChild("Hips_r1", CubeListBuilder.create().texOffs(81, 73).addBox(-0.2F, -0.176F, -1.5202F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.0293F, -0.5596F, 1.4987F, 0.3142F, 0.0F, -0.0524F));

		PartDefinition Hips_r2 = bone2.addOrReplaceChild("Hips_r2", CubeListBuilder.create().texOffs(81, 69).addBox(-0.2F, -0.776F, -1.3202F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.0293F, -0.5596F, 1.4987F, -0.1222F, 0.0F, -0.0524F));

		PartDefinition Hips_r3 = bone2.addOrReplaceChild("Hips_r3", CubeListBuilder.create().texOffs(31, 65).addBox(-1.036F, -0.82F, -2.4619F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.9F, 1.2F, -0.8F, 1.5272F, 0.0F, 0.1745F));

		PartDefinition Hips_r4 = bone2.addOrReplaceChild("Hips_r4", CubeListBuilder.create().texOffs(77, 22).addBox(-1.036F, -1.3035F, -3.6344F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(0.9F, 1.2F, -0.8F, 1.789F, 0.0F, 0.1745F));

		PartDefinition Hips_r5 = bone2.addOrReplaceChild("Hips_r5", CubeListBuilder.create().texOffs(64, 81).addBox(-0.2F, -0.676F, -0.3202F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0564F, 1.0753F, -0.0245F, 0.829F, 0.0F, -0.0524F));

		PartDefinition Hips_r6 = bone2.addOrReplaceChild("Hips_r6", CubeListBuilder.create().texOffs(11, 65).addBox(-0.2F, -1.376F, -2.4202F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.1833F, 0.0F, -0.0524F));

		PartDefinition Hips_r7 = bone2.addOrReplaceChild("Hips_r7", CubeListBuilder.create().texOffs(77, 17).addBox(-0.8792F, -1.7271F, -1.9687F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.002F)), PartPose.offsetAndRotation(0.3F, 3.7F, -2.2F, 1.3614F, 0.0F, -0.1571F));

		PartDefinition Hips_r8 = bone2.addOrReplaceChild("Hips_r8", CubeListBuilder.create().texOffs(64, 37).addBox(-0.5F, -1.2F, -1.6F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.077F, 5.1905F, -0.7083F, -0.1658F, 0.0F, -0.192F));

		PartDefinition Hips_r9 = bone2.addOrReplaceChild("Hips_r9", CubeListBuilder.create().texOffs(7, 79).addBox(-0.9024F, 1.0039F, 0.2595F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.3F, 3.7F, -2.2F, -1.3872F, -0.0113F, -0.1558F));

		PartDefinition Hips_r10 = bone2.addOrReplaceChild("Hips_r10", CubeListBuilder.create().texOffs(33, 86).addBox(-0.9024F, 0.6874F, -1.4806F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(0.3F, 3.7F, -2.2F, -0.9509F, -0.0113F, -0.1558F));

		PartDefinition Hips_r11 = bone2.addOrReplaceChild("Hips_r11", CubeListBuilder.create().texOffs(49, 65).addBox(-0.5F, -1.325F, -0.6F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-0.0334F, 3.4072F, -3.3058F, -0.384F, 0.0F, 0.1745F));

		PartDefinition Hips_r12 = bone2.addOrReplaceChild("Hips_r12", CubeListBuilder.create().texOffs(74, 75).addBox(-1.036F, 0.4125F, -1.2992F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.9F, 1.2F, -0.8F, -0.733F, 0.0F, 0.1745F));

		PartDefinition Hips_r13 = bone2.addOrReplaceChild("Hips_r13", CubeListBuilder.create().texOffs(93, 64).addBox(-0.5F, -0.725F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.1469F, 5.5497F, 1.9657F, 2.426F, 0.0F, -0.192F));

		PartDefinition Hips_r14 = bone2.addOrReplaceChild("Hips_r14", CubeListBuilder.create().texOffs(79, 5).addBox(-0.8914F, -0.8293F, -0.9286F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.3F, 3.5F, -0.8F, 1.2527F, 0.0385F, -0.0208F));

		PartDefinition Hips_r15 = bone2.addOrReplaceChild("Hips_r15", CubeListBuilder.create().texOffs(94, 33).addBox(-1.0414F, 2.8898F, -0.1171F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.3F, 3.5F, -0.8F, 0.9861F, 0.0F, -0.192F));

		PartDefinition Hips_r16 = bone2.addOrReplaceChild("Hips_r16", CubeListBuilder.create().texOffs(74, 48).addBox(-1.0414F, 0.416F, 1.1081F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.3F, 3.5F, -0.8F, -0.1658F, 0.0F, -0.192F));

		PartDefinition bone4 = hips.addOrReplaceChild("bone4", CubeListBuilder.create(), PartPose.offsetAndRotation(-1.769F, 0.224F, 1.5557F, 0.0F, 0.0F, -0.3142F));

		PartDefinition Hips_r17 = bone4.addOrReplaceChild("Hips_r17", CubeListBuilder.create().texOffs(81, 73).mirror().addBox(-0.8F, -0.176F, -1.5202F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0293F, -0.5596F, 1.4987F, 0.3142F, 0.0F, 0.0524F));

		PartDefinition Hips_r18 = bone4.addOrReplaceChild("Hips_r18", CubeListBuilder.create().texOffs(81, 69).mirror().addBox(-0.8F, -0.776F, -1.3202F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0293F, -0.5596F, 1.4987F, -0.1222F, 0.0F, 0.0524F));

		PartDefinition Hips_r19 = bone4.addOrReplaceChild("Hips_r19", CubeListBuilder.create().texOffs(31, 65).mirror().addBox(0.036F, -0.82F, -2.4619F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.9F, 1.2F, -0.8F, 1.5272F, 0.0F, -0.1745F));

		PartDefinition Hips_r20 = bone4.addOrReplaceChild("Hips_r20", CubeListBuilder.create().texOffs(77, 22).mirror().addBox(0.036F, -1.3035F, -3.6344F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(-0.9F, 1.2F, -0.8F, 1.789F, 0.0F, -0.1745F));

		PartDefinition Hips_r21 = bone4.addOrReplaceChild("Hips_r21", CubeListBuilder.create().texOffs(64, 81).mirror().addBox(-0.8F, -0.676F, -0.3202F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.0564F, 1.0753F, -0.0245F, 0.829F, 0.0F, 0.0524F));

		PartDefinition Hips_r22 = bone4.addOrReplaceChild("Hips_r22", CubeListBuilder.create().texOffs(11, 65).mirror().addBox(-0.8F, -1.376F, -2.4202F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.007F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.1833F, 0.0F, 0.0524F));

		PartDefinition Hips_r23 = bone4.addOrReplaceChild("Hips_r23", CubeListBuilder.create().texOffs(77, 17).mirror().addBox(-0.1208F, -1.7271F, -1.9687F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.002F)).mirror(false), PartPose.offsetAndRotation(-0.3F, 3.7F, -2.2F, 1.3614F, 0.0F, 0.1571F));

		PartDefinition Hips_r24 = bone4.addOrReplaceChild("Hips_r24", CubeListBuilder.create().texOffs(64, 37).mirror().addBox(-0.5F, -1.2F, -1.6F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(-0.077F, 5.1905F, -0.7083F, -0.1658F, 0.0F, 0.192F));

		PartDefinition Hips_r25 = bone4.addOrReplaceChild("Hips_r25", CubeListBuilder.create().texOffs(7, 79).mirror().addBox(-0.0976F, 1.0039F, 0.2595F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(-0.3F, 3.7F, -2.2F, -1.3872F, 0.0113F, 0.1558F));

		PartDefinition Hips_r26 = bone4.addOrReplaceChild("Hips_r26", CubeListBuilder.create().texOffs(33, 86).mirror().addBox(-0.0976F, 0.6874F, -1.4806F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(-0.3F, 3.7F, -2.2F, -0.9509F, 0.0113F, 0.1558F));

		PartDefinition Hips_r27 = bone4.addOrReplaceChild("Hips_r27", CubeListBuilder.create().texOffs(49, 65).mirror().addBox(-0.5F, -1.325F, -0.6F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(0.0334F, 3.4072F, -3.3058F, -0.384F, 0.0F, -0.1745F));

		PartDefinition Hips_r28 = bone4.addOrReplaceChild("Hips_r28", CubeListBuilder.create().texOffs(74, 75).mirror().addBox(0.036F, 0.4125F, -1.2992F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(-0.9F, 1.2F, -0.8F, -0.733F, 0.0F, -0.1745F));

		PartDefinition Hips_r29 = bone4.addOrReplaceChild("Hips_r29", CubeListBuilder.create().texOffs(93, 64).mirror().addBox(-0.5F, -0.725F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.1469F, 5.5497F, 1.9657F, 2.426F, 0.0F, 0.192F));

		PartDefinition Hips_r30 = bone4.addOrReplaceChild("Hips_r30", CubeListBuilder.create().texOffs(79, 5).mirror().addBox(-0.1086F, -0.8293F, -0.9286F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.3F, 3.5F, -0.8F, 1.2527F, -0.0385F, 0.0208F));

		PartDefinition Hips_r31 = bone4.addOrReplaceChild("Hips_r31", CubeListBuilder.create().texOffs(94, 33).mirror().addBox(0.0414F, 2.8898F, -0.1171F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(-0.3F, 3.5F, -0.8F, 0.9861F, 0.0F, 0.192F));

		PartDefinition Hips_r32 = bone4.addOrReplaceChild("Hips_r32", CubeListBuilder.create().texOffs(74, 48).mirror().addBox(0.0414F, 0.416F, 1.1081F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(-0.3F, 3.5F, -0.8F, -0.1658F, 0.0F, 0.192F));

		PartDefinition tail = hips.addOrReplaceChild("tail", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.6542F, 4.6243F, 0.112F, -0.1735F, -0.0194F));

		PartDefinition cube_r6 = tail.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(56, 98).addBox(0.0F, -1.2332F, -0.0313F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 2.5844F, 7.6155F, -0.4887F, 0.0F, 0.0F));

		PartDefinition cube_r7 = tail.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(98, 45).addBox(0.0F, -1.2782F, -0.0196F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.6844F, 5.8155F, -0.5236F, 0.0F, 0.0F));

		PartDefinition cube_r8 = tail.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(98, 41).addBox(0.0F, -1.5562F, 0.0405F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.8844F, 3.9155F, -0.5411F, 0.0F, 0.0F));

		PartDefinition cube_r9 = tail.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(39, 98).addBox(0.0F, -1.7496F, -0.0807F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0844F, 2.2155F, -0.5672F, 0.0F, 0.0F));

		PartDefinition cube_r10 = tail.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(36, 98).addBox(0.0F, 4.5631F, 7.6217F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(33, 98).addBox(0.0F, 3.6631F, 5.6217F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(30, 98).addBox(0.0F, 2.5631F, 3.6217F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.8156F, 0.3155F, 0.0087F, 0.0F, 0.0F));

		PartDefinition cube_r11 = tail.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(15, 98).addBox(0.0F, -1.8369F, 0.0217F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.8156F, 0.3155F, -0.5585F, 0.0F, 0.0F));

		PartDefinition cube_r12 = tail.addOrReplaceChild("cube_r12", CubeListBuilder.create().texOffs(0, 12).mirror().addBox(-1.6F, 0.0F, 0.0F, 2.0F, 0.0F, 9.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.3867F, 0.1394F, -0.4369F, 0.0475F, -0.0221F));

		PartDefinition cube_r13 = tail.addOrReplaceChild("cube_r13", CubeListBuilder.create().texOffs(0, 12).addBox(-0.4F, 0.0F, 0.0F, 2.0F, 0.0F, 9.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.3867F, 0.1394F, -0.4369F, -0.0475F, 0.0221F));

		PartDefinition cube_r14 = tail.addOrReplaceChild("cube_r14", CubeListBuilder.create().texOffs(0, 0).addBox(-0.5F, -0.9432F, -0.401F, 1.0F, 1.0F, 10.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.1844F, 0.3155F, -0.4363F, 0.0F, 0.0F));

		PartDefinition tail2 = tail.addOrReplaceChild("tail2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 3.8392F, 9.1501F, -0.1642F, -0.1744F, 0.0058F));

		PartDefinition cube_r15 = tail2.addOrReplaceChild("cube_r15", CubeListBuilder.create().texOffs(91, 100).addBox(0.0F, -1.2F, -0.1F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.0F, 1.1976F, 3.8945F, -0.4189F, 0.0F, 0.0F));

		PartDefinition cube_r16 = tail2.addOrReplaceChild("cube_r16", CubeListBuilder.create().texOffs(98, 99).addBox(0.0F, -1.053F, 0.0375F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.0F, 0.2344F, 1.9704F, -0.4538F, 0.0F, 0.0F));

		PartDefinition cube_r17 = tail2.addOrReplaceChild("cube_r17", CubeListBuilder.create().texOffs(99, 94).addBox(0.0F, 0.4F, 0.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.8892F, 4.8447F, 0.0785F, 0.0F, 0.0F));

		PartDefinition cube_r18 = tail2.addOrReplaceChild("cube_r18", CubeListBuilder.create().texOffs(59, 98).addBox(0.0F, -0.3F, 0.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.3067F, 2.8395F, 0.1396F, 0.0F, 0.0F));

		PartDefinition cube_r19 = tail2.addOrReplaceChild("cube_r19", CubeListBuilder.create().texOffs(50, 99).addBox(0.0F, -0.2F, 0.1F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.7251F, 0.7344F, 0.096F, 0.0F, 0.0F));

		PartDefinition cube_r20 = tail2.addOrReplaceChild("cube_r20", CubeListBuilder.create().texOffs(82, 99).addBox(0.0F, -1.1169F, 0.0026F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.0F, -0.5656F, 0.1704F, -0.4538F, 0.0F, 0.0F));

		PartDefinition cube_r21 = tail2.addOrReplaceChild("cube_r21", CubeListBuilder.create().texOffs(26, 58).mirror().addBox(-1.3F, 0.2F, -4.5F, 1.0F, 0.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 1.3344F, 4.2704F, -0.3493F, 0.0328F, -0.0119F));

		PartDefinition cube_r22 = tail2.addOrReplaceChild("cube_r22", CubeListBuilder.create().texOffs(26, 58).addBox(0.3F, 0.2F, -4.5F, 1.0F, 0.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.3344F, 4.2704F, -0.3493F, -0.0328F, 0.0119F));

		PartDefinition cube_r23 = tail2.addOrReplaceChild("cube_r23", CubeListBuilder.create().texOffs(42, 24).addBox(-0.5F, -0.3F, -4.5F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.0F, 1.3344F, 4.2704F, -0.3491F, 0.0F, 0.0F));

		PartDefinition tail3 = tail2.addOrReplaceChild("tail3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 1.9117F, 5.6011F, -0.167F, -0.136F, -0.0341F));

		PartDefinition cube_r24 = tail3.addOrReplaceChild("cube_r24", CubeListBuilder.create().texOffs(99, 88).addBox(-0.5F, -1.0257F, -0.0177F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 1.043F, 3.8453F, -0.3054F, 0.0F, 0.0F));

		PartDefinition cube_r25 = tail3.addOrReplaceChild("cube_r25", CubeListBuilder.create().texOffs(100, 49).addBox(0.0F, 7.5631F, 15.6217F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(5, 100).addBox(0.0F, 7.9631F, 17.6217F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -6.5665F, -14.4357F, 0.0087F, 0.0F, 0.0F));

		PartDefinition cube_r26 = tail3.addOrReplaceChild("cube_r26", CubeListBuilder.create().texOffs(85, 99).addBox(-0.5F, -0.9257F, -0.0177F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.3589F, 1.9659F, -0.3142F, 0.0F, 0.0F));

		PartDefinition cube_r27 = tail3.addOrReplaceChild("cube_r27", CubeListBuilder.create().texOffs(47, 82).addBox(-0.5F, -0.8257F, -0.0177F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.3251F, 0.0865F, -0.3054F, 0.0F, 0.0F));

		PartDefinition cube_r28 = tail3.addOrReplaceChild("cube_r28", CubeListBuilder.create().texOffs(34, 36).addBox(-1.0F, -0.95F, -2.75F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 1.2749F, 2.4865F, -0.2618F, 0.0F, 0.0F));

		PartDefinition tail4 = tail3.addOrReplaceChild("tail4", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 1.8214F, 5.7215F, -0.0962F, 0.1303F, -0.0125F));

		PartDefinition cube_r29 = tail4.addOrReplaceChild("cube_r29", CubeListBuilder.create().texOffs(100, 67).addBox(0.0F, -0.893F, 3.8866F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.001F))
				.texOffs(65, 100).addBox(0.0F, -0.893F, 1.8866F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.001F))
				.texOffs(62, 100).addBox(0.0F, -0.968F, -0.1134F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.0F, -0.2166F, 0.0062F, -0.1222F, 0.0F, 0.0F));

		PartDefinition cube_r30 = tail4.addOrReplaceChild("cube_r30", CubeListBuilder.create().texOffs(100, 55).addBox(0.0F, 0.2F, 3.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(94, 100).addBox(0.0F, -0.1F, 1.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(100, 52).addBox(0.0F, -0.5F, -0.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.3993F, 0.0419F, 0.096F, 0.0F, 0.0F));

		PartDefinition cube_r31 = tail4.addOrReplaceChild("cube_r31", CubeListBuilder.create().texOffs(41, 44).addBox(-0.5F, 1.75F, -6.25F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.0F, -1.8166F, 6.3062F, -0.0873F, 0.0F, 0.0F));

		PartDefinition tail5 = tail4.addOrReplaceChild("tail5", CubeListBuilder.create().texOffs(0, 45).addBox(-0.5F, -0.5325F, 0.0188F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F))
				.texOffs(100, 73).addBox(0.0F, -0.8325F, 1.0188F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(100, 76).addBox(0.0F, -0.8325F, 3.0188F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.2931F, 4.8349F, -0.0095F, 0.3491F, -0.0033F));

		PartDefinition cube_r32 = tail5.addOrReplaceChild("cube_r32", CubeListBuilder.create().texOffs(100, 70).addBox(0.0F, 0.5F, 7.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(68, 100).addBox(0.0F, 0.4F, 5.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.1062F, -4.793F, 0.096F, 0.0F, 0.0F));

		PartDefinition tail6 = tail5.addOrReplaceChild("tail6", CubeListBuilder.create().texOffs(49, 32).addBox(-0.5F, -0.5325F, 0.0188F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0146F, 4.9356F, 0.0449F, 0.2615F, 0.0116F));

		PartDefinition cube_r33 = tail6.addOrReplaceChild("cube_r33", CubeListBuilder.create().texOffs(99, 91).addBox(0.0F, 1.025F, 13.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(88, 100).addBox(0.0F, 0.825F, 11.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(100, 79).addBox(0.0F, 0.65F, 9.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0916F, -9.7286F, 0.096F, 0.0F, 0.0F));

		PartDefinition tail7 = tail6.addOrReplaceChild("tail7", CubeListBuilder.create().texOffs(28, 51).addBox(-0.5F, -0.5325F, 0.0188F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.0111F, 5.0006F, -0.0545F, 0.2614F, -0.0141F));

		PartDefinition tail8 = tail7.addOrReplaceChild("tail8", CubeListBuilder.create().texOffs(54, 51).addBox(-0.5F, -0.5325F, 0.0188F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.0115F, 5.001F, -0.0192F, 0.3926F, -0.0073F));

		PartDefinition tail9 = tail8.addOrReplaceChild("tail9", CubeListBuilder.create().texOffs(41, 51).addBox(-0.5F, -0.5325F, 0.0188F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.0115F, 5.001F, -0.0725F, 0.2611F, -0.0188F));

		PartDefinition tail10 = tail9.addOrReplaceChild("tail10", CubeListBuilder.create().texOffs(42, 16).addBox(-0.5F, -0.5325F, 0.0188F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0205F, 4.9357F, -0.0745F, 0.3482F, -0.0255F));

		PartDefinition body = hips.addOrReplaceChild("body", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -1.3823F, -3.1544F, -0.1752F, 0.0859F, -0.0152F));

		PartDefinition cube_r34 = body.addOrReplaceChild("cube_r34", CubeListBuilder.create().texOffs(58, 65).addBox(0.0F, -2.9336F, 0.0403F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.0254F, -1.9819F, -0.1571F, 0.0F, 0.0F));

		PartDefinition cube_r35 = body.addOrReplaceChild("cube_r35", CubeListBuilder.create().texOffs(77, 87).addBox(0.0F, -3.121F, 0.0427F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.1254F, -3.9819F, -0.192F, 0.0F, 0.0F));

		PartDefinition Bodyfront_r5 = body.addOrReplaceChild("Bodyfront_r5", CubeListBuilder.create().texOffs(42, 99).mirror().addBox(-1.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.6679F, -1.4788F, -0.0735F, 0.0207F, -0.6364F));

		PartDefinition Bodyfront_r6 = body.addOrReplaceChild("Bodyfront_r6", CubeListBuilder.create().texOffs(99, 36).mirror().addBox(-3.586F, -1.4386F, -0.5417F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.6679F, -1.4788F, -0.091F, 0.0014F, -1.3765F));

		PartDefinition Bodyfront_r7 = body.addOrReplaceChild("Bodyfront_r7", CubeListBuilder.create().texOffs(89, 18).mirror().addBox(-2.9397F, -0.3395F, -0.5417F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.6679F, -1.4788F, -0.0835F, 0.0361F, -0.9853F));

		PartDefinition Bodyfront_r8 = body.addOrReplaceChild("Bodyfront_r8", CubeListBuilder.create().texOffs(99, 34).mirror().addBox(-1.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.6679F, -3.4788F, -0.0595F, 0.0311F, -0.636F));

		PartDefinition Bodyfront_r9 = body.addOrReplaceChild("Bodyfront_r9", CubeListBuilder.create().texOffs(89, 16).mirror().addBox(-4.586F, -1.4386F, -0.5417F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.6679F, -3.4788F, -0.0876F, 0.0185F, -1.3765F));

		PartDefinition Bodyfront_r10 = body.addOrReplaceChild("Bodyfront_r10", CubeListBuilder.create().texOffs(89, 14).mirror().addBox(-2.9397F, -0.3395F, -0.5417F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.6679F, -3.4788F, -0.0739F, 0.0506F, -0.9848F));

		PartDefinition Bodyfront_r11 = body.addOrReplaceChild("Bodyfront_r11", CubeListBuilder.create().texOffs(99, 32).mirror().addBox(-1.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.5678F, -5.4788F, -0.0454F, 0.0414F, -0.6355F));

		PartDefinition Bodyfront_r12 = body.addOrReplaceChild("Bodyfront_r12", CubeListBuilder.create().texOffs(89, 12).mirror().addBox(-2.9397F, -0.3395F, -0.5417F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.5678F, -5.4788F, -0.0642F, 0.0651F, -0.9843F));

		PartDefinition Bodyfront_r13 = body.addOrReplaceChild("Bodyfront_r13", CubeListBuilder.create().texOffs(89, 10).mirror().addBox(-4.586F, -1.4386F, -0.5417F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.5678F, -5.4788F, -0.0842F, 0.0356F, -1.3764F));

		PartDefinition Bodyfront_r14 = body.addOrReplaceChild("Bodyfront_r14", CubeListBuilder.create().texOffs(98, 63).mirror().addBox(-1.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.7678F, -7.4788F, -0.0032F, 0.0725F, -0.6331F));

		PartDefinition Bodyfront_r15 = body.addOrReplaceChild("Bodyfront_r15", CubeListBuilder.create().texOffs(87, 54).mirror().addBox(-2.9397F, -0.3395F, -0.5417F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.7678F, -7.4788F, -0.0351F, 0.1087F, -0.9817F));

		PartDefinition Bodyfront_r16 = body.addOrReplaceChild("Bodyfront_r16", CubeListBuilder.create().texOffs(77, 27).mirror().addBox(-5.586F, -1.4386F, -0.5417F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.7678F, -7.4788F, -0.0741F, 0.087F, -1.3758F));

		PartDefinition Bodyfront_r17 = body.addOrReplaceChild("Bodyfront_r17", CubeListBuilder.create().texOffs(89, 18).addBox(0.9397F, -0.3395F, -0.5417F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.6679F, -1.4788F, -0.0835F, -0.0361F, 0.9853F));

		PartDefinition Bodyfront_r18 = body.addOrReplaceChild("Bodyfront_r18", CubeListBuilder.create().texOffs(99, 36).addBox(2.586F, -1.4386F, -0.5417F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.6679F, -1.4788F, -0.091F, -0.0014F, 1.3765F));

		PartDefinition Bodyfront_r19 = body.addOrReplaceChild("Bodyfront_r19", CubeListBuilder.create().texOffs(42, 99).addBox(0.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.6679F, -1.4788F, -0.0735F, -0.0207F, 0.6364F));

		PartDefinition Bodyfront_r20 = body.addOrReplaceChild("Bodyfront_r20", CubeListBuilder.create().texOffs(89, 14).addBox(0.9397F, -0.3395F, -0.5417F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.6679F, -3.4788F, -0.0739F, -0.0506F, 0.9848F));

		PartDefinition Bodyfront_r21 = body.addOrReplaceChild("Bodyfront_r21", CubeListBuilder.create().texOffs(89, 16).addBox(2.586F, -1.4386F, -0.5417F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.6679F, -3.4788F, -0.0876F, -0.0185F, 1.3765F));

		PartDefinition Bodyfront_r22 = body.addOrReplaceChild("Bodyfront_r22", CubeListBuilder.create().texOffs(99, 34).addBox(0.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.6679F, -3.4788F, -0.0595F, -0.0311F, 0.636F));

		PartDefinition Bodyfront_r23 = body.addOrReplaceChild("Bodyfront_r23", CubeListBuilder.create().texOffs(89, 10).addBox(2.586F, -1.4386F, -0.5417F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.5678F, -5.4788F, -0.0842F, -0.0356F, 1.3764F));

		PartDefinition Bodyfront_r24 = body.addOrReplaceChild("Bodyfront_r24", CubeListBuilder.create().texOffs(89, 12).addBox(0.9397F, -0.3395F, -0.5417F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.5678F, -5.4788F, -0.0642F, -0.0651F, 0.9843F));

		PartDefinition Bodyfront_r25 = body.addOrReplaceChild("Bodyfront_r25", CubeListBuilder.create().texOffs(99, 32).addBox(0.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.5678F, -5.4788F, -0.0454F, -0.0414F, 0.6355F));

		PartDefinition Bodyfront_r26 = body.addOrReplaceChild("Bodyfront_r26", CubeListBuilder.create().texOffs(98, 63).addBox(0.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.7678F, -7.4788F, -0.0032F, -0.0725F, 0.6331F));

		PartDefinition Bodyfront_r27 = body.addOrReplaceChild("Bodyfront_r27", CubeListBuilder.create().texOffs(87, 54).addBox(0.9397F, -0.3395F, -0.5417F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.7678F, -7.4788F, -0.0351F, -0.1087F, 0.9817F));

		PartDefinition Bodyfront_r28 = body.addOrReplaceChild("Bodyfront_r28", CubeListBuilder.create().texOffs(77, 27).addBox(2.586F, -1.4386F, -0.5417F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.7678F, -7.4788F, -0.0741F, -0.087F, 1.3758F));

		PartDefinition cube_r36 = body.addOrReplaceChild("cube_r36", CubeListBuilder.create().texOffs(91, 24).addBox(0.0F, -3.2039F, -0.0547F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.2254F, -5.8819F, -0.1658F, 0.0F, 0.0F));

		PartDefinition cube_r37 = body.addOrReplaceChild("cube_r37", CubeListBuilder.create().texOffs(15, 37).addBox(0.0F, -3.1957F, 0.052F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.4254F, -7.9819F, -0.1309F, 0.0F, 0.0F));

		PartDefinition cube_r38 = body.addOrReplaceChild("cube_r38", CubeListBuilder.create().texOffs(23, 8).addBox(-2.5F, -2.0108F, 0.1552F, 5.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 9.2495F, -6.8723F, 0.2705F, 0.0F, 0.0F));

		PartDefinition cube_r39 = body.addOrReplaceChild("cube_r39", CubeListBuilder.create().texOffs(23, 26).addBox(-0.5F, -1.3F, 6.9974F, 1.0F, 1.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.3254F, -14.9819F, -0.0436F, 0.0F, 0.0F));

		PartDefinition body2 = body.addOrReplaceChild("body2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.8418F, -7.9575F, -0.0993F, 0.0868F, -0.0086F));

		PartDefinition cube_r40 = body2.addOrReplaceChild("cube_r40", CubeListBuilder.create().texOffs(54, 91).addBox(0.0F, -3.3948F, 0.016F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.0F, -0.3962F, -1.9443F, 0.0087F, 0.0F, 0.0F));

		PartDefinition Bodyfront_r29 = body2.addOrReplaceChild("Bodyfront_r29", CubeListBuilder.create().texOffs(98, 97).mirror().addBox(-1.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.174F, -1.3213F, 0.0682F, 0.1067F, -0.5575F));

		PartDefinition Bodyfront_r30 = body2.addOrReplaceChild("Bodyfront_r30", CubeListBuilder.create().texOffs(88, 70).mirror().addBox(-2.9397F, -0.3395F, -0.5417F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.174F, -1.3213F, 0.0207F, 0.1652F, -0.905F));

		PartDefinition Bodyfront_r31 = body2.addOrReplaceChild("Bodyfront_r31", CubeListBuilder.create().texOffs(88, 68).mirror().addBox(-4.586F, -1.4386F, -0.5417F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.174F, -1.3213F, -0.0447F, 0.1604F, -1.303F));

		PartDefinition Bodyfront_r32 = body2.addOrReplaceChild("Bodyfront_r32", CubeListBuilder.create().texOffs(88, 58).mirror().addBox(-6.0574F, -2.5765F, -0.5417F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.174F, -1.3213F, -0.0849F, 0.1434F, -1.5673F));

		PartDefinition Bodyfront_r33 = body2.addOrReplaceChild("Bodyfront_r33", CubeListBuilder.create().texOffs(98, 65).mirror().addBox(-1.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.274F, -3.3213F, 0.1004F, 0.1212F, -0.5367F));

		PartDefinition Bodyfront_r34 = body2.addOrReplaceChild("Bodyfront_r34", CubeListBuilder.create().texOffs(88, 56).mirror().addBox(-2.9397F, -0.3395F, -0.5417F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.274F, -3.3213F, 0.0462F, 0.1897F, -0.8833F));

		PartDefinition Bodyfront_r35 = body2.addOrReplaceChild("Bodyfront_r35", CubeListBuilder.create().texOffs(86, 66).mirror().addBox(-6.8949F, -3.0518F, -0.5417F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.274F, -3.3213F, -0.0879F, 0.1744F, -1.5935F));

		PartDefinition Bodyfront_r36 = body2.addOrReplaceChild("Bodyfront_r36", CubeListBuilder.create().texOffs(77, 67).mirror().addBox(-5.586F, -1.4386F, -0.5417F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.274F, -3.3213F, -0.0309F, 0.1927F, -1.2834F));

		PartDefinition Bodyfront_r37 = body2.addOrReplaceChild("Bodyfront_r37", CubeListBuilder.create().texOffs(98, 97).addBox(0.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.174F, -1.3213F, 0.0682F, -0.1067F, 0.5575F));

		PartDefinition Bodyfront_r38 = body2.addOrReplaceChild("Bodyfront_r38", CubeListBuilder.create().texOffs(88, 70).addBox(0.9397F, -0.3395F, -0.5417F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.174F, -1.3213F, 0.0207F, -0.1652F, 0.905F));

		PartDefinition Bodyfront_r39 = body2.addOrReplaceChild("Bodyfront_r39", CubeListBuilder.create().texOffs(88, 68).addBox(2.586F, -1.4386F, -0.5417F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.174F, -1.3213F, -0.0447F, -0.1604F, 1.303F));

		PartDefinition Bodyfront_r40 = body2.addOrReplaceChild("Bodyfront_r40", CubeListBuilder.create().texOffs(88, 58).addBox(4.0574F, -2.5765F, -0.5417F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.174F, -1.3213F, -0.0849F, -0.1434F, 1.5673F));

		PartDefinition Bodyfront_r41 = body2.addOrReplaceChild("Bodyfront_r41", CubeListBuilder.create().texOffs(98, 65).addBox(0.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.274F, -3.3213F, 0.1004F, -0.1212F, 0.5367F));

		PartDefinition Bodyfront_r42 = body2.addOrReplaceChild("Bodyfront_r42", CubeListBuilder.create().texOffs(88, 56).addBox(0.9397F, -0.3395F, -0.5417F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.274F, -3.3213F, 0.0462F, -0.1897F, 0.8833F));

		PartDefinition Bodyfront_r43 = body2.addOrReplaceChild("Bodyfront_r43", CubeListBuilder.create().texOffs(86, 66).addBox(4.8949F, -3.0518F, -0.5417F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.274F, -3.3213F, -0.0879F, -0.1744F, 1.5935F));

		PartDefinition Bodyfront_r44 = body2.addOrReplaceChild("Bodyfront_r44", CubeListBuilder.create().texOffs(77, 67).addBox(2.586F, -1.4386F, -0.5417F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.274F, -3.3213F, -0.0309F, -0.1927F, 1.2834F));

		PartDefinition cube_r41 = body2.addOrReplaceChild("cube_r41", CubeListBuilder.create().texOffs(67, 91).addBox(0.0F, -3.5212F, -0.0673F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.0F, -0.0818F, -3.839F, 0.0436F, 0.0F, 0.0F));

		PartDefinition cube_r42 = body2.addOrReplaceChild("cube_r42", CubeListBuilder.create().texOffs(23, 0).addBox(-2.5F, -0.5319F, 0.9048F, 5.0F, 2.0F, 5.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.0F, 9.8732F, -3.8758F, 0.2356F, 0.0F, 0.0F));

		PartDefinition cube_r43 = body2.addOrReplaceChild("cube_r43", CubeListBuilder.create().texOffs(28, 44).addBox(-0.5F, -0.3715F, 3.9779F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.0F, 0.5906F, -8.8507F, 0.0785F, 0.0F, 0.0F));

		PartDefinition body3 = body2.addOrReplaceChild("body3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.3902F, -4.9138F, 0.0843F, 0.0F, 0.0F));

		PartDefinition cube_r44 = body3.addOrReplaceChild("cube_r44", CubeListBuilder.create().texOffs(51, 88).addBox(0.0F, -3.3509F, -0.8779F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.0F, -0.3094F, -4.0507F, 0.0785F, 0.0F, 0.0F));

		PartDefinition Bodyfront_r45 = body3.addOrReplaceChild("Bodyfront_r45", CubeListBuilder.create().texOffs(89, 8).mirror().addBox(-7.8442F, -3.3617F, -0.4422F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.0837F, -0.4075F, -0.093F, 0.131F, -1.576F));

		PartDefinition Bodyfront_r46 = body3.addOrReplaceChild("Bodyfront_r46", CubeListBuilder.create().texOffs(72, 61).mirror().addBox(-6.5846F, -1.4487F, -0.4422F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.0837F, -0.4075F, -0.0492F, 0.1529F, -1.2682F));

		PartDefinition Bodyfront_r47 = body3.addOrReplaceChild("Bodyfront_r47", CubeListBuilder.create().texOffs(89, 39).mirror().addBox(-2.9423F, -0.3493F, -0.4422F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.0837F, -0.4075F, 0.0136F, 0.1599F, -0.8707F));

		PartDefinition Bodyfront_r48 = body3.addOrReplaceChild("Bodyfront_r48", CubeListBuilder.create().texOffs(77, 99).mirror().addBox(-1.0016F, -0.0091F, -0.4004F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.0837F, -0.4075F, 0.0598F, 0.1041F, -0.523F));

		PartDefinition Bodyfront_r49 = body3.addOrReplaceChild("Bodyfront_r49", CubeListBuilder.create().texOffs(96, 39).mirror().addBox(-1.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.2837F, -2.3075F, 0.1083F, 0.1252F, -0.5006F));

		PartDefinition Bodyfront_r50 = body3.addOrReplaceChild("Bodyfront_r50", CubeListBuilder.create().texOffs(88, 74).mirror().addBox(-2.9397F, -0.3395F, -0.5417F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.2837F, -2.3075F, 0.0524F, 0.1961F, -0.847F));

		PartDefinition Bodyfront_r51 = body3.addOrReplaceChild("Bodyfront_r51", CubeListBuilder.create().texOffs(70, 29).mirror().addBox(-6.586F, -1.4386F, -0.5417F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.2837F, -2.3075F, -0.0277F, 0.201F, -1.2476F));

		PartDefinition Bodyfront_r52 = body3.addOrReplaceChild("Bodyfront_r52", CubeListBuilder.create().texOffs(74, 53).mirror().addBox(-8.8486F, -3.3525F, -0.5417F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.2837F, -2.3075F, -0.0875F, 0.1833F, -1.5583F));

		PartDefinition Bodyfront_r53 = body3.addOrReplaceChild("Bodyfront_r53", CubeListBuilder.create().texOffs(81, 29).mirror().addBox(-8.6968F, -3.6044F, -0.5417F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.3837F, -4.3075F, -0.0892F, 0.2143F, -1.567F));

		PartDefinition Bodyfront_r54 = body3.addOrReplaceChild("Bodyfront_r54", CubeListBuilder.create().texOffs(67, 55).mirror().addBox(-6.586F, -1.4386F, -0.5417F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.3837F, -4.3075F, -0.0093F, 0.2316F, -1.2094F));

		PartDefinition Bodyfront_r55 = body3.addOrReplaceChild("Bodyfront_r55", CubeListBuilder.create().texOffs(88, 72).mirror().addBox(-2.9397F, -0.3395F, -0.5417F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.3837F, -4.3075F, 0.0815F, 0.2173F, -0.8067F));

		PartDefinition Bodyfront_r56 = body3.addOrReplaceChild("Bodyfront_r56", CubeListBuilder.create().texOffs(10, 99).mirror().addBox(-1.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.3837F, -4.3075F, 0.1426F, 0.1354F, -0.4619F));

		PartDefinition Bodyfront_r57 = body3.addOrReplaceChild("Bodyfront_r57", CubeListBuilder.create().texOffs(72, 61).addBox(2.5846F, -1.4487F, -0.4422F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.0837F, -0.4075F, -0.0492F, -0.1529F, 1.2682F));

		PartDefinition Bodyfront_r58 = body3.addOrReplaceChild("Bodyfront_r58", CubeListBuilder.create().texOffs(89, 8).addBox(5.8442F, -3.3617F, -0.4422F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.0837F, -0.4075F, -0.093F, -0.131F, 1.576F));

		PartDefinition Bodyfront_r59 = body3.addOrReplaceChild("Bodyfront_r59", CubeListBuilder.create().texOffs(89, 39).addBox(0.9423F, -0.3493F, -0.4422F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.0837F, -0.4075F, 0.0136F, -0.1599F, 0.8707F));

		PartDefinition Bodyfront_r60 = body3.addOrReplaceChild("Bodyfront_r60", CubeListBuilder.create().texOffs(77, 99).addBox(0.0016F, -0.0091F, -0.4004F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.0837F, -0.4075F, 0.0598F, -0.1041F, 0.523F));

		PartDefinition Bodyfront_r61 = body3.addOrReplaceChild("Bodyfront_r61", CubeListBuilder.create().texOffs(96, 39).addBox(0.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.2837F, -2.3075F, 0.1083F, -0.1252F, 0.5006F));

		PartDefinition Bodyfront_r62 = body3.addOrReplaceChild("Bodyfront_r62", CubeListBuilder.create().texOffs(88, 74).addBox(0.9397F, -0.3395F, -0.5417F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.2837F, -2.3075F, 0.0524F, -0.1961F, 0.847F));

		PartDefinition Bodyfront_r63 = body3.addOrReplaceChild("Bodyfront_r63", CubeListBuilder.create().texOffs(70, 29).addBox(2.586F, -1.4386F, -0.5417F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.2837F, -2.3075F, -0.0277F, -0.201F, 1.2476F));

		PartDefinition Bodyfront_r64 = body3.addOrReplaceChild("Bodyfront_r64", CubeListBuilder.create().texOffs(74, 53).addBox(5.8486F, -3.3525F, -0.5417F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.2837F, -2.3075F, -0.0875F, -0.1833F, 1.5583F));

		PartDefinition Bodyfront_r65 = body3.addOrReplaceChild("Bodyfront_r65", CubeListBuilder.create().texOffs(81, 29).addBox(5.6968F, -3.6044F, -0.5417F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.3837F, -4.3075F, -0.0892F, -0.2143F, 1.567F));

		PartDefinition Bodyfront_r66 = body3.addOrReplaceChild("Bodyfront_r66", CubeListBuilder.create().texOffs(67, 55).addBox(2.586F, -1.4386F, -0.5417F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.3837F, -4.3075F, -0.0093F, -0.2316F, 1.2094F));

		PartDefinition Bodyfront_r67 = body3.addOrReplaceChild("Bodyfront_r67", CubeListBuilder.create().texOffs(88, 72).addBox(0.9397F, -0.3395F, -0.5417F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.3837F, -4.3075F, 0.0815F, -0.2173F, 0.8067F));

		PartDefinition Bodyfront_r68 = body3.addOrReplaceChild("Bodyfront_r68", CubeListBuilder.create().texOffs(10, 99).addBox(0.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.3837F, -4.3075F, 0.1426F, -0.1354F, 0.4619F));

		PartDefinition cube_r45 = body3.addOrReplaceChild("cube_r45", CubeListBuilder.create().texOffs(70, 91).addBox(0.0F, -3.5941F, 0.0317F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.0F, -0.3094F, -0.9507F, -0.0262F, 0.0F, 0.0F));

		PartDefinition cube_r46 = body3.addOrReplaceChild("cube_r46", CubeListBuilder.create().texOffs(54, 85).addBox(0.0F, -3.7366F, 0.0412F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.0F, -0.1094F, -2.9507F, 0.0436F, 0.0F, 0.0F));

		PartDefinition cube_r47 = body3.addOrReplaceChild("cube_r47", CubeListBuilder.create().texOffs(0, 22).addBox(-2.5F, -0.6847F, -5.6427F, 5.0F, 2.0F, 6.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.0F, 9.483F, 1.038F, 0.0785F, 0.0F, 0.0F));

		PartDefinition cube_r48 = body3.addOrReplaceChild("cube_r48", CubeListBuilder.create().texOffs(13, 52).addBox(-0.5F, -0.3716F, 3.9779F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.0F, 0.5906F, -8.8507F, 0.0785F, 0.0F, 0.0F));

		PartDefinition body4 = body3.addOrReplaceChild("body4", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.3888F, -4.8803F, 0.0762F, 0.1305F, 0.0099F));

		PartDefinition cube_r49 = body4.addOrReplaceChild("cube_r49", CubeListBuilder.create().texOffs(43, 86).addBox(0.0F, -3.5157F, 0.0286F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.0F, -0.3094F, -1.9507F, 0.0087F, 0.0F, 0.0F));

		PartDefinition Bodyfront_r69 = body4.addOrReplaceChild("Bodyfront_r69", CubeListBuilder.create().texOffs(23, 99).mirror().addBox(-1.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.0949F, -1.3272F, 0.0895F, 0.1042F, -0.4514F));

		PartDefinition Bodyfront_r70 = body4.addOrReplaceChild("Bodyfront_r70", CubeListBuilder.create().texOffs(88, 78).mirror().addBox(-2.9397F, -0.3395F, -0.5417F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.0949F, -1.3272F, 0.0417F, 0.1701F, -0.7976F));

		PartDefinition Bodyfront_r71 = body4.addOrReplaceChild("Bodyfront_r71", CubeListBuilder.create().texOffs(29, 71).mirror().addBox(-6.586F, -1.4386F, -0.5417F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.0949F, -1.3272F, -0.0272F, 0.1729F, -1.1962F));

		PartDefinition Bodyfront_r72 = body4.addOrReplaceChild("Bodyfront_r72", CubeListBuilder.create().texOffs(26, 79).mirror().addBox(-8.8486F, -3.3525F, -0.5417F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.0949F, -1.3272F, -0.0783F, 0.1567F, -1.5054F));

		PartDefinition Bodyfront_r73 = body4.addOrReplaceChild("Bodyfront_r73", CubeListBuilder.create().texOffs(78, 55).mirror().addBox(-8.6968F, -3.6044F, -0.5417F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.2949F, -3.2272F, -0.0765F, 0.1703F, -1.514F));

		PartDefinition Bodyfront_r74 = body4.addOrReplaceChild("Bodyfront_r74", CubeListBuilder.create().texOffs(7, 71).mirror().addBox(-6.586F, -1.4386F, -0.5417F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.2949F, -3.2272F, -0.013F, 0.186F, -1.1597F));

		PartDefinition Bodyfront_r75 = body4.addOrReplaceChild("Bodyfront_r75", CubeListBuilder.create().texOffs(88, 76).mirror().addBox(-2.9397F, -0.3395F, -0.5417F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.2949F, -3.2272F, 0.0599F, 0.1767F, -0.7604F));

		PartDefinition Bodyfront_r76 = body4.addOrReplaceChild("Bodyfront_r76", CubeListBuilder.create().texOffs(18, 99).mirror().addBox(-1.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.2949F, -3.2272F, 0.1088F, 0.1044F, -0.4154F));

		PartDefinition Bodyfront_r77 = body4.addOrReplaceChild("Bodyfront_r77", CubeListBuilder.create().texOffs(23, 99).addBox(0.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.0949F, -1.3272F, 0.0895F, -0.1042F, 0.4514F));

		PartDefinition Bodyfront_r78 = body4.addOrReplaceChild("Bodyfront_r78", CubeListBuilder.create().texOffs(88, 78).addBox(0.9397F, -0.3395F, -0.5417F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.0949F, -1.3272F, 0.0417F, -0.1701F, 0.7976F));

		PartDefinition Bodyfront_r79 = body4.addOrReplaceChild("Bodyfront_r79", CubeListBuilder.create().texOffs(29, 71).addBox(2.586F, -1.4386F, -0.5417F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.0949F, -1.3272F, -0.0272F, -0.1729F, 1.1962F));

		PartDefinition Bodyfront_r80 = body4.addOrReplaceChild("Bodyfront_r80", CubeListBuilder.create().texOffs(26, 79).addBox(5.8486F, -3.3525F, -0.5417F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.0949F, -1.3272F, -0.0783F, -0.1567F, 1.5054F));

		PartDefinition Bodyfront_r81 = body4.addOrReplaceChild("Bodyfront_r81", CubeListBuilder.create().texOffs(78, 55).addBox(5.6968F, -3.6044F, -0.5417F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.2949F, -3.2272F, -0.0765F, -0.1703F, 1.514F));

		PartDefinition Bodyfront_r82 = body4.addOrReplaceChild("Bodyfront_r82", CubeListBuilder.create().texOffs(7, 71).addBox(2.586F, -1.4386F, -0.5417F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.2949F, -3.2272F, -0.013F, -0.186F, 1.1597F));

		PartDefinition Bodyfront_r83 = body4.addOrReplaceChild("Bodyfront_r83", CubeListBuilder.create().texOffs(88, 76).addBox(0.9397F, -0.3395F, -0.5417F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.2949F, -3.2272F, 0.0599F, -0.1767F, 0.7604F));

		PartDefinition Bodyfront_r84 = body4.addOrReplaceChild("Bodyfront_r84", CubeListBuilder.create().texOffs(18, 99).addBox(0.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.2949F, -3.2272F, 0.1088F, -0.1044F, 0.4154F));

		PartDefinition cube_r50 = body4.addOrReplaceChild("cube_r50", CubeListBuilder.create().texOffs(80, 90).addBox(0.0F, -3.3585F, 0.0302F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.0F, -0.2094F, -3.9507F, 0.0262F, 0.0F, 0.0F));

		PartDefinition cube_r51 = body4.addOrReplaceChild("cube_r51", CubeListBuilder.create().texOffs(54, 44).addBox(-0.5F, -0.3715F, 3.9779F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.0F, 0.5906F, -8.8507F, 0.0785F, 0.0F, 0.0F));

		PartDefinition chest = body4.addOrReplaceChild("chest", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.4267F, -4.8855F, 0.0565F, 0.1701F, 0.0956F));

		PartDefinition cube_r52 = chest.addOrReplaceChild("cube_r52", CubeListBuilder.create().texOffs(86, 90).addBox(0.0F, -3.5932F, 0.0552F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.0F, -0.0094F, -0.9507F, 0.096F, 0.0F, 0.0F));

		PartDefinition cube_r53 = chest.addOrReplaceChild("cube_r53", CubeListBuilder.create().texOffs(83, 90).addBox(0.0F, -2.9369F, 0.0333F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.0F, -0.2094F, -2.9507F, 0.096F, 0.0F, 0.0F));

		PartDefinition cube_r54 = chest.addOrReplaceChild("cube_r54", CubeListBuilder.create().texOffs(47, 92).addBox(0.0F, -2.7715F, -0.0221F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.0F, -0.0223F, -4.8866F, 0.096F, 0.0F, 0.0F));

		PartDefinition cube_r55 = chest.addOrReplaceChild("cube_r55", CubeListBuilder.create().texOffs(0, 82).mirror().addBox(0.0F, -1.0112F, 0.0746F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.008F)).mirror(false), PartPose.offsetAndRotation(-1.1977F, 9.8185F, 0.7586F, 0.0752F, 0.2606F, -0.0257F));

		PartDefinition Bodyfront_r85 = chest.addOrReplaceChild("Bodyfront_r85", CubeListBuilder.create().texOffs(99, 28).mirror().addBox(-1.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.0681F, -0.3417F, 0.1418F, 0.1162F, -0.3943F));

		PartDefinition Bodyfront_r86 = chest.addOrReplaceChild("Bodyfront_r86", CubeListBuilder.create().texOffs(89, 2).mirror().addBox(-2.9397F, -0.3395F, -0.5417F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.0681F, -0.3417F, 0.0874F, 0.1989F, -0.7379F));

		PartDefinition Bodyfront_r87 = chest.addOrReplaceChild("Bodyfront_r87", CubeListBuilder.create().texOffs(72, 80).mirror().addBox(-7.8995F, -3.036F, -0.7277F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.0681F, -0.3417F, -0.0959F, 0.2252F, -1.4503F));

		PartDefinition Bodyfront_r88 = chest.addOrReplaceChild("Bodyfront_r88", CubeListBuilder.create().texOffs(80, 33).mirror().addBox(-5.586F, -1.4386F, -0.5417F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.0681F, -0.3417F, 0.0035F, 0.217F, -1.1389F));

		PartDefinition Bodyfront_r89 = chest.addOrReplaceChild("Bodyfront_r89", CubeListBuilder.create().texOffs(89, 0).mirror().addBox(-6.8949F, -3.0518F, -0.5417F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.0681F, -2.3417F, -0.0737F, 0.2613F, -1.5039F));

		PartDefinition Bodyfront_r90 = chest.addOrReplaceChild("Bodyfront_r90", CubeListBuilder.create().texOffs(80, 31).mirror().addBox(-5.586F, -1.4386F, -0.5417F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.0681F, -2.3417F, 0.0102F, 0.2711F, -1.1874F));

		PartDefinition Bodyfront_r91 = chest.addOrReplaceChild("Bodyfront_r91", CubeListBuilder.create().texOffs(88, 82).mirror().addBox(-2.9397F, -0.3395F, -0.5417F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.0681F, -2.3417F, 0.1153F, 0.2461F, -0.7818F));

		PartDefinition Bodyfront_r92 = chest.addOrReplaceChild("Bodyfront_r92", CubeListBuilder.create().texOffs(99, 26).mirror().addBox(-1.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.0681F, -2.3417F, 0.1838F, 0.1515F, -0.4389F));

		PartDefinition Bodyfront_r93 = chest.addOrReplaceChild("Bodyfront_r93", CubeListBuilder.create().texOffs(99, 24).mirror().addBox(-1.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.2681F, -4.3417F, 0.2459F, 0.1852F, -0.5501F));

		PartDefinition Bodyfront_r94 = chest.addOrReplaceChild("Bodyfront_r94", CubeListBuilder.create().texOffs(88, 80).mirror().addBox(-2.9397F, -0.3395F, -0.5417F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.2681F, -4.3417F, 0.1635F, 0.2984F, -0.8905F));

		PartDefinition Bodyfront_r95 = chest.addOrReplaceChild("Bodyfront_r95", CubeListBuilder.create().texOffs(40, 71).mirror().addBox(-6.586F, -1.4386F, -0.5417F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.2681F, -4.3417F, 0.0331F, 0.3375F, -1.3022F));

		PartDefinition cube_r56 = chest.addOrReplaceChild("cube_r56", CubeListBuilder.create().texOffs(70, 12).mirror().addBox(0.0F, -1.0112F, 0.1746F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.008F)).mirror(false), PartPose.offsetAndRotation(-2.0F, 9.5315F, -2.2219F, -0.0994F, 0.2606F, -0.0257F));

		PartDefinition Bodyfront_r96 = chest.addOrReplaceChild("Bodyfront_r96", CubeListBuilder.create().texOffs(99, 28).addBox(0.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.0681F, -0.3417F, 0.1418F, -0.1162F, 0.3943F));

		PartDefinition Bodyfront_r97 = chest.addOrReplaceChild("Bodyfront_r97", CubeListBuilder.create().texOffs(89, 2).addBox(0.9397F, -0.3395F, -0.5417F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.0681F, -0.3417F, 0.0874F, -0.1989F, 0.7379F));

		PartDefinition Bodyfront_r98 = chest.addOrReplaceChild("Bodyfront_r98", CubeListBuilder.create().texOffs(72, 80).addBox(4.8995F, -3.036F, -0.7277F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.0681F, -0.3417F, -0.0959F, -0.2252F, 1.4503F));

		PartDefinition Bodyfront_r99 = chest.addOrReplaceChild("Bodyfront_r99", CubeListBuilder.create().texOffs(80, 33).addBox(2.586F, -1.4386F, -0.5417F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.0681F, -0.3417F, 0.0035F, -0.217F, 1.1389F));

		PartDefinition Bodyfront_r100 = chest.addOrReplaceChild("Bodyfront_r100", CubeListBuilder.create().texOffs(89, 0).addBox(4.8949F, -3.0518F, -0.5417F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.0681F, -2.3417F, -0.0737F, -0.2613F, 1.5039F));

		PartDefinition Bodyfront_r101 = chest.addOrReplaceChild("Bodyfront_r101", CubeListBuilder.create().texOffs(80, 31).addBox(2.586F, -1.4386F, -0.5417F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.0681F, -2.3417F, 0.0102F, -0.2711F, 1.1874F));

		PartDefinition Bodyfront_r102 = chest.addOrReplaceChild("Bodyfront_r102", CubeListBuilder.create().texOffs(88, 82).addBox(0.9397F, -0.3395F, -0.5417F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.0681F, -2.3417F, 0.1153F, -0.2461F, 0.7818F));

		PartDefinition Bodyfront_r103 = chest.addOrReplaceChild("Bodyfront_r103", CubeListBuilder.create().texOffs(99, 26).addBox(0.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.0681F, -2.3417F, 0.1838F, -0.1515F, 0.4389F));

		PartDefinition Bodyfront_r104 = chest.addOrReplaceChild("Bodyfront_r104", CubeListBuilder.create().texOffs(99, 24).addBox(0.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.2681F, -4.3417F, 0.2459F, -0.1852F, 0.5501F));

		PartDefinition Bodyfront_r105 = chest.addOrReplaceChild("Bodyfront_r105", CubeListBuilder.create().texOffs(88, 80).addBox(0.9397F, -0.3395F, -0.5417F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.2681F, -4.3417F, 0.1635F, -0.2984F, 0.8905F));

		PartDefinition Bodyfront_r106 = chest.addOrReplaceChild("Bodyfront_r106", CubeListBuilder.create().texOffs(40, 71).addBox(2.586F, -1.4386F, -0.5417F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.2681F, -4.3417F, 0.0331F, -0.3375F, 1.3022F));

		PartDefinition cube_r57 = chest.addOrReplaceChild("cube_r57", CubeListBuilder.create().texOffs(19, 82).addBox(-1.0F, -1.0112F, 0.0746F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(0.6879F, 9.6551F, 2.6857F, 0.2061F, -0.2606F, 0.0257F));

		PartDefinition cube_r58 = chest.addOrReplaceChild("cube_r58", CubeListBuilder.create().texOffs(0, 82).addBox(-1.0F, -1.0112F, 0.0746F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(1.1977F, 9.8185F, 0.7586F, 0.0752F, -0.2606F, 0.0257F));

		PartDefinition cube_r59 = chest.addOrReplaceChild("cube_r59", CubeListBuilder.create().texOffs(70, 12).addBox(-1.0F, -1.0112F, 0.1746F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(2.0F, 9.5315F, -2.2219F, -0.0994F, -0.2606F, 0.0257F));

		PartDefinition cube_r60 = chest.addOrReplaceChild("cube_r60", CubeListBuilder.create().texOffs(81, 81).addBox(-0.5F, -1.0112F, -0.0254F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.0F, 9.6465F, 2.9541F, 0.2269F, 0.0F, 0.0F));

		PartDefinition cube_r61 = chest.addOrReplaceChild("cube_r61", CubeListBuilder.create().texOffs(81, 77).addBox(-0.5F, -1.0112F, -0.0254F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.0F, 9.8382F, 0.9633F, 0.096F, 0.0F, 0.0F));

		PartDefinition cube_r62 = chest.addOrReplaceChild("cube_r62", CubeListBuilder.create().texOffs(62, 32).addBox(-1.0F, -1.0112F, 0.1746F, 2.0F, 1.0F, 3.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.0F, 9.5315F, -2.2219F, -0.096F, 0.0F, 0.0F));

		PartDefinition cube_r63 = chest.addOrReplaceChild("cube_r63", CubeListBuilder.create().texOffs(49, 39).addBox(-2.0F, -0.9431F, -2.9376F, 4.0F, 1.0F, 3.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.0F, 9.5116F, -2.0722F, -0.2182F, 0.0F, 0.0F));

		PartDefinition cube_r64 = chest.addOrReplaceChild("cube_r64", CubeListBuilder.create().texOffs(0, 37).addBox(-0.5F, -0.3715F, 2.9779F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.0F, 0.5906F, -8.8507F, 0.0785F, 0.0F, 0.0F));

		PartDefinition Rightupperarm = chest.addOrReplaceChild("Rightupperarm", CubeListBuilder.create().texOffs(70, 0).addBox(-0.599F, 1.9702F, -0.8446F, 1.0F, 4.0F, 2.0F, new CubeDeformation(0.006F))
				.texOffs(39, 58).addBox(-0.599F, -0.0298F, -1.7446F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.503F, 6.8043F, -0.8554F, -0.1618F, 0.1114F, -0.4752F));

		PartDefinition Rightupperarm_r1 = Rightupperarm.addOrReplaceChild("Rightupperarm_r1", CubeListBuilder.create().texOffs(27, 88).addBox(-0.5F, -1.1F, -1.2F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(-0.099F, 2.9702F, 1.7554F, -0.6545F, 0.0F, 0.0F));

		PartDefinition Rightupperarm_r2 = Rightupperarm.addOrReplaceChild("Rightupperarm_r2", CubeListBuilder.create().texOffs(84, 10).addBox(-0.5F, -1.1F, -1.0F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(-0.099F, 4.9702F, -0.3446F, -0.7941F, 0.0F, 0.0F));

		PartDefinition Rightupperarm_r3 = Rightupperarm.addOrReplaceChild("Rightupperarm_r3", CubeListBuilder.create().texOffs(70, 64).addBox(-0.5F, -1.5F, 1.5F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(-0.099F, 8.2021F, 0.875F, 2.042F, 0.0F, 0.0F));

		PartDefinition Rightupperarm_r4 = Rightupperarm.addOrReplaceChild("Rightupperarm_r4", CubeListBuilder.create().texOffs(46, 88).addBox(-0.5F, 0.1F, 0.6F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.099F, 6.7827F, -3.3303F, 0.9948F, 0.0F, 0.0F));

		PartDefinition Rightlowerarm = Rightupperarm.addOrReplaceChild("Rightlowerarm", CubeListBuilder.create().texOffs(72, 87).addBox(-0.3997F, -1.4984F, 0.4846F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-0.2549F, 7.3932F, -0.5251F, -1.3223F, 1.1289F, -1.003F));

		PartDefinition Rightlowerarm_r1 = Rightlowerarm.addOrReplaceChild("Rightlowerarm_r1", CubeListBuilder.create().texOffs(84, 5).addBox(-0.5F, -1.925F, -0.225F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.105F)), PartPose.offsetAndRotation(0.1003F, 1.4016F, -1.4154F, -0.3054F, 0.0F, 0.0F));

		PartDefinition Rightlowerarm_r2 = Rightlowerarm.addOrReplaceChild("Rightlowerarm_r2", CubeListBuilder.create().texOffs(79, 11).addBox(-0.5F, -1.5F, -0.7F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.1003F, 3.7016F, -1.4154F, -0.1309F, 0.0F, 0.0F));

		PartDefinition Rightlowerarm_r3 = Rightlowerarm.addOrReplaceChild("Rightlowerarm_r3", CubeListBuilder.create().texOffs(84, 0).addBox(-0.5F, -2.2F, -1.1F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.007F)), PartPose.offsetAndRotation(0.1003F, 0.9289F, 0.8211F, -0.3054F, 0.0F, 0.0F));

		PartDefinition Rightlowerarm_r4 = Rightlowerarm.addOrReplaceChild("Rightlowerarm_r4", CubeListBuilder.create().texOffs(88, 42).addBox(-0.5F, -0.7F, -0.7F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.1003F, 0.9289F, 0.8211F, -0.5672F, 0.0F, 0.0F));

		PartDefinition Rightlowerarm_r5 = Rightlowerarm.addOrReplaceChild("Rightlowerarm_r5", CubeListBuilder.create().texOffs(14, 73).addBox(-0.5F, -1.75F, -0.625F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.1003F, 3.0016F, -0.0154F, -0.1309F, 0.0F, 0.0F));

		PartDefinition leftFoot = Rightlowerarm.addOrReplaceChild("leftFoot", CubeListBuilder.create().texOffs(57, 12).addBox(0.0F, -0.4F, -3.0F, 2.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.1859F, 5.519F, 0.0F, -0.0994F, 0.122F, 0.8172F));

		PartDefinition leftFoot2 = leftFoot.addOrReplaceChild("leftFoot2", CubeListBuilder.create().texOffs(44, 6).addBox(0.0F, -1.0F, -3.0F, 3.0F, 1.0F, 4.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(2.0F, 0.6F, 0.0F, 0.0F, 0.0F, -0.0436F));

		PartDefinition Leftupperarm = chest.addOrReplaceChild("Leftupperarm", CubeListBuilder.create().texOffs(70, 0).mirror().addBox(-0.401F, 1.9702F, -0.8446F, 1.0F, 4.0F, 2.0F, new CubeDeformation(0.006F)).mirror(false)
				.texOffs(39, 58).mirror().addBox(-0.401F, -0.0298F, -1.7446F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-3.503F, 6.8043F, -0.8554F, 0.5363F, -0.1114F, 0.4752F));

		PartDefinition Leftupperarm_r1 = Leftupperarm.addOrReplaceChild("Leftupperarm_r1", CubeListBuilder.create().texOffs(27, 88).mirror().addBox(-0.5F, -1.1F, -1.2F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(0.099F, 2.9702F, 1.7554F, -0.6545F, 0.0F, 0.0F));

		PartDefinition Leftupperarm_r2 = Leftupperarm.addOrReplaceChild("Leftupperarm_r2", CubeListBuilder.create().texOffs(84, 10).mirror().addBox(-0.5F, -1.1F, -1.0F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(0.099F, 4.9702F, -0.3446F, -0.7941F, 0.0F, 0.0F));

		PartDefinition Leftupperarm_r3 = Leftupperarm.addOrReplaceChild("Leftupperarm_r3", CubeListBuilder.create().texOffs(70, 64).mirror().addBox(-0.5F, -1.5F, 1.5F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.009F)).mirror(false), PartPose.offsetAndRotation(0.099F, 8.2021F, 0.875F, 2.042F, 0.0F, 0.0F));

		PartDefinition Leftupperarm_r4 = Leftupperarm.addOrReplaceChild("Leftupperarm_r4", CubeListBuilder.create().texOffs(46, 88).mirror().addBox(-0.5F, 0.1F, 0.6F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.099F, 6.7827F, -3.3303F, 0.9948F, 0.0F, 0.0F));

		PartDefinition Leftlowerarm = Leftupperarm.addOrReplaceChild("Leftlowerarm", CubeListBuilder.create().texOffs(72, 87).mirror().addBox(-0.6003F, -1.4984F, 0.4846F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(0.2549F, 7.3932F, -0.5251F, -1.4532F, -1.1289F, 1.003F));

		PartDefinition Leftlowerarm_r1 = Leftlowerarm.addOrReplaceChild("Leftlowerarm_r1", CubeListBuilder.create().texOffs(84, 5).mirror().addBox(-0.5F, -1.925F, -0.225F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.105F)).mirror(false), PartPose.offsetAndRotation(-0.1003F, 1.4016F, -1.4154F, -0.3054F, 0.0F, 0.0F));

		PartDefinition Leftlowerarm_r2 = Leftlowerarm.addOrReplaceChild("Leftlowerarm_r2", CubeListBuilder.create().texOffs(79, 11).mirror().addBox(-0.5F, -1.5F, -0.7F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-0.1003F, 3.7016F, -1.4154F, -0.1309F, 0.0F, 0.0F));

		PartDefinition Leftlowerarm_r3 = Leftlowerarm.addOrReplaceChild("Leftlowerarm_r3", CubeListBuilder.create().texOffs(84, 0).mirror().addBox(-0.5F, -2.2F, -1.1F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.007F)).mirror(false), PartPose.offsetAndRotation(-0.1003F, 0.9289F, 0.8211F, -0.3054F, 0.0F, 0.0F));

		PartDefinition Leftlowerarm_r4 = Leftlowerarm.addOrReplaceChild("Leftlowerarm_r4", CubeListBuilder.create().texOffs(88, 42).mirror().addBox(-0.5F, -0.7F, -0.7F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.1003F, 0.9289F, 0.8211F, -0.5672F, 0.0F, 0.0F));

		PartDefinition Leftlowerarm_r5 = Leftlowerarm.addOrReplaceChild("Leftlowerarm_r5", CubeListBuilder.create().texOffs(14, 73).mirror().addBox(-0.5F, -1.75F, -0.625F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(-0.1003F, 3.0016F, -0.0154F, -0.1309F, 0.0F, 0.0F));

		PartDefinition rightFoot = Leftlowerarm.addOrReplaceChild("rightFoot", CubeListBuilder.create().texOffs(57, 12).mirror().addBox(-2.0F, -0.4F, -3.0F, 2.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.1859F, 5.519F, 0.0F, -0.1469F, -0.0561F, -0.2956F));

		PartDefinition rightFoot2 = rightFoot.addOrReplaceChild("rightFoot2", CubeListBuilder.create().texOffs(44, 6).mirror().addBox(-3.0F, -1.0F, -3.0F, 3.0F, 1.0F, 4.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(-2.0F, 0.6F, 0.0F, 0.0F, 0.0F, 0.2618F));

		PartDefinition bone = chest.addOrReplaceChild("bone", CubeListBuilder.create(), PartPose.offsetAndRotation(3.6392F, 3.6077F, -2.665F, -0.0115F, 0.1304F, -0.088F));

		PartDefinition Bodyfront_r107 = bone.addOrReplaceChild("Bodyfront_r107", CubeListBuilder.create().texOffs(68, 18).addBox(-0.9F, 0.0F, 0.7F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(-0.5702F, 3.0757F, -2.0341F, 1.3042F, -0.0464F, 0.268F));

		PartDefinition Bodyfront_r108 = bone.addOrReplaceChild("Bodyfront_r108", CubeListBuilder.create().texOffs(58, 74).addBox(-0.625F, 0.8F, -0.1F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(-1.4636F, 4.0452F, -2.5741F, 1.6057F, 0.0F, 0.4363F));

		PartDefinition Bodyfront_r109 = bone.addOrReplaceChild("Bodyfront_r109", CubeListBuilder.create().texOffs(43, 78).addBox(-0.5F, -1.0633F, -2.2864F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(-1.6441F, 4.4888F, 0.5555F, 0.262F, -0.0077F, 0.7196F));

		PartDefinition Bodyfront_r110 = bone.addOrReplaceChild("Bodyfront_r110", CubeListBuilder.create().texOffs(0, 71).addBox(-0.5F, 0.0F, 0.0F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(-0.7637F, 3.116F, -1.0537F, 0.6021F, 0.0F, 0.4363F));

		PartDefinition Bodyfront_r111 = bone.addOrReplaceChild("Bodyfront_r111", CubeListBuilder.create().texOffs(36, 73).addBox(-1.15F, -1.2016F, -1.1527F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.2F, 2.5874F, 0.0328F, 0.0785F, 0.0F, 0.4363F));

		PartDefinition Bodyfront_r112 = bone.addOrReplaceChild("Bodyfront_r112", CubeListBuilder.create().texOffs(67, 48).addBox(-1.15F, -1.0766F, -0.6277F, 1.0F, 4.0F, 2.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.2F, 2.5874F, 0.0328F, 0.2967F, 0.0F, 0.4363F));

		PartDefinition Bodyfront_r113 = bone.addOrReplaceChild("Bodyfront_r113", CubeListBuilder.create().texOffs(83, 42).addBox(-0.5F, 0.1F, -1.3F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.5568F, 1.4128F, 0.0349F, 0.0F, 0.0F));

		PartDefinition Bodyfront_r114 = bone.addOrReplaceChild("Bodyfront_r114", CubeListBuilder.create().texOffs(76, 82).addBox(-0.5F, 1.1167F, -1.2586F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(0.0F, -2.8F, 1.9F, -0.2269F, 0.0F, 0.0F));

		PartDefinition Bodyfront_r115 = bone.addOrReplaceChild("Bodyfront_r115", CubeListBuilder.create().texOffs(67, 43).addBox(-0.5F, -0.8F, -0.3F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(-1.9727F, 4.8599F, 0.8814F, -0.3925F, -0.0077F, 0.7196F));

		PartDefinition Bodyfront_r116 = bone.addOrReplaceChild("Bodyfront_r116", CubeListBuilder.create().texOffs(0, 66).addBox(-0.5F, -1.5F, -0.3F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.9727F, 4.8599F, 0.8814F, -0.567F, -0.0077F, 0.7196F));

		PartDefinition Bodyfront_r117 = bone.addOrReplaceChild("Bodyfront_r117", CubeListBuilder.create().texOffs(19, 36).addBox(-0.5F, -0.2F, -3.1F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.9727F, 4.8599F, 0.8814F, -0.2616F, -0.0077F, 0.7196F));

		PartDefinition Bodyfront_r118 = bone.addOrReplaceChild("Bodyfront_r118", CubeListBuilder.create().texOffs(36, 78).addBox(-0.5F, -2.4456F, 0.2633F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, -0.7F, 0.1222F, 0.0F, 0.0F));

		PartDefinition Bodyfront_r119 = bone.addOrReplaceChild("Bodyfront_r119", CubeListBuilder.create().texOffs(67, 70).addBox(-0.5F, 0.0F, 0.0F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(0.0159F, -1.4852F, -1.0276F, -0.0626F, 0.0102F, 0.0178F));

		PartDefinition Bodyfront_r120 = bone.addOrReplaceChild("Bodyfront_r120", CubeListBuilder.create().texOffs(19, 78).addBox(-0.5F, -0.3F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.034F, -1.8297F, 0.1433F, -0.3244F, 0.0102F, 0.0178F));

		PartDefinition bone3 = chest.addOrReplaceChild("bone3", CubeListBuilder.create(), PartPose.offsetAndRotation(-3.6392F, 3.6077F, -2.665F, -0.0115F, -0.1304F, 0.088F));

		PartDefinition Bodyfront_r121 = bone3.addOrReplaceChild("Bodyfront_r121", CubeListBuilder.create().texOffs(68, 18).mirror().addBox(-0.1F, 0.0F, 0.7F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(0.5702F, 3.0757F, -2.0341F, 1.3042F, 0.0464F, -0.268F));

		PartDefinition Bodyfront_r122 = bone3.addOrReplaceChild("Bodyfront_r122", CubeListBuilder.create().texOffs(58, 74).mirror().addBox(-0.375F, 0.8F, -0.1F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(1.4636F, 4.0452F, -2.5741F, 1.6057F, 0.0F, -0.4363F));

		PartDefinition Bodyfront_r123 = bone3.addOrReplaceChild("Bodyfront_r123", CubeListBuilder.create().texOffs(43, 78).mirror().addBox(-0.5F, -1.0633F, -2.2864F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(1.6441F, 4.4888F, 0.5555F, 0.262F, 0.0077F, -0.7196F));

		PartDefinition Bodyfront_r124 = bone3.addOrReplaceChild("Bodyfront_r124", CubeListBuilder.create().texOffs(0, 71).mirror().addBox(-0.5F, 0.0F, 0.0F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.009F)).mirror(false), PartPose.offsetAndRotation(0.7637F, 3.116F, -1.0537F, 0.6021F, 0.0F, -0.4363F));

		PartDefinition Bodyfront_r125 = bone3.addOrReplaceChild("Bodyfront_r125", CubeListBuilder.create().texOffs(36, 73).mirror().addBox(0.15F, -1.2016F, -1.1527F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-0.2F, 2.5874F, 0.0328F, 0.0785F, 0.0F, -0.4363F));

		PartDefinition Bodyfront_r126 = bone3.addOrReplaceChild("Bodyfront_r126", CubeListBuilder.create().texOffs(67, 48).mirror().addBox(0.15F, -1.0766F, -0.6277F, 1.0F, 4.0F, 2.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(-0.2F, 2.5874F, 0.0328F, 0.2967F, 0.0F, -0.4363F));

		PartDefinition Bodyfront_r127 = bone3.addOrReplaceChild("Bodyfront_r127", CubeListBuilder.create().texOffs(83, 42).mirror().addBox(-0.5F, 0.1F, -1.3F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, -1.5568F, 1.4128F, 0.0349F, 0.0F, 0.0F));

		PartDefinition Bodyfront_r128 = bone3.addOrReplaceChild("Bodyfront_r128", CubeListBuilder.create().texOffs(76, 82).mirror().addBox(-0.5F, 1.1167F, -1.2586F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.009F)).mirror(false), PartPose.offsetAndRotation(0.0F, -2.8F, 1.9F, -0.2269F, 0.0F, 0.0F));

		PartDefinition Bodyfront_r129 = bone3.addOrReplaceChild("Bodyfront_r129", CubeListBuilder.create().texOffs(67, 43).mirror().addBox(-0.5F, -0.8F, -0.3F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.007F)).mirror(false), PartPose.offsetAndRotation(1.9727F, 4.8599F, 0.8814F, -0.3925F, 0.0077F, -0.7196F));

		PartDefinition Bodyfront_r130 = bone3.addOrReplaceChild("Bodyfront_r130", CubeListBuilder.create().texOffs(0, 66).mirror().addBox(-0.5F, -1.5F, -0.3F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(1.9727F, 4.8599F, 0.8814F, -0.567F, 0.0077F, -0.7196F));

		PartDefinition Bodyfront_r131 = bone3.addOrReplaceChild("Bodyfront_r131", CubeListBuilder.create().texOffs(19, 36).mirror().addBox(-0.5F, -0.2F, -3.1F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(1.9727F, 4.8599F, 0.8814F, -0.2616F, 0.0077F, -0.7196F));

		PartDefinition Bodyfront_r132 = bone3.addOrReplaceChild("Bodyfront_r132", CubeListBuilder.create().texOffs(36, 78).mirror().addBox(-0.5F, -2.4456F, 0.2633F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, -0.7F, 0.1222F, 0.0F, 0.0F));

		PartDefinition Bodyfront_r133 = bone3.addOrReplaceChild("Bodyfront_r133", CubeListBuilder.create().texOffs(67, 70).mirror().addBox(-0.5F, 0.0F, 0.0F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.009F)).mirror(false), PartPose.offsetAndRotation(-0.0159F, -1.4852F, -1.0276F, -0.0626F, -0.0102F, -0.0178F));

		PartDefinition Bodyfront_r134 = bone3.addOrReplaceChild("Bodyfront_r134", CubeListBuilder.create().texOffs(19, 78).mirror().addBox(-0.5F, -0.3F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-0.034F, -1.8297F, 0.1433F, -0.3244F, -0.0102F, -0.0178F));

		PartDefinition neck = chest.addOrReplaceChild("neck", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.5414F, -5.7509F, 0.0804F, 0.2616F, 0.0095F));

		PartDefinition cube_r65 = neck.addOrReplaceChild("cube_r65", CubeListBuilder.create().texOffs(50, 94).addBox(-0.5F, -2.0505F, 0.0535F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.6707F, -1.0392F, 0.096F, 0.0F, 0.0F));

		PartDefinition Bodyfront_r135 = neck.addOrReplaceChild("Bodyfront_r135", CubeListBuilder.create().texOffs(72, 99).mirror().addBox(-1.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.1733F, -2.5909F, 0.275F, 0.2386F, -0.6465F));

		PartDefinition Bodyfront_r136 = neck.addOrReplaceChild("Bodyfront_r136", CubeListBuilder.create().texOffs(99, 61).mirror().addBox(-3.586F, -1.4386F, -0.5417F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.1733F, -2.5909F, 0.0159F, 0.3959F, -1.4109F));

		PartDefinition Bodyfront_r137 = neck.addOrReplaceChild("Bodyfront_r137", CubeListBuilder.create().texOffs(89, 22).mirror().addBox(-2.9397F, -0.3395F, -0.5417F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.1733F, -2.5909F, 0.1729F, 0.3583F, -0.99F));

		PartDefinition Bodyfront_r138 = neck.addOrReplaceChild("Bodyfront_r138", CubeListBuilder.create().texOffs(89, 6).mirror().addBox(-4.586F, -1.4386F, -0.5417F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.1733F, -0.5909F, 0.0071F, 0.3442F, -1.4141F));

		PartDefinition Bodyfront_r139 = neck.addOrReplaceChild("Bodyfront_r139", CubeListBuilder.create().texOffs(89, 4).mirror().addBox(-2.9397F, -0.3395F, -0.5417F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.1733F, -0.5909F, 0.1427F, 0.3144F, -1.0F));

		PartDefinition Bodyfront_r140 = neck.addOrReplaceChild("Bodyfront_r140", CubeListBuilder.create().texOffs(99, 30).mirror().addBox(-1.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.1733F, -0.5909F, 0.2323F, 0.2069F, -0.6559F));

		PartDefinition Bodyfront_r141 = neck.addOrReplaceChild("Bodyfront_r141", CubeListBuilder.create().texOffs(89, 22).addBox(0.9397F, -0.3395F, -0.5417F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.1733F, -2.5909F, 0.1729F, -0.3583F, 0.99F));

		PartDefinition Bodyfront_r142 = neck.addOrReplaceChild("Bodyfront_r142", CubeListBuilder.create().texOffs(99, 61).addBox(2.586F, -1.4386F, -0.5417F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.1733F, -2.5909F, 0.0159F, -0.3959F, 1.4109F));

		PartDefinition Bodyfront_r143 = neck.addOrReplaceChild("Bodyfront_r143", CubeListBuilder.create().texOffs(72, 99).addBox(0.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.1733F, -2.5909F, 0.275F, -0.2386F, 0.6465F));

		PartDefinition Bodyfront_r144 = neck.addOrReplaceChild("Bodyfront_r144", CubeListBuilder.create().texOffs(89, 6).addBox(2.586F, -1.4386F, -0.5417F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.1733F, -0.5909F, 0.0071F, -0.3442F, 1.4141F));

		PartDefinition Bodyfront_r145 = neck.addOrReplaceChild("Bodyfront_r145", CubeListBuilder.create().texOffs(89, 4).addBox(0.9397F, -0.3395F, -0.5417F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.1733F, -0.5909F, 0.1427F, -0.3144F, 1.0F));

		PartDefinition Bodyfront_r146 = neck.addOrReplaceChild("Bodyfront_r146", CubeListBuilder.create().texOffs(99, 30).addBox(0.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.1733F, -0.5909F, 0.2323F, -0.2069F, 0.6559F));

		PartDefinition cube_r66 = neck.addOrReplaceChild("cube_r66", CubeListBuilder.create().texOffs(12, 84).addBox(-0.5F, -1.872F, -2.0499F, 0.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.6707F, -1.9392F, 0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r67 = neck.addOrReplaceChild("cube_r67", CubeListBuilder.create().texOffs(61, 58).addBox(-1.0F, -2.9F, -3.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 2.2293F, -1.2392F, -0.0873F, 0.0F, 0.0F));

		PartDefinition head = neck.addOrReplaceChild("head", CubeListBuilder.create().texOffs(72, 57).addBox(-1.0F, -4.3352F, -4.0924F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.012F)), PartPose.offsetAndRotation(0.0F, -0.3586F, -4.1808F, -0.3129F, 0.3849F, 0.0801F));

		PartDefinition cube_r68 = head.addOrReplaceChild("cube_r68", CubeListBuilder.create().texOffs(82, 35).addBox(-1.0F, -1.2076F, -0.8479F, 2.0F, 2.0F, 1.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(0.0F, -0.4728F, -11.5283F, 1.6319F, 0.0F, 0.0F));

		PartDefinition cube_r69 = head.addOrReplaceChild("cube_r69", CubeListBuilder.create().texOffs(50, 77).addBox(-1.0F, -1.0663F, -0.5687F, 2.0F, 2.0F, 1.0F, new CubeDeformation(-0.014F)), PartPose.offsetAndRotation(0.0F, -0.4728F, -11.5283F, 1.0123F, 0.0F, 0.0F));

		PartDefinition cube_r70 = head.addOrReplaceChild("cube_r70", CubeListBuilder.create().texOffs(40, 82).addBox(-1.0F, -0.04F, -0.0244F, 2.0F, 2.0F, 1.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(0.0F, -1.3641F, -12.1805F, 0.6109F, 0.0F, 0.0F));

		PartDefinition cube_r71 = head.addOrReplaceChild("cube_r71", CubeListBuilder.create().texOffs(33, 82).addBox(-2.0F, -0.025F, -0.975F, 2.0F, 2.0F, 1.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(1.0F, -2.4349F, -10.6781F, 0.6109F, 0.0F, 0.0F));

		PartDefinition cube_r72 = head.addOrReplaceChild("cube_r72", CubeListBuilder.create().texOffs(40, 65).addBox(-2.0F, -0.05F, -2.0F, 2.0F, 3.0F, 2.0F, new CubeDeformation(-0.014F)), PartPose.offsetAndRotation(1.0F, -3.2061F, -8.9344F, 0.4189F, 0.0F, 0.0F));

		PartDefinition cube_r73 = head.addOrReplaceChild("cube_r73", CubeListBuilder.create().texOffs(57, 18).addBox(-1.5F, 0.05F, -3.025F, 2.0F, 4.0F, 3.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(0.5F, -4.1103F, -6.0813F, 0.2618F, 0.0F, 0.0F));

		PartDefinition cube_r74 = head.addOrReplaceChild("cube_r74", CubeListBuilder.create().texOffs(73, 39).addBox(-1.4F, 0.0F, 0.0F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.1F, -2.8156F, 0.4636F, -1.4399F, 0.0F, 0.0F));

		PartDefinition cube_r75 = head.addOrReplaceChild("cube_r75", CubeListBuilder.create().texOffs(19, 75).addBox(-2.5F, 0.0F, -1.0F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -2.8156F, 0.4636F, -0.7767F, 0.0F, 0.0F));

		PartDefinition cube_r76 = head.addOrReplaceChild("cube_r76", CubeListBuilder.create().texOffs(62, 94).addBox(-0.5F, -0.4F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.0F, -3.4781F, -0.6029F, -0.5149F, 0.0F, 0.0F));

		PartDefinition cube_r77 = head.addOrReplaceChild("cube_r77", CubeListBuilder.create().texOffs(44, 12).addBox(-2.5F, -0.05F, -1.95F, 3.0F, 1.0F, 2.0F, new CubeDeformation(0.007F))
				.texOffs(15, 44).addBox(-1.5F, 0.95F, -3.95F, 1.0F, 2.0F, 5.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(1.0F, -3.4748F, -0.3231F, -0.4363F, 0.0F, 0.0F));

		PartDefinition cube_r78 = head.addOrReplaceChild("cube_r78", CubeListBuilder.create().texOffs(0, 59).addBox(-1.5F, -0.2F, -2.0F, 3.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -4.125F, -4.1F, 0.1222F, 0.0F, 0.0F));

		PartDefinition leftFace = head.addOrReplaceChild("leftFace", CubeListBuilder.create(), PartPose.offset(0.5F, 0.9104F, 0.9196F));

		PartDefinition cube_r79 = leftFace.addOrReplaceChild("cube_r79", CubeListBuilder.create().texOffs(59, 0).addBox(-1.5F, 0.0F, 0.0F, 2.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.7178F, -4.8263F, -4.8752F, -1.2874F, 0.2964F, 0.1233F));

		PartDefinition cube_r80 = leftFace.addOrReplaceChild("cube_r80", CubeListBuilder.create().texOffs(26, 85).addBox(-2.0F, 0.0F, -0.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.007F)), PartPose.offsetAndRotation(1.1468F, -5.1434F, -5.1463F, -0.5813F, 0.0576F, -0.2698F));

		PartDefinition cube_r81 = leftFace.addOrReplaceChild("cube_r81", CubeListBuilder.create().texOffs(84, 61).addBox(-0.5331F, -2.0046F, 0.124F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.007F)), PartPose.offsetAndRotation(1.0335F, -3.7026F, -6.7599F, -0.5107F, 0.2964F, 0.1233F));

		PartDefinition cube_r82 = leftFace.addOrReplaceChild("cube_r82", CubeListBuilder.create().texOffs(93, 44).addBox(-0.4714F, 0.277F, -0.0562F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.148F)), PartPose.offsetAndRotation(0.2797F, -1.9648F, -12.4795F, -1.5121F, -0.104F, 0.193F));

		PartDefinition cube_r83 = leftFace.addOrReplaceChild("cube_r83", CubeListBuilder.create().texOffs(10, 96).addBox(-0.4714F, 0.1928F, -0.4126F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F))
				.texOffs(0, 77).addBox(-0.4714F, -1.3846F, -0.8597F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.158F)), PartPose.offsetAndRotation(0.2797F, -1.9648F, -12.4795F, -1.8263F, -0.104F, 0.193F));

		PartDefinition cube_r84 = leftFace.addOrReplaceChild("cube_r84", CubeListBuilder.create().texOffs(73, 93).addBox(-0.4714F, -0.4222F, -1.1475F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.148F)), PartPose.offsetAndRotation(0.2797F, -1.9648F, -12.4795F, -0.91F, -0.104F, 0.193F));

		PartDefinition cube_r85 = leftFace.addOrReplaceChild("cube_r85", CubeListBuilder.create().texOffs(37, 91).addBox(-0.5083F, -0.2599F, 0.2128F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.148F)), PartPose.offsetAndRotation(0.2797F, -1.9648F, -12.4795F, 1.1615F, -0.1333F, 0.2279F));

		PartDefinition cube_r86 = leftFace.addOrReplaceChild("cube_r86", CubeListBuilder.create().texOffs(5, 94).addBox(-0.5083F, -1.1337F, -0.4756F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.2797F, -1.9648F, -12.4795F, 0.0707F, -0.1333F, 0.2279F));

		PartDefinition cube_r87 = leftFace.addOrReplaceChild("cube_r87", CubeListBuilder.create().texOffs(70, 7).addBox(-0.975F, -1.175F, -1.425F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.153F)), PartPose.offsetAndRotation(0.3793F, -2.8495F, -9.5106F, -1.0433F, 0.8824F, 0.3871F));

		PartDefinition cube_r88 = leftFace.addOrReplaceChild("cube_r88", CubeListBuilder.create().texOffs(61, 64).addBox(-0.4912F, -1.4322F, -1.0237F, 1.0F, 2.0F, 3.0F, new CubeDeformation(-0.153F)), PartPose.offsetAndRotation(0.4545F, -3.694F, -10.1247F, -2.0334F, 0.1425F, 0.2035F));

		PartDefinition cube_r89 = leftFace.addOrReplaceChild("cube_r89", CubeListBuilder.create().texOffs(96, 9).addBox(-0.4815F, -0.1584F, -0.8194F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.4545F, -3.694F, -10.1247F, -1.1173F, 0.1777F, 0.1957F));

		PartDefinition cube_r90 = leftFace.addOrReplaceChild("cube_r90", CubeListBuilder.create().texOffs(96, 6).addBox(-0.4815F, -0.6478F, -1.1328F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.153F)), PartPose.offsetAndRotation(0.4545F, -3.694F, -10.1247F, -0.5064F, 0.1777F, 0.1957F));

		PartDefinition cube_r91 = leftFace.addOrReplaceChild("cube_r91", CubeListBuilder.create().texOffs(96, 3).addBox(-0.5283F, -1.1694F, -0.5611F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.4545F, -3.694F, -10.1247F, 0.2658F, 0.1478F, 0.2304F));

		PartDefinition cube_r92 = leftFace.addOrReplaceChild("cube_r92", CubeListBuilder.create().texOffs(90, 50).addBox(-0.5283F, -0.5365F, 0.1473F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.153F)), PartPose.offsetAndRotation(0.4545F, -3.694F, -10.1247F, 1.1821F, 0.1478F, 0.2304F));

		PartDefinition cube_r93 = leftFace.addOrReplaceChild("cube_r93", CubeListBuilder.create().texOffs(50, 81).addBox(0.0F, 0.0F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.007F)), PartPose.offsetAndRotation(0.2548F, -4.9153F, -8.1843F, 0.5571F, -0.2475F, 0.8173F));

		PartDefinition cube_r94 = leftFace.addOrReplaceChild("cube_r94", CubeListBuilder.create().texOffs(70, 23).addBox(-1.0F, -0.1F, -2.0F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.472F, -5.2613F, -7.5449F, 0.5742F, 0.1999F, 0.1448F));

		PartDefinition cube_r95 = leftFace.addOrReplaceChild("cube_r95", CubeListBuilder.create().texOffs(89, 31).addBox(0.0F, 0.0F, -1.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.007F)), PartPose.offsetAndRotation(0.8102F, -5.7304F, -6.4768F, 0.1694F, -0.2069F, 0.9887F));

		PartDefinition cube_r96 = leftFace.addOrReplaceChild("cube_r96", CubeListBuilder.create().texOffs(84, 20).addBox(-0.5331F, -1.8163F, -0.1884F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.007F)), PartPose.offsetAndRotation(1.0335F, -3.7026F, -6.7599F, 0.3532F, 0.2964F, 0.1233F));

		PartDefinition cube_r97 = leftFace.addOrReplaceChild("cube_r97", CubeListBuilder.create().texOffs(12, 89).addBox(0.0F, 0.0F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.007F)), PartPose.offsetAndRotation(0.9303F, -5.566F, -6.0201F, 0.0644F, 0.4148F, 1.0985F));

		PartDefinition cube_r98 = leftFace.addOrReplaceChild("cube_r98", CubeListBuilder.create().texOffs(84, 15).addBox(-0.5331F, -1.9351F, -0.4619F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0335F, -3.7026F, -6.7599F, -0.3013F, 0.2964F, 0.1233F));

		PartDefinition cube_r99 = leftFace.addOrReplaceChild("cube_r99", CubeListBuilder.create().texOffs(50, 58).addBox(-1.007F, -5.1274F, -4.4649F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.9595F, -0.4346F, -5.1741F, 0.3119F, 0.1888F, -0.0984F));

		PartDefinition cube_r100 = leftFace.addOrReplaceChild("cube_r100", CubeListBuilder.create().texOffs(42, 96).addBox(-0.5516F, -1.0336F, 0.2642F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.3936F, -3.2415F, -6.1516F, 0.5496F, 0.3055F, 0.0214F));

		PartDefinition cube_r101 = leftFace.addOrReplaceChild("cube_r101", CubeListBuilder.create().texOffs(96, 18).addBox(-0.6051F, -0.8709F, 0.6153F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.3936F, -3.2415F, -6.1516F, 1.3247F, 0.3033F, 0.059F));

		PartDefinition cube_r102 = leftFace.addOrReplaceChild("cube_r102", CubeListBuilder.create().texOffs(78, 96).addBox(-0.5516F, -1.1765F, -1.4247F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.009F)), PartPose.offsetAndRotation(1.3936F, -3.2415F, -6.1516F, 2.1902F, 0.3055F, 0.0214F));

		PartDefinition cube_r103 = leftFace.addOrReplaceChild("cube_r103", CubeListBuilder.create().texOffs(57, 92).addBox(-0.425F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.2542F, -1.3756F, -12.4933F, 1.2494F, 0.0003F, -0.018F));

		PartDefinition cube_r104 = leftFace.addOrReplaceChild("cube_r104", CubeListBuilder.create().texOffs(96, 82).addBox(-0.5229F, -0.5113F, -0.4996F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.5115F, -1.1953F, -11.3063F, 1.2438F, 0.1824F, -0.0793F));

		PartDefinition cube_r105 = leftFace.addOrReplaceChild("cube_r105", CubeListBuilder.create().texOffs(73, 96).addBox(-0.5516F, 0.0228F, -1.0073F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(1.3936F, -3.2415F, -6.1516F, 1.2739F, 0.3055F, 0.0214F));

		PartDefinition cube_r106 = leftFace.addOrReplaceChild("cube_r106", CubeListBuilder.create().texOffs(25, 96).addBox(-0.5516F, -0.001F, -0.2198F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.009F)), PartPose.offsetAndRotation(1.3936F, -3.2415F, -6.1516F, 1.4833F, 0.3055F, 0.0214F));

		PartDefinition cube_r107 = leftFace.addOrReplaceChild("cube_r107", CubeListBuilder.create().texOffs(10, 93).addBox(-0.5598F, -0.7383F, -1.9453F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.104F, -3.2475F, -6.9253F, 1.8046F, 0.3033F, 0.0198F));

		PartDefinition cube_r108 = leftFace.addOrReplaceChild("cube_r108", CubeListBuilder.create().texOffs(94, 60).addBox(-0.5254F, -1.1673F, -0.155F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F))
				.texOffs(89, 90).addBox(-0.5254F, -1.7673F, -0.755F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(1.104F, -3.2475F, -6.9253F, -3.0299F, 0.3033F, 0.0198F));

		PartDefinition cube_r109 = leftFace.addOrReplaceChild("cube_r109", CubeListBuilder.create().texOffs(94, 30).addBox(-0.5254F, -1.8145F, -1.0947F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.007F)), PartPose.offsetAndRotation(1.104F, -3.2475F, -6.9253F, 2.494F, 0.3033F, 0.0198F));

		PartDefinition cube_r110 = leftFace.addOrReplaceChild("cube_r110", CubeListBuilder.create().texOffs(94, 24).addBox(-0.5254F, -0.7819F, 0.6401F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.104F, -3.2475F, -6.9253F, -2.6111F, 0.3033F, 0.0198F));

		PartDefinition cube_r111 = leftFace.addOrReplaceChild("cube_r111", CubeListBuilder.create().texOffs(83, 96).addBox(-0.5254F, -0.679F, -1.835F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.104F, -3.2475F, -6.9253F, -0.3247F, 0.3033F, 0.0198F));

		PartDefinition cube_r112 = leftFace.addOrReplaceChild("cube_r112", CubeListBuilder.create().texOffs(5, 97).addBox(-0.5254F, 0.6512F, -0.8624F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(1.104F, -3.2475F, -6.9253F, -1.241F, 0.3033F, 0.0198F));

		PartDefinition cube_r113 = leftFace.addOrReplaceChild("cube_r113", CubeListBuilder.create().texOffs(76, 42).addBox(-0.5254F, -1.589F, -1.1416F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(1.104F, -3.2475F, -6.9253F, 0.2687F, 0.3033F, 0.0198F));

		PartDefinition cube_r114 = leftFace.addOrReplaceChild("cube_r114", CubeListBuilder.create().texOffs(94, 36).addBox(-0.7754F, -0.6384F, -0.355F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.3F))
				.texOffs(96, 85).addBox(-0.4504F, -0.6384F, -0.355F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.104F, -3.2475F, -6.9253F, 0.2426F, 0.3033F, 0.0198F));

		PartDefinition cube_r115 = leftFace.addOrReplaceChild("cube_r115", CubeListBuilder.create().texOffs(43, 73).addBox(-0.7593F, -1.7489F, -1.7054F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(0.6166F, -1.7612F, -10.1654F, 0.3956F, 0.1367F, -0.0976F));

		PartDefinition cube_r116 = leftFace.addOrReplaceChild("cube_r116", CubeListBuilder.create().texOffs(95, 53).addBox(-0.5F, -0.4632F, -0.0076F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.4662F, -0.01F, -6.2514F, 0.3923F, 0.3256F, -0.0754F));

		PartDefinition cube_r117 = leftFace.addOrReplaceChild("cube_r117", CubeListBuilder.create().texOffs(95, 50).addBox(-0.5F, -0.4508F, -0.9913F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.4662F, -0.01F, -6.2514F, 0.2177F, 0.3256F, -0.0754F));

		PartDefinition cube_r118 = leftFace.addOrReplaceChild("cube_r118", CubeListBuilder.create().texOffs(37, 95).addBox(-0.5F, -0.3881F, -1.0457F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.2045F, 0.1553F, -7.0955F, 0.2284F, 0.1864F, -0.0727F));

		PartDefinition cube_r119 = leftFace.addOrReplaceChild("cube_r119", CubeListBuilder.create().texOffs(32, 95).addBox(-0.5F, -0.3133F, -1.9248F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.2045F, 0.1553F, -7.0955F, 0.0888F, 0.1864F, -0.0727F));

		PartDefinition cube_r120 = leftFace.addOrReplaceChild("cube_r120", CubeListBuilder.create().texOffs(89, 60).addBox(-0.5F, -1.3F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.6941F, 0.6079F, -9.6625F, 0.0914F, 0.1516F, -0.0723F));

		PartDefinition cube_r121 = leftFace.addOrReplaceChild("cube_r121", CubeListBuilder.create().texOffs(15, 95).addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.5302F, 0.0215F, -10.4558F, 0.0041F, 0.1516F, -0.0723F));

		PartDefinition cube_r122 = leftFace.addOrReplaceChild("cube_r122", CubeListBuilder.create().texOffs(0, 95).addBox(-0.5F, -1.1F, 0.3F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(89, 35).addBox(-0.5F, -1.6F, -0.6F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.2082F, 0.3575F, -12.7171F, 0.2223F, 0.1516F, -0.0723F));

		PartDefinition cube_r123 = leftFace.addOrReplaceChild("cube_r123", CubeListBuilder.create().texOffs(20, 70).addBox(-0.7593F, -0.0548F, -3.2048F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.6166F, -1.7612F, -10.1654F, 0.0465F, 0.1367F, -0.0976F));

		PartDefinition cube_r124 = leftFace.addOrReplaceChild("cube_r124", CubeListBuilder.create().texOffs(57, 79).addBox(-0.7593F, 0.6669F, -1.8192F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.6166F, -1.7612F, -10.1654F, -0.4771F, 0.1367F, -0.0976F));

		PartDefinition cube_r125 = leftFace.addOrReplaceChild("cube_r125", CubeListBuilder.create().texOffs(11, 59).addBox(-0.5F, -1.0F, -4.1F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(-0.2537F, -0.1631F, -8.8201F, -0.1666F, 0.1149F, -0.0902F));

		PartDefinition cube_r126 = leftFace.addOrReplaceChild("cube_r126", CubeListBuilder.create().texOffs(59, 6).addBox(-2.0256F, -1.0496F, -4.0919F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(1.9595F, -0.4346F, -5.1741F, 0.0237F, 0.1837F, -0.102F));

		PartDefinition cube_r127 = leftFace.addOrReplaceChild("cube_r127", CubeListBuilder.create().texOffs(96, 15).addBox(-0.3721F, -0.4845F, 1.2037F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0132F))
				.texOffs(96, 12).addBox(-0.3721F, 0.2155F, 0.9037F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.044F, -0.1467F, -6.5359F, -0.0267F, 0.1961F, -0.0752F));

		PartDefinition cube_r128 = leftFace.addOrReplaceChild("cube_r128", CubeListBuilder.create().texOffs(62, 90).addBox(-0.3721F, -0.1004F, 1.1845F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.044F, -0.1467F, -6.5359F, 0.2875F, 0.1961F, -0.0752F));

		PartDefinition cube_r129 = leftFace.addOrReplaceChild("cube_r129", CubeListBuilder.create().texOffs(81, 57).addBox(-0.3721F, -0.9492F, -0.6921F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(0.044F, -0.1467F, -6.5359F, -0.3932F, 0.1961F, -0.0752F));

		PartDefinition cube_r130 = leftFace.addOrReplaceChild("cube_r130", CubeListBuilder.create().texOffs(29, 73).addBox(-1.0256F, -2.5496F, -3.7919F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(1.9595F, -0.4346F, -5.1741F, 0.0149F, 0.1837F, -0.102F));

		PartDefinition cube_r131 = leftFace.addOrReplaceChild("cube_r131", CubeListBuilder.create().texOffs(51, 71).addBox(-1.0256F, -1.7082F, -5.5934F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.9595F, -0.4346F, -5.1741F, -0.212F, 0.1837F, -0.102F));

		PartDefinition cube_r132 = leftFace.addOrReplaceChild("cube_r132", CubeListBuilder.create().texOffs(7, 73).addBox(-0.165F, -2.6947F, 1.0068F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.825F, 0.0625F, -6.8885F, 0.348F, 0.3294F, -0.1234F));

		PartDefinition cube_r133 = leftFace.addOrReplaceChild("cube_r133", CubeListBuilder.create().texOffs(62, 85).addBox(-0.165F, -2.8749F, 0.0532F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.825F, 0.0625F, -6.8885F, 0.1734F, 0.3294F, -0.1234F));

		PartDefinition cube_r134 = leftFace.addOrReplaceChild("cube_r134", CubeListBuilder.create().texOffs(0, 98).addBox(-0.919F, -1.0895F, -0.2485F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.825F, -1.2375F, -2.3885F, -0.0634F, -0.1046F, -0.0526F));

		PartDefinition cube_r135 = leftFace.addOrReplaceChild("cube_r135", CubeListBuilder.create().texOffs(82, 39).addBox(-2.0697F, -0.6747F, -0.2402F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.825F, -1.7375F, -1.4885F, -1.6406F, -0.1396F, 0.1396F));

		PartDefinition cube_r136 = leftFace.addOrReplaceChild("cube_r136", CubeListBuilder.create().texOffs(83, 51).addBox(-1.9444F, -1.7549F, -0.8748F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.825F, -1.2375F, -2.3885F, -1.0821F, -0.1396F, 0.0F));

		PartDefinition cube_r137 = leftFace.addOrReplaceChild("cube_r137", CubeListBuilder.create().texOffs(93, 47).addBox(-0.919F, -1.7347F, -1.1125F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.825F, -1.2375F, -2.3885F, -1.0757F, -0.1046F, -0.0526F));

		PartDefinition cube_r138 = leftFace.addOrReplaceChild("cube_r138", CubeListBuilder.create().texOffs(94, 94).addBox(-0.919F, -2.0F, -0.661F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.825F, -1.2375F, -2.3885F, -0.3252F, -0.1046F, -0.0526F));

		PartDefinition cube_r139 = leftFace.addOrReplaceChild("cube_r139", CubeListBuilder.create().texOffs(67, 87).addBox(-0.9678F, -2.035F, -0.144F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.825F, -1.2375F, -3.0885F, 0.0671F, 0.0697F, -0.0525F));

		PartDefinition cube_r140 = leftFace.addOrReplaceChild("cube_r140", CubeListBuilder.create().texOffs(95, 56).addBox(0.0F, -0.05F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.012F)), PartPose.offsetAndRotation(1.297F, -5.1259F, -4.845F, 2.6119F, 1.4396F, 2.6267F));

		PartDefinition cube_r141 = leftFace.addOrReplaceChild("cube_r141", CubeListBuilder.create().texOffs(47, 85).addBox(-2.0F, -0.05F, -1.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.012F)), PartPose.offsetAndRotation(1.297F, -5.1259F, -4.845F, 0.2096F, 1.4189F, 0.2223F));

		PartDefinition cube_r142 = leftFace.addOrReplaceChild("cube_r142", CubeListBuilder.create().texOffs(86, 25).addBox(-1.0102F, -1.9488F, -0.0843F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.725F, -1.1375F, -3.7885F, 0.2305F, 0.2132F, -0.0709F));

		PartDefinition cube_r143 = leftFace.addOrReplaceChild("cube_r143", CubeListBuilder.create().texOffs(73, 31).addBox(-0.957F, -1.9404F, 0.0296F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.125F, -0.4375F, -5.3885F, 0.3475F, 0.3669F, -0.1081F));

		PartDefinition cube_r144 = leftFace.addOrReplaceChild("cube_r144", CubeListBuilder.create().texOffs(58, 70).addBox(0.0F, 0.0F, 0.0F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0221F, -3.7281F, -0.4562F, -1.536F, -0.0386F, 1.2924F));

		PartDefinition cube_r145 = leftFace.addOrReplaceChild("cube_r145", CubeListBuilder.create().texOffs(73, 36).addBox(-3.0697F, -0.4023F, 0.1356F, 3.0F, 1.0F, 1.0F, new CubeDeformation(-0.008F)), PartPose.offsetAndRotation(2.825F, -1.7375F, -1.4885F, -0.8029F, -0.1396F, 0.1396F));

		PartDefinition cube_r146 = leftFace.addOrReplaceChild("cube_r146", CubeListBuilder.create().texOffs(62, 97).addBox(-1.0697F, -0.0635F, -0.1616F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.825F, -1.7375F, -1.4885F, -0.4538F, -0.1396F, 0.1396F));

		PartDefinition rightFace = head.addOrReplaceChild("rightFace", CubeListBuilder.create(), PartPose.offset(-0.5F, 0.9104F, 0.9196F));

		PartDefinition cube_r147 = rightFace.addOrReplaceChild("cube_r147", CubeListBuilder.create().texOffs(59, 0).mirror().addBox(-0.5F, 0.0F, 0.0F, 2.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.7178F, -4.8263F, -4.8752F, -1.2874F, -0.2964F, -0.1233F));

		PartDefinition cube_r148 = rightFace.addOrReplaceChild("cube_r148", CubeListBuilder.create().texOffs(26, 85).mirror().addBox(0.0F, 0.0F, -0.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.007F)).mirror(false), PartPose.offsetAndRotation(-1.1468F, -5.1434F, -5.1463F, -0.5813F, -0.0576F, 0.2698F));

		PartDefinition cube_r149 = rightFace.addOrReplaceChild("cube_r149", CubeListBuilder.create().texOffs(84, 61).mirror().addBox(-0.4669F, -2.0046F, 0.124F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.007F)).mirror(false), PartPose.offsetAndRotation(-1.0335F, -3.7026F, -6.7599F, -0.5107F, -0.2964F, -0.1233F));

		PartDefinition cube_r150 = rightFace.addOrReplaceChild("cube_r150", CubeListBuilder.create().texOffs(93, 44).mirror().addBox(-0.5286F, 0.277F, -0.0562F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.148F)).mirror(false), PartPose.offsetAndRotation(-0.2797F, -1.9648F, -12.4795F, -1.5121F, 0.104F, -0.193F));

		PartDefinition cube_r151 = rightFace.addOrReplaceChild("cube_r151", CubeListBuilder.create().texOffs(10, 96).mirror().addBox(-0.5286F, 0.1928F, -0.4126F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false)
				.texOffs(0, 77).mirror().addBox(-0.5286F, -1.3846F, -0.8597F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.158F)).mirror(false), PartPose.offsetAndRotation(-0.2797F, -1.9648F, -12.4795F, -1.8263F, 0.104F, -0.193F));

		PartDefinition cube_r152 = rightFace.addOrReplaceChild("cube_r152", CubeListBuilder.create().texOffs(73, 93).mirror().addBox(-0.5286F, -0.4222F, -1.1475F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.148F)).mirror(false), PartPose.offsetAndRotation(-0.2797F, -1.9648F, -12.4795F, -0.91F, 0.104F, -0.193F));

		PartDefinition cube_r153 = rightFace.addOrReplaceChild("cube_r153", CubeListBuilder.create().texOffs(37, 91).mirror().addBox(-0.4917F, -0.2599F, 0.2128F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.148F)).mirror(false), PartPose.offsetAndRotation(-0.2797F, -1.9648F, -12.4795F, 1.1615F, 0.1333F, -0.2279F));

		PartDefinition cube_r154 = rightFace.addOrReplaceChild("cube_r154", CubeListBuilder.create().texOffs(5, 94).mirror().addBox(-0.4917F, -1.1337F, -0.4756F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(-0.2797F, -1.9648F, -12.4795F, 0.0707F, 0.1333F, -0.2279F));

		PartDefinition cube_r155 = rightFace.addOrReplaceChild("cube_r155", CubeListBuilder.create().texOffs(70, 7).mirror().addBox(-0.025F, -1.175F, -1.425F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.153F)).mirror(false), PartPose.offsetAndRotation(-0.3793F, -2.8495F, -9.5106F, -1.0433F, -0.8824F, -0.3871F));

		PartDefinition cube_r156 = rightFace.addOrReplaceChild("cube_r156", CubeListBuilder.create().texOffs(61, 64).mirror().addBox(-0.5088F, -1.4322F, -1.0237F, 1.0F, 2.0F, 3.0F, new CubeDeformation(-0.153F)).mirror(false), PartPose.offsetAndRotation(-0.4545F, -3.694F, -10.1247F, -2.0334F, -0.1425F, -0.2035F));

		PartDefinition cube_r157 = rightFace.addOrReplaceChild("cube_r157", CubeListBuilder.create().texOffs(96, 9).mirror().addBox(-0.5185F, -0.1584F, -0.8194F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(-0.4545F, -3.694F, -10.1247F, -1.1173F, -0.1777F, -0.1957F));

		PartDefinition cube_r158 = rightFace.addOrReplaceChild("cube_r158", CubeListBuilder.create().texOffs(96, 6).mirror().addBox(-0.5185F, -0.6478F, -1.1328F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.153F)).mirror(false), PartPose.offsetAndRotation(-0.4545F, -3.694F, -10.1247F, -0.5064F, -0.1777F, -0.1957F));

		PartDefinition cube_r159 = rightFace.addOrReplaceChild("cube_r159", CubeListBuilder.create().texOffs(96, 3).mirror().addBox(-0.4717F, -1.1694F, -0.5611F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(-0.4545F, -3.694F, -10.1247F, 0.2658F, -0.1478F, -0.2304F));

		PartDefinition cube_r160 = rightFace.addOrReplaceChild("cube_r160", CubeListBuilder.create().texOffs(90, 50).mirror().addBox(-0.4717F, -0.5365F, 0.1473F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.153F)).mirror(false), PartPose.offsetAndRotation(-0.4545F, -3.694F, -10.1247F, 1.1821F, -0.1478F, -0.2304F));

		PartDefinition cube_r161 = rightFace.addOrReplaceChild("cube_r161", CubeListBuilder.create().texOffs(50, 81).mirror().addBox(-1.0F, 0.0F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.007F)).mirror(false), PartPose.offsetAndRotation(-0.2548F, -4.9153F, -8.1843F, 0.5571F, 0.2475F, -0.8173F));

		PartDefinition cube_r162 = rightFace.addOrReplaceChild("cube_r162", CubeListBuilder.create().texOffs(70, 23).mirror().addBox(0.0F, -0.1F, -2.0F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.472F, -5.2613F, -7.5449F, 0.5742F, -0.1999F, -0.1448F));

		PartDefinition cube_r163 = rightFace.addOrReplaceChild("cube_r163", CubeListBuilder.create().texOffs(89, 31).mirror().addBox(-1.0F, 0.0F, -1.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.007F)).mirror(false), PartPose.offsetAndRotation(-0.8102F, -5.7304F, -6.4768F, 0.1694F, 0.2069F, -0.9887F));

		PartDefinition cube_r164 = rightFace.addOrReplaceChild("cube_r164", CubeListBuilder.create().texOffs(84, 20).mirror().addBox(-0.4669F, -1.8163F, -0.1884F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.007F)).mirror(false), PartPose.offsetAndRotation(-1.0335F, -3.7026F, -6.7599F, 0.3532F, -0.2964F, -0.1233F));

		PartDefinition cube_r165 = rightFace.addOrReplaceChild("cube_r165", CubeListBuilder.create().texOffs(12, 89).mirror().addBox(-1.0F, 0.0F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.007F)).mirror(false), PartPose.offsetAndRotation(-0.9303F, -5.566F, -6.0201F, 0.0644F, -0.4148F, -1.0985F));

		PartDefinition cube_r166 = rightFace.addOrReplaceChild("cube_r166", CubeListBuilder.create().texOffs(84, 15).mirror().addBox(-0.4669F, -1.9351F, -0.4619F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0335F, -3.7026F, -6.7599F, -0.3013F, -0.2964F, -0.1233F));

		PartDefinition cube_r167 = rightFace.addOrReplaceChild("cube_r167", CubeListBuilder.create().texOffs(50, 58).mirror().addBox(0.007F, -5.1274F, -4.4649F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.9595F, -0.4346F, -5.1741F, 0.3119F, -0.1888F, 0.0984F));

		PartDefinition cube_r168 = rightFace.addOrReplaceChild("cube_r168", CubeListBuilder.create().texOffs(42, 96).mirror().addBox(-0.4484F, -1.0336F, 0.2642F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.3936F, -3.2415F, -6.1516F, 0.5496F, -0.3055F, -0.0214F));

		PartDefinition cube_r169 = rightFace.addOrReplaceChild("cube_r169", CubeListBuilder.create().texOffs(96, 18).mirror().addBox(-0.3949F, -0.8709F, 0.6153F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.3936F, -3.2415F, -6.1516F, 1.3247F, -0.3033F, -0.059F));

		PartDefinition cube_r170 = rightFace.addOrReplaceChild("cube_r170", CubeListBuilder.create().texOffs(78, 96).mirror().addBox(-0.4484F, -1.1765F, -1.4247F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.009F)).mirror(false), PartPose.offsetAndRotation(-1.3936F, -3.2415F, -6.1516F, 2.1902F, -0.3055F, -0.0214F));

		PartDefinition cube_r171 = rightFace.addOrReplaceChild("cube_r171", CubeListBuilder.create().texOffs(57, 92).mirror().addBox(-0.575F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.2542F, -1.3756F, -12.4933F, 1.2494F, -0.0003F, 0.018F));

		PartDefinition cube_r172 = rightFace.addOrReplaceChild("cube_r172", CubeListBuilder.create().texOffs(96, 82).mirror().addBox(-0.4771F, -0.5113F, -0.4996F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.5115F, -1.1953F, -11.3063F, 1.2438F, -0.1824F, 0.0793F));

		PartDefinition cube_r173 = rightFace.addOrReplaceChild("cube_r173", CubeListBuilder.create().texOffs(73, 96).mirror().addBox(-0.4484F, 0.0228F, -1.0073F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(-1.3936F, -3.2415F, -6.1516F, 1.2739F, -0.3055F, -0.0214F));

		PartDefinition cube_r174 = rightFace.addOrReplaceChild("cube_r174", CubeListBuilder.create().texOffs(25, 96).mirror().addBox(-0.4484F, -0.001F, -0.2198F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.009F)).mirror(false), PartPose.offsetAndRotation(-1.3936F, -3.2415F, -6.1516F, 1.4833F, -0.3055F, -0.0214F));

		PartDefinition cube_r175 = rightFace.addOrReplaceChild("cube_r175", CubeListBuilder.create().texOffs(10, 93).mirror().addBox(-0.4402F, -0.7383F, -1.9453F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.104F, -3.2475F, -6.9253F, 1.8046F, -0.3033F, -0.0198F));

		PartDefinition cube_r176 = rightFace.addOrReplaceChild("cube_r176", CubeListBuilder.create().texOffs(94, 60).mirror().addBox(-0.4746F, -1.1673F, -0.155F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F)).mirror(false)
				.texOffs(89, 90).mirror().addBox(-0.4746F, -1.7673F, -0.755F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.008F)).mirror(false), PartPose.offsetAndRotation(-1.104F, -3.2475F, -6.9253F, -3.0299F, -0.3033F, -0.0198F));

		PartDefinition cube_r177 = rightFace.addOrReplaceChild("cube_r177", CubeListBuilder.create().texOffs(94, 30).mirror().addBox(-0.4746F, -1.8145F, -1.0947F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.007F)).mirror(false), PartPose.offsetAndRotation(-1.104F, -3.2475F, -6.9253F, 2.494F, -0.3033F, -0.0198F));

		PartDefinition cube_r178 = rightFace.addOrReplaceChild("cube_r178", CubeListBuilder.create().texOffs(94, 24).mirror().addBox(-0.4746F, -0.7819F, 0.6401F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.104F, -3.2475F, -6.9253F, -2.6111F, -0.3033F, -0.0198F));

		PartDefinition cube_r179 = rightFace.addOrReplaceChild("cube_r179", CubeListBuilder.create().texOffs(83, 96).mirror().addBox(-0.4746F, -0.679F, -1.835F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.104F, -3.2475F, -6.9253F, -0.3247F, -0.3033F, -0.0198F));

		PartDefinition cube_r180 = rightFace.addOrReplaceChild("cube_r180", CubeListBuilder.create().texOffs(5, 97).mirror().addBox(-0.4746F, 0.6512F, -0.8624F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(-1.104F, -3.2475F, -6.9253F, -1.241F, -0.3033F, -0.0198F));

		PartDefinition cube_r181 = rightFace.addOrReplaceChild("cube_r181", CubeListBuilder.create().texOffs(76, 42).mirror().addBox(-0.4746F, -1.589F, -1.1416F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(-1.104F, -3.2475F, -6.9253F, 0.2687F, -0.3033F, -0.0198F));

		PartDefinition cube_r182 = rightFace.addOrReplaceChild("cube_r182", CubeListBuilder.create().texOffs(94, 36).mirror().addBox(-0.2246F, -0.6384F, -0.355F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.3F)).mirror(false)
				.texOffs(96, 85).mirror().addBox(-0.5496F, -0.6384F, -0.355F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.104F, -3.2475F, -6.9253F, 0.2426F, -0.3033F, -0.0198F));

		PartDefinition cube_r183 = rightFace.addOrReplaceChild("cube_r183", CubeListBuilder.create().texOffs(43, 73).mirror().addBox(-0.2407F, -1.7489F, -1.7054F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(-0.6166F, -1.7612F, -10.1654F, 0.3956F, -0.1367F, 0.0976F));

		PartDefinition cube_r184 = rightFace.addOrReplaceChild("cube_r184", CubeListBuilder.create().texOffs(95, 53).mirror().addBox(-0.5F, -0.4632F, -0.0076F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.4662F, -0.01F, -6.2514F, 0.3923F, -0.3256F, 0.0754F));

		PartDefinition cube_r185 = rightFace.addOrReplaceChild("cube_r185", CubeListBuilder.create().texOffs(95, 50).mirror().addBox(-0.5F, -0.4508F, -0.9913F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.4662F, -0.01F, -6.2514F, 0.2177F, -0.3256F, 0.0754F));

		PartDefinition cube_r186 = rightFace.addOrReplaceChild("cube_r186", CubeListBuilder.create().texOffs(37, 95).mirror().addBox(-0.5F, -0.3881F, -1.0457F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.2045F, 0.1553F, -7.0955F, 0.2284F, -0.1864F, 0.0727F));

		PartDefinition cube_r187 = rightFace.addOrReplaceChild("cube_r187", CubeListBuilder.create().texOffs(32, 95).mirror().addBox(-0.5F, -0.3133F, -1.9248F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.2045F, 0.1553F, -7.0955F, 0.0888F, -0.1864F, 0.0727F));

		PartDefinition cube_r188 = rightFace.addOrReplaceChild("cube_r188", CubeListBuilder.create().texOffs(89, 60).mirror().addBox(-0.5F, -1.3F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.6941F, 0.6079F, -9.6625F, 0.0914F, -0.1516F, 0.0723F));

		PartDefinition cube_r189 = rightFace.addOrReplaceChild("cube_r189", CubeListBuilder.create().texOffs(15, 95).mirror().addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.5302F, 0.0215F, -10.4558F, 0.0041F, -0.1516F, 0.0723F));

		PartDefinition cube_r190 = rightFace.addOrReplaceChild("cube_r190", CubeListBuilder.create().texOffs(0, 95).mirror().addBox(-0.5F, -1.1F, 0.3F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(89, 35).mirror().addBox(-0.5F, -1.6F, -0.6F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.2082F, 0.3575F, -12.7171F, 0.2223F, -0.1516F, 0.0723F));

		PartDefinition cube_r191 = rightFace.addOrReplaceChild("cube_r191", CubeListBuilder.create().texOffs(20, 70).mirror().addBox(-0.2407F, -0.0548F, -3.2048F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(-0.6166F, -1.7612F, -10.1654F, 0.0465F, -0.1367F, 0.0976F));

		PartDefinition cube_r192 = rightFace.addOrReplaceChild("cube_r192", CubeListBuilder.create().texOffs(57, 79).mirror().addBox(-0.2407F, 0.6669F, -1.8192F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.6166F, -1.7612F, -10.1654F, -0.4771F, -0.1367F, 0.0976F));

		PartDefinition cube_r193 = rightFace.addOrReplaceChild("cube_r193", CubeListBuilder.create().texOffs(11, 59).mirror().addBox(-0.5F, -1.0F, -4.1F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.009F)).mirror(false), PartPose.offsetAndRotation(0.2537F, -0.1631F, -8.8201F, -0.1666F, -0.1149F, 0.0902F));

		PartDefinition cube_r194 = rightFace.addOrReplaceChild("cube_r194", CubeListBuilder.create().texOffs(59, 6).mirror().addBox(1.0256F, -1.0496F, -4.0919F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.009F)).mirror(false), PartPose.offsetAndRotation(-1.9595F, -0.4346F, -5.1741F, 0.0237F, -0.1837F, 0.102F));

		PartDefinition cube_r195 = rightFace.addOrReplaceChild("cube_r195", CubeListBuilder.create().texOffs(96, 15).mirror().addBox(-0.6279F, -0.4845F, 1.2037F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0132F)).mirror(false)
				.texOffs(96, 12).mirror().addBox(-0.6279F, 0.2155F, 0.9037F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-0.044F, -0.1467F, -6.5359F, -0.0267F, -0.1961F, 0.0752F));

		PartDefinition cube_r196 = rightFace.addOrReplaceChild("cube_r196", CubeListBuilder.create().texOffs(62, 90).mirror().addBox(-0.6279F, -0.1004F, 1.1845F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-0.044F, -0.1467F, -6.5359F, 0.2875F, -0.1961F, 0.0752F));

		PartDefinition cube_r197 = rightFace.addOrReplaceChild("cube_r197", CubeListBuilder.create().texOffs(81, 57).mirror().addBox(-0.6279F, -0.9492F, -0.6921F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.009F)).mirror(false), PartPose.offsetAndRotation(-0.044F, -0.1467F, -6.5359F, -0.3932F, -0.1961F, 0.0752F));

		PartDefinition cube_r198 = rightFace.addOrReplaceChild("cube_r198", CubeListBuilder.create().texOffs(29, 73).mirror().addBox(0.0256F, -2.5496F, -3.7919F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.009F)).mirror(false), PartPose.offsetAndRotation(-1.9595F, -0.4346F, -5.1741F, 0.0149F, -0.1837F, 0.102F));

		PartDefinition cube_r199 = rightFace.addOrReplaceChild("cube_r199", CubeListBuilder.create().texOffs(51, 71).mirror().addBox(0.0256F, -1.7082F, -5.5934F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.9595F, -0.4346F, -5.1741F, -0.212F, -0.1837F, 0.102F));

		PartDefinition cube_r200 = rightFace.addOrReplaceChild("cube_r200", CubeListBuilder.create().texOffs(7, 73).mirror().addBox(-0.835F, -2.6947F, 1.0068F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.825F, 0.0625F, -6.8885F, 0.348F, -0.3294F, 0.1234F));

		PartDefinition cube_r201 = rightFace.addOrReplaceChild("cube_r201", CubeListBuilder.create().texOffs(62, 85).mirror().addBox(-0.835F, -2.8749F, 0.0532F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.825F, 0.0625F, -6.8885F, 0.1734F, -0.3294F, 0.1234F));

		PartDefinition cube_r202 = rightFace.addOrReplaceChild("cube_r202", CubeListBuilder.create().texOffs(0, 98).mirror().addBox(-0.081F, -1.0895F, -0.2485F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.825F, -1.2375F, -2.3885F, -0.0634F, 0.1046F, 0.0526F));

		PartDefinition cube_r203 = rightFace.addOrReplaceChild("cube_r203", CubeListBuilder.create().texOffs(82, 39).mirror().addBox(0.0697F, -0.6747F, -0.2402F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.825F, -1.7375F, -1.4885F, -1.6406F, 0.1396F, -0.1396F));

		PartDefinition cube_r204 = rightFace.addOrReplaceChild("cube_r204", CubeListBuilder.create().texOffs(83, 51).mirror().addBox(-0.0556F, -1.7549F, -0.8748F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.825F, -1.2375F, -2.3885F, -1.0821F, 0.1396F, 0.0F));

		PartDefinition cube_r205 = rightFace.addOrReplaceChild("cube_r205", CubeListBuilder.create().texOffs(93, 47).mirror().addBox(-0.081F, -1.7347F, -1.1125F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.825F, -1.2375F, -2.3885F, -1.0757F, 0.1046F, 0.0526F));

		PartDefinition cube_r206 = rightFace.addOrReplaceChild("cube_r206", CubeListBuilder.create().texOffs(94, 94).mirror().addBox(-0.081F, -2.0F, -0.661F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.825F, -1.2375F, -2.3885F, -0.3252F, 0.1046F, 0.0526F));

		PartDefinition cube_r207 = rightFace.addOrReplaceChild("cube_r207", CubeListBuilder.create().texOffs(67, 87).mirror().addBox(-0.0322F, -2.035F, -0.144F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.825F, -1.2375F, -3.0885F, 0.0671F, -0.0697F, 0.0525F));

		PartDefinition cube_r208 = rightFace.addOrReplaceChild("cube_r208", CubeListBuilder.create().texOffs(95, 56).mirror().addBox(-1.0F, -0.05F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.012F)).mirror(false), PartPose.offsetAndRotation(-1.297F, -5.1259F, -4.845F, 2.6119F, -1.4396F, -2.6267F));

		PartDefinition cube_r209 = rightFace.addOrReplaceChild("cube_r209", CubeListBuilder.create().texOffs(47, 85).mirror().addBox(0.0F, -0.05F, -1.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.012F)).mirror(false), PartPose.offsetAndRotation(-1.297F, -5.1259F, -4.845F, 0.2096F, -1.4189F, -0.2223F));

		PartDefinition cube_r210 = rightFace.addOrReplaceChild("cube_r210", CubeListBuilder.create().texOffs(86, 25).mirror().addBox(0.0102F, -1.9488F, -0.0843F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.725F, -1.1375F, -3.7885F, 0.2305F, -0.2132F, 0.0709F));

		PartDefinition cube_r211 = rightFace.addOrReplaceChild("cube_r211", CubeListBuilder.create().texOffs(73, 31).mirror().addBox(-0.043F, -1.9404F, 0.0296F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.125F, -0.4375F, -5.3885F, 0.3475F, -0.3669F, 0.1081F));

		PartDefinition cube_r212 = rightFace.addOrReplaceChild("cube_r212", CubeListBuilder.create().texOffs(58, 70).mirror().addBox(-2.0F, 0.0F, 0.0F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0221F, -3.7281F, -0.4562F, -1.536F, 0.0386F, -1.2924F));

		PartDefinition cube_r213 = rightFace.addOrReplaceChild("cube_r213", CubeListBuilder.create().texOffs(73, 36).mirror().addBox(0.0697F, -0.4023F, 0.1356F, 3.0F, 1.0F, 1.0F, new CubeDeformation(-0.008F)).mirror(false), PartPose.offsetAndRotation(-2.825F, -1.7375F, -1.4885F, -0.8029F, 0.1396F, -0.1396F));

		PartDefinition cube_r214 = rightFace.addOrReplaceChild("cube_r214", CubeListBuilder.create().texOffs(62, 97).mirror().addBox(0.0697F, -0.0635F, -0.1616F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.825F, -1.7375F, -1.4885F, -0.4538F, 0.1396F, -0.1396F));

		PartDefinition lower_jaw = head.addOrReplaceChild("lower_jaw", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.1596F, -0.0661F, 0.5672F, 0.0F, 0.0F));

		PartDefinition cube_r215 = lower_jaw.addOrReplaceChild("cube_r215", CubeListBuilder.create().texOffs(0, 91).mirror().addBox(-0.6785F, -2.044F, -5.9375F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-2.0F, 3.29F, -5.39F, 0.2357F, -0.2941F, -0.1756F));

		PartDefinition cube_r216 = lower_jaw.addOrReplaceChild("cube_r216", CubeListBuilder.create().texOffs(91, 84).mirror().addBox(-0.6785F, 1.0012F, -4.9542F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-2.0F, 3.29F, -5.39F, -0.2879F, -0.2941F, -0.1756F));

		PartDefinition cube_r217 = lower_jaw.addOrReplaceChild("cube_r217", CubeListBuilder.create().texOffs(95, 79).mirror().addBox(-0.0545F, 0.6474F, -4.2163F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-2.0F, 3.29F, -5.39F, -0.0944F, -0.156F, -0.0662F));

		PartDefinition cube_r218 = lower_jaw.addOrReplaceChild("cube_r218", CubeListBuilder.create().texOffs(95, 76).mirror().addBox(-0.0545F, 0.0339F, -3.4677F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-2.0F, 3.29F, -5.39F, 0.0801F, -0.156F, -0.0662F));

		PartDefinition cube_r219 = lower_jaw.addOrReplaceChild("cube_r219", CubeListBuilder.create().texOffs(95, 73).mirror().addBox(-0.0545F, -0.7191F, -2.5243F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-2.0F, 3.29F, -5.39F, 0.3943F, -0.156F, -0.0662F));

		PartDefinition cube_r220 = lower_jaw.addOrReplaceChild("cube_r220", CubeListBuilder.create().texOffs(95, 70).mirror().addBox(0.0442F, -0.9859F, -1.7207F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-2.0F, 3.29F, -5.39F, 0.5164F, -0.156F, -0.0662F));

		PartDefinition cube_r221 = lower_jaw.addOrReplaceChild("cube_r221", CubeListBuilder.create().texOffs(93, 41).mirror().addBox(0.0444F, -1.0312F, -0.7733F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-2.0F, 3.29F, -5.39F, 0.6221F, -0.1541F, -0.0752F));

		PartDefinition cube_r222 = lower_jaw.addOrReplaceChild("cube_r222", CubeListBuilder.create().texOffs(94, 27).mirror().addBox(-0.415F, -1.2555F, -3.5349F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-2.9F, 1.09F, -2.49F, 0.7291F, -0.3977F, -0.0806F));

		PartDefinition cube_r223 = lower_jaw.addOrReplaceChild("cube_r223", CubeListBuilder.create().texOffs(96, 21).mirror().addBox(-0.4639F, -2.8292F, -5.1841F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.015F)).mirror(false), PartPose.offsetAndRotation(-2.0F, 3.29F, -5.39F, 0.6157F, -0.2771F, -0.0873F));

		PartDefinition cube_r224 = lower_jaw.addOrReplaceChild("cube_r224", CubeListBuilder.create().texOffs(67, 97).mirror().addBox(-0.4639F, 2.1867F, -4.5007F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.01F)).mirror(false), PartPose.offsetAndRotation(-2.0F, 3.29F, -5.39F, -0.3442F, -0.2771F, -0.0873F));

		PartDefinition cube_r225 = lower_jaw.addOrReplaceChild("cube_r225", CubeListBuilder.create().texOffs(94, 91).mirror().addBox(0.0539F, 1.4472F, -4.1288F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.015F)).mirror(false), PartPose.offsetAndRotation(-2.0F, 3.29F, -5.39F, -0.1559F, -0.1564F, -0.0631F));

		PartDefinition cube_r226 = lower_jaw.addOrReplaceChild("cube_r226", CubeListBuilder.create().texOffs(42, 32).mirror().addBox(0.0539F, 0.7745F, -3.5552F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.01F)).mirror(false), PartPose.offsetAndRotation(-2.0F, 3.29F, -5.39F, 0.0448F, -0.1564F, -0.0631F));

		PartDefinition cube_r227 = lower_jaw.addOrReplaceChild("cube_r227", CubeListBuilder.create().texOffs(81, 47).mirror().addBox(0.0539F, 0.2434F, -3.3268F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(-2.0F, 3.29F, -5.39F, 0.2194F, -0.1564F, -0.0631F));

		PartDefinition cube_r228 = lower_jaw.addOrReplaceChild("cube_r228", CubeListBuilder.create().texOffs(96, 0).mirror().addBox(0.0444F, 0.4564F, -0.7089F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.0155F)).mirror(false)
				.texOffs(26, 81).mirror().addBox(0.0444F, 0.4564F, -1.9089F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.015F)).mirror(false), PartPose.offsetAndRotation(-2.0F, 3.29F, -5.39F, 0.2382F, -0.1541F, -0.0752F));

		PartDefinition cube_r229 = lower_jaw.addOrReplaceChild("cube_r229", CubeListBuilder.create().texOffs(77, 63).mirror().addBox(0.0444F, -0.4891F, -1.7689F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.01F)).mirror(false), PartPose.offsetAndRotation(-2.0F, 3.29F, -5.39F, 0.6483F, -0.1541F, -0.0752F));

		PartDefinition cube_r230 = lower_jaw.addOrReplaceChild("cube_r230", CubeListBuilder.create().texOffs(95, 67).mirror().addBox(0.7793F, 0.9825F, -1.6863F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.007F)).mirror(false), PartPose.offsetAndRotation(-2.9F, 1.09F, -5.39F, 0.7551F, -0.3138F, -0.0549F));

		PartDefinition cube_r231 = lower_jaw.addOrReplaceChild("cube_r231", CubeListBuilder.create().texOffs(65, 76).mirror().addBox(-0.1159F, -1.4812F, -3.1388F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(-2.9F, 1.09F, -2.49F, 0.9732F, -0.3138F, -0.0549F));

		PartDefinition cube_r232 = lower_jaw.addOrReplaceChild("cube_r232", CubeListBuilder.create().texOffs(22, 64).mirror().addBox(-0.1159F, 0.717F, -3.5169F, 1.0F, 2.0F, 3.0F, new CubeDeformation(-0.01F)).mirror(false), PartPose.offsetAndRotation(-2.9F, 1.09F, -2.49F, 0.2926F, -0.3138F, -0.0549F));

		PartDefinition cube_r233 = lower_jaw.addOrReplaceChild("cube_r233", CubeListBuilder.create().texOffs(71, 82).mirror().addBox(0.0083F, -1.1575F, -1.4971F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.007F)).mirror(false), PartPose.offsetAndRotation(-2.9F, 1.09F, -2.49F, 0.7156F, -0.2443F, 0.0F));

		PartDefinition cube_r234 = lower_jaw.addOrReplaceChild("cube_r234", CubeListBuilder.create().texOffs(57, 88).mirror().addBox(0.0083F, 0.5102F, -1.1492F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.9F, 1.09F, -2.49F, 0.5061F, -0.2443F, 0.0F));

		PartDefinition cube_r235 = lower_jaw.addOrReplaceChild("cube_r235", CubeListBuilder.create().texOffs(22, 88).mirror().addBox(0.0083F, -0.9036F, -0.9034F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.007F)).mirror(false), PartPose.offsetAndRotation(-2.9F, 1.09F, -2.49F, 0.3491F, -0.2443F, 0.0F));

		PartDefinition cube_r236 = lower_jaw.addOrReplaceChild("cube_r236", CubeListBuilder.create().texOffs(32, 91).mirror().addBox(0.1F, 1.2221F, -1.1871F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.007F)).mirror(false), PartPose.offsetAndRotation(-3.1F, 1.09F, 0.61F, -1.4748F, -0.0349F, 0.0F));

		PartDefinition cube_r237 = lower_jaw.addOrReplaceChild("cube_r237", CubeListBuilder.create().texOffs(57, 95).mirror().addBox(0.1F, -0.9346F, -3.0172F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.009F)).mirror(false), PartPose.offsetAndRotation(-3.1F, 1.09F, 0.61F, 0.8203F, -0.0349F, 0.0F));

		PartDefinition cube_r238 = lower_jaw.addOrReplaceChild("cube_r238", CubeListBuilder.create().texOffs(74, 70).mirror().addBox(0.1F, -0.5889F, -3.443F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.007F)).mirror(false), PartPose.offsetAndRotation(-3.1F, 1.09F, 0.61F, 0.0785F, -0.0349F, 0.0F));

		PartDefinition cube_r239 = lower_jaw.addOrReplaceChild("cube_r239", CubeListBuilder.create().texOffs(89, 94).mirror().addBox(0.1F, -1.0707F, -1.7707F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(94, 88).mirror().addBox(0.1F, -0.4303F, -1.6663F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.007F)).mirror(false), PartPose.offsetAndRotation(-3.1F, 1.09F, 0.61F, 0.7854F, -0.0349F, 0.0F));

		PartDefinition cube_r240 = lower_jaw.addOrReplaceChild("cube_r240", CubeListBuilder.create().texOffs(5, 90).mirror().addBox(0.1F, -1.5546F, -0.7551F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.009F)).mirror(false), PartPose.offsetAndRotation(-3.1F, 1.09F, 0.61F, 0.9599F, -0.0349F, 0.0F));

		PartDefinition cube_r241 = lower_jaw.addOrReplaceChild("cube_r241", CubeListBuilder.create().texOffs(20, 96).mirror().addBox(0.1F, -1.6978F, -0.6231F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.007F)).mirror(false), PartPose.offsetAndRotation(-3.1F, 1.09F, 0.61F, 0.7418F, -0.0349F, 0.0F));

		PartDefinition cube_r242 = lower_jaw.addOrReplaceChild("cube_r242", CubeListBuilder.create().texOffs(12, 80).mirror().addBox(0.1F, -1.0F, -1.9F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.007F)).mirror(false), PartPose.offsetAndRotation(-3.1F, 1.09F, 0.61F, 0.0F, -0.0349F, 0.0F));

		PartDefinition cube_r243 = lower_jaw.addOrReplaceChild("cube_r243", CubeListBuilder.create().texOffs(0, 91).addBox(-0.3215F, -2.044F, -5.9375F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(2.0F, 3.29F, -5.39F, 0.2357F, 0.2941F, 0.1756F));

		PartDefinition cube_r244 = lower_jaw.addOrReplaceChild("cube_r244", CubeListBuilder.create().texOffs(91, 84).addBox(-0.3215F, 1.0012F, -4.9542F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(2.0F, 3.29F, -5.39F, -0.2879F, 0.2941F, 0.1756F));

		PartDefinition cube_r245 = lower_jaw.addOrReplaceChild("cube_r245", CubeListBuilder.create().texOffs(95, 79).addBox(-0.9455F, 0.6474F, -4.2163F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(2.0F, 3.29F, -5.39F, -0.0944F, 0.156F, 0.0662F));

		PartDefinition cube_r246 = lower_jaw.addOrReplaceChild("cube_r246", CubeListBuilder.create().texOffs(95, 76).addBox(-0.9455F, 0.0339F, -3.4677F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(2.0F, 3.29F, -5.39F, 0.0801F, 0.156F, 0.0662F));

		PartDefinition cube_r247 = lower_jaw.addOrReplaceChild("cube_r247", CubeListBuilder.create().texOffs(95, 73).addBox(-0.9455F, -0.7191F, -2.5243F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(2.0F, 3.29F, -5.39F, 0.3943F, 0.156F, 0.0662F));

		PartDefinition cube_r248 = lower_jaw.addOrReplaceChild("cube_r248", CubeListBuilder.create().texOffs(95, 70).addBox(-1.0442F, -0.9859F, -1.7207F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(2.0F, 3.29F, -5.39F, 0.5164F, 0.156F, 0.0662F));

		PartDefinition cube_r249 = lower_jaw.addOrReplaceChild("cube_r249", CubeListBuilder.create().texOffs(93, 41).addBox(-1.0444F, -1.0312F, -0.7733F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(2.0F, 3.29F, -5.39F, 0.6221F, 0.1541F, 0.0752F));

		PartDefinition cube_r250 = lower_jaw.addOrReplaceChild("cube_r250", CubeListBuilder.create().texOffs(94, 27).addBox(-0.585F, -1.2555F, -3.5349F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(2.9F, 1.09F, -2.49F, 0.7291F, 0.3977F, 0.0806F));

		PartDefinition cube_r251 = lower_jaw.addOrReplaceChild("cube_r251", CubeListBuilder.create().texOffs(96, 21).addBox(-0.5361F, -2.8292F, -5.1841F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.015F)), PartPose.offsetAndRotation(2.0F, 3.29F, -5.39F, 0.6157F, 0.2771F, 0.0873F));

		PartDefinition cube_r252 = lower_jaw.addOrReplaceChild("cube_r252", CubeListBuilder.create().texOffs(67, 97).addBox(-0.5361F, 2.1867F, -4.5007F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(2.0F, 3.29F, -5.39F, -0.3442F, 0.2771F, 0.0873F));

		PartDefinition cube_r253 = lower_jaw.addOrReplaceChild("cube_r253", CubeListBuilder.create().texOffs(94, 91).addBox(-1.0539F, 1.4472F, -4.1288F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.015F)), PartPose.offsetAndRotation(2.0F, 3.29F, -5.39F, -0.1559F, 0.1564F, 0.0631F));

		PartDefinition cube_r254 = lower_jaw.addOrReplaceChild("cube_r254", CubeListBuilder.create().texOffs(42, 32).addBox(-1.0539F, 0.7745F, -3.5552F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(2.0F, 3.29F, -5.39F, 0.0448F, 0.1564F, 0.0631F));

		PartDefinition cube_r255 = lower_jaw.addOrReplaceChild("cube_r255", CubeListBuilder.create().texOffs(81, 47).addBox(-1.0539F, 0.2434F, -3.3268F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(2.0F, 3.29F, -5.39F, 0.2194F, 0.1564F, 0.0631F));

		PartDefinition cube_r256 = lower_jaw.addOrReplaceChild("cube_r256", CubeListBuilder.create().texOffs(96, 0).addBox(-1.0444F, 0.4564F, -0.7089F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.0155F))
				.texOffs(26, 81).addBox(-1.0444F, 0.4564F, -1.9089F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.015F)), PartPose.offsetAndRotation(2.0F, 3.29F, -5.39F, 0.2382F, 0.1541F, 0.0752F));

		PartDefinition cube_r257 = lower_jaw.addOrReplaceChild("cube_r257", CubeListBuilder.create().texOffs(77, 63).addBox(-1.0444F, -0.4891F, -1.7689F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(2.0F, 3.29F, -5.39F, 0.6483F, 0.1541F, 0.0752F));

		PartDefinition cube_r258 = lower_jaw.addOrReplaceChild("cube_r258", CubeListBuilder.create().texOffs(95, 67).addBox(-1.7793F, 0.9825F, -1.6863F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.007F)), PartPose.offsetAndRotation(2.9F, 1.09F, -5.39F, 0.7551F, 0.3138F, 0.0549F));

		PartDefinition cube_r259 = lower_jaw.addOrReplaceChild("cube_r259", CubeListBuilder.create().texOffs(65, 76).addBox(-0.8841F, -1.4812F, -3.1388F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(2.9F, 1.09F, -2.49F, 0.9732F, 0.3138F, 0.0549F));

		PartDefinition cube_r260 = lower_jaw.addOrReplaceChild("cube_r260", CubeListBuilder.create().texOffs(22, 64).addBox(-0.8841F, 0.717F, -3.5169F, 1.0F, 2.0F, 3.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(2.9F, 1.09F, -2.49F, 0.2926F, 0.3138F, 0.0549F));

		PartDefinition cube_r261 = lower_jaw.addOrReplaceChild("cube_r261", CubeListBuilder.create().texOffs(71, 82).addBox(-1.0083F, -1.1575F, -1.4971F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(2.9F, 1.09F, -2.49F, 0.7156F, 0.2443F, 0.0F));

		PartDefinition cube_r262 = lower_jaw.addOrReplaceChild("cube_r262", CubeListBuilder.create().texOffs(57, 88).addBox(-1.0083F, 0.5102F, -1.1492F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.9F, 1.09F, -2.49F, 0.5061F, 0.2443F, 0.0F));

		PartDefinition cube_r263 = lower_jaw.addOrReplaceChild("cube_r263", CubeListBuilder.create().texOffs(22, 88).addBox(-1.0083F, -0.9036F, -0.9034F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.007F)), PartPose.offsetAndRotation(2.9F, 1.09F, -2.49F, 0.3491F, 0.2443F, 0.0F));

		PartDefinition cube_r264 = lower_jaw.addOrReplaceChild("cube_r264", CubeListBuilder.create().texOffs(32, 91).addBox(-1.1F, 1.2221F, -1.1871F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(3.1F, 1.09F, 0.61F, -1.4748F, 0.0349F, 0.0F));

		PartDefinition cube_r265 = lower_jaw.addOrReplaceChild("cube_r265", CubeListBuilder.create().texOffs(57, 95).addBox(-1.1F, -0.9346F, -3.0172F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.009F)), PartPose.offsetAndRotation(3.1F, 1.09F, 0.61F, 0.8203F, 0.0349F, 0.0F));

		PartDefinition cube_r266 = lower_jaw.addOrReplaceChild("cube_r266", CubeListBuilder.create().texOffs(74, 70).addBox(-1.1F, -0.5889F, -3.443F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.007F)), PartPose.offsetAndRotation(3.1F, 1.09F, 0.61F, 0.0785F, 0.0349F, 0.0F));

		PartDefinition cube_r267 = lower_jaw.addOrReplaceChild("cube_r267", CubeListBuilder.create().texOffs(89, 94).addBox(-1.1F, -1.0707F, -1.7707F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(94, 88).addBox(-1.1F, -0.4303F, -1.6663F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(3.1F, 1.09F, 0.61F, 0.7854F, 0.0349F, 0.0F));

		PartDefinition cube_r268 = lower_jaw.addOrReplaceChild("cube_r268", CubeListBuilder.create().texOffs(5, 90).addBox(-1.1F, -1.5546F, -0.7551F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(3.1F, 1.09F, 0.61F, 0.9599F, 0.0349F, 0.0F));

		PartDefinition cube_r269 = lower_jaw.addOrReplaceChild("cube_r269", CubeListBuilder.create().texOffs(20, 96).addBox(-1.1F, -1.6978F, -0.6231F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.007F)), PartPose.offsetAndRotation(3.1F, 1.09F, 0.61F, 0.7418F, 0.0349F, 0.0F));

		PartDefinition cube_r270 = lower_jaw.addOrReplaceChild("cube_r270", CubeListBuilder.create().texOffs(12, 80).addBox(-1.1F, -1.0F, -1.9F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.007F)), PartPose.offsetAndRotation(3.1F, 1.09F, 0.61F, 0.0F, 0.0349F, 0.0F));

		return LayerDefinition.create(meshdefinition, 103, 103);
	}

	@Override
	public void setupAnim(float p_170950_, float p_170951_, float p_170952_) {		
		this.fossil.yRot = p_170951_ * ((float)Math.PI / 180F);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
		fossil.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}
}