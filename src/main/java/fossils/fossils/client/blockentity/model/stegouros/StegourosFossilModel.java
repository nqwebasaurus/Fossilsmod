package fossils.fossils.client.blockentity.model.stegouros;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.SkullModelBase;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;

@SuppressWarnings("unused")
public class StegourosFossilModel extends SkullModelBase {
	private final ModelPart fossil;
	private final ModelPart hips;
	private final ModelPart tail1;
	private final ModelPart tail6;
	private final ModelPart tail7;
	private final ModelPart tail8;
	private final ModelPart tail;
	private final ModelPart torso;
	private final ModelPart chest;
	private final ModelPart leftarm;
	private final ModelPart leftarm2;
	private final ModelPart lefthand;
	private final ModelPart rightarm;
	private final ModelPart rightarm2;
	private final ModelPart righthand;
	private final ModelPart neck4;
	private final ModelPart neck5;
	private final ModelPart neck6;
	private final ModelPart head;
	private final ModelPart leftFace;
	private final ModelPart rightFace;
	private final ModelPart jaw;
	private final ModelPart leftleg;
	private final ModelPart leftleg2;
	private final ModelPart leftleg3;
	private final ModelPart leftfoot;
	private final ModelPart rightleg;
	private final ModelPart rightleg2;
	private final ModelPart rightleg3;
	private final ModelPart rightfoot;

	public StegourosFossilModel(ModelPart root) {
		this.fossil = root.getChild("fossil");
		this.hips = this.fossil.getChild("hips");
		this.tail1 = this.hips.getChild("tail1");
		this.tail6 = this.tail1.getChild("tail6");
		this.tail7 = this.tail6.getChild("tail7");
		this.tail8 = this.tail7.getChild("tail8");
		this.tail = this.tail8.getChild("tail");
		this.torso = this.hips.getChild("torso");
		this.chest = this.torso.getChild("chest");
		this.leftarm = this.chest.getChild("leftarm");
		this.leftarm2 = this.leftarm.getChild("leftarm2");
		this.lefthand = this.leftarm2.getChild("lefthand");
		this.rightarm = this.chest.getChild("rightarm");
		this.rightarm2 = this.rightarm.getChild("rightarm2");
		this.righthand = this.rightarm2.getChild("righthand");
		this.neck4 = this.chest.getChild("neck4");
		this.neck5 = this.neck4.getChild("neck5");
		this.neck6 = this.neck5.getChild("neck6");
		this.head = this.neck6.getChild("head");
		this.leftFace = this.head.getChild("leftFace");
		this.rightFace = this.head.getChild("rightFace");
		this.jaw = this.head.getChild("jaw");
		this.leftleg = this.hips.getChild("leftleg");
		this.leftleg2 = this.leftleg.getChild("leftleg2");
		this.leftleg3 = this.leftleg2.getChild("leftleg3");
		this.leftfoot = this.leftleg3.getChild("leftfoot");
		this.rightleg = this.hips.getChild("rightleg");
		this.rightleg2 = this.rightleg.getChild("rightleg2");
		this.rightleg3 = this.rightleg2.getChild("rightleg3");
		this.rightfoot = this.rightleg3.getChild("rightfoot");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition fossil = partdefinition.addOrReplaceChild("fossil", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition hips = fossil.addOrReplaceChild("hips", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -10.8071F, 2.3501F, -0.0785F, 0.0F, 0.0F));

		PartDefinition cube_r1 = hips.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(58, 79).addBox(0.0F, -1.141F, -0.1055F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.8986F, 1.8102F, -0.2967F, 0.0F, 0.0F));

		PartDefinition cube_r2 = hips.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(79, 47).addBox(-1.5F, -1.3271F, 0.018F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.5F, -1.2F, -0.3F, -0.2094F, 0.0F, 0.0F));

		PartDefinition cube_r3 = hips.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(71, 3).mirror().addBox(-0.2F, -0.7F, -0.6F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-2.7684F, -0.4661F, 3.6555F, 0.3701F, 0.8243F, 0.8901F));

		PartDefinition cube_r4 = hips.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(72, 38).mirror().addBox(-0.5F, -0.5F, -0.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-3.4199F, -1.3536F, 0.8648F, -0.0828F, 0.3669F, 0.7102F));

		PartDefinition cube_r5 = hips.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(50, 73).mirror().addBox(-0.6582F, -1.4737F, 5.108F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-3.9641F, -1.3306F, -6.7897F, -0.0773F, 0.019F, 0.7385F));

		PartDefinition cube_r6 = hips.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(37, 24).mirror().addBox(-1.0F, 0.3F, -0.2F, 2.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.9754F, -1.5887F, -0.0567F, -0.3198F, 0.0098F, 0.334F));

		PartDefinition cube_r7 = hips.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(53, 60).mirror().addBox(-0.5972F, 0.3388F, -0.0491F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.4225F, 2.4014F, 2.5193F, 0.0603F, -0.0929F, -0.6169F));

		PartDefinition cube_r8 = hips.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(26, 59).mirror().addBox(-0.8182F, -2.3502F, -0.2158F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(-1.4225F, 2.4014F, 2.5193F, 0.5934F, 0.0F, -0.2618F));

		PartDefinition cube_r9 = hips.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(43, 60).mirror().addBox(-0.1245F, 0.0481F, -0.4068F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-2.9933F, 0.321F, 0.1765F, 0.5339F, -0.051F, -0.3983F));

		PartDefinition cube_r10 = hips.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(48, 60).mirror().addBox(-0.5972F, -1.0616F, -0.2419F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.4225F, 2.4014F, 2.5193F, 0.3657F, -0.0929F, -0.6169F));

		PartDefinition cube_r11 = hips.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(27, 38).mirror().addBox(0.0526F, -2.8125F, 0.3937F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(27, 38).addBox(4.9341F, -2.8125F, 0.3937F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.9933F, 1.221F, -0.5235F, -0.2618F, 0.0F, 0.0F));

		PartDefinition cube_r12 = hips.addOrReplaceChild("cube_r12", CubeListBuilder.create().texOffs(51, 6).mirror().addBox(-0.625F, -0.3F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.3071F, -0.3056F, 3.1068F, -0.5843F, -0.0451F, -0.2828F));

		PartDefinition cube_r13 = hips.addOrReplaceChild("cube_r13", CubeListBuilder.create().texOffs(46, 18).mirror().addBox(-0.8827F, -3.5748F, 1.4612F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(-2.9933F, 1.521F, -0.5235F, -0.6094F, 0.2738F, -0.4991F));

		PartDefinition cube_r14 = hips.addOrReplaceChild("cube_r14", CubeListBuilder.create().texOffs(26, 21).mirror().addBox(0.9434F, -3.1427F, -1.863F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.9933F, 1.521F, -0.5235F, -0.3589F, -0.222F, -0.1942F));

		PartDefinition cube_r15 = hips.addOrReplaceChild("cube_r15", CubeListBuilder.create().texOffs(27, 33).mirror().addBox(-0.7959F, -0.4139F, -0.2272F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-3.8836F, -1.2745F, -1.8398F, -0.1237F, 1.1336F, -0.3841F));

		PartDefinition cube_r16 = hips.addOrReplaceChild("cube_r16", CubeListBuilder.create().texOffs(0, 23).mirror().addBox(-0.6481F, -0.5F, -2.6011F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-3.9953F, -1.0866F, -2.1664F, -0.1226F, 0.2855F, -0.6863F));

		PartDefinition cube_r17 = hips.addOrReplaceChild("cube_r17", CubeListBuilder.create().texOffs(46, 14).mirror().addBox(-0.4747F, -0.4F, -0.8815F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(-3.9953F, -1.0866F, -2.1664F, -0.133F, 0.4846F, -0.7139F));

		PartDefinition cube_r18 = hips.addOrReplaceChild("cube_r18", CubeListBuilder.create().texOffs(13, 9).mirror().addBox(-1.0F, -0.2F, -2.0F, 2.0F, 1.0F, 4.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-3.287F, -1.0308F, 0.8225F, -0.314F, 0.0122F, -0.4671F));

		PartDefinition cube_r19 = hips.addOrReplaceChild("cube_r19", CubeListBuilder.create().texOffs(65, 15).mirror().addBox(-0.8725F, -1.2663F, -0.617F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.249F)).mirror(false), PartPose.offsetAndRotation(-1.9227F, -1.2024F, 3.6604F, 1.9284F, -0.0714F, 3.0979F));

		PartDefinition cube_r20 = hips.addOrReplaceChild("cube_r20", CubeListBuilder.create().texOffs(0, 59).mirror().addBox(0.5074F, -1.398F, -0.9904F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.249F)).mirror(false), PartPose.offsetAndRotation(-0.7293F, -1.626F, 1.5746F, 1.9243F, 0.0155F, 3.0912F));

		PartDefinition cube_r21 = hips.addOrReplaceChild("cube_r21", CubeListBuilder.create().texOffs(31, 59).mirror().addBox(-0.5984F, -0.9705F, -0.4808F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.249F)).mirror(false), PartPose.offsetAndRotation(-1.9476F, -2.9814F, -0.6655F, 1.706F, -0.0235F, 3.0899F));

		PartDefinition cube_r22 = hips.addOrReplaceChild("cube_r22", CubeListBuilder.create().texOffs(64, 47).mirror().addBox(0.5115F, -0.2244F, -0.4602F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-5.2233F, -0.5684F, 2.9434F, -0.2227F, 0.2969F, 0.3274F));

		PartDefinition cube_r23 = hips.addOrReplaceChild("cube_r23", CubeListBuilder.create().texOffs(20, 69).mirror().addBox(-0.0613F, -0.4082F, -0.4914F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-5.2233F, -0.7601F, 0.9526F, -0.1752F, 0.2359F, 0.3628F));

		PartDefinition cube_r24 = hips.addOrReplaceChild("cube_r24", CubeListBuilder.create().texOffs(15, 73).mirror().addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-5.2233F, -0.7527F, -1.0574F, -0.0404F, 0.1947F, 0.3879F));

		PartDefinition cube_r25 = hips.addOrReplaceChild("cube_r25", CubeListBuilder.create().texOffs(13, 9).addBox(-1.0F, -0.2F, -2.0F, 2.0F, 1.0F, 4.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(3.287F, -1.0308F, 0.8225F, -0.314F, -0.0122F, 0.4671F));

		PartDefinition cube_r26 = hips.addOrReplaceChild("cube_r26", CubeListBuilder.create().texOffs(46, 14).addBox(-0.5253F, -0.4F, -0.8815F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(3.9953F, -1.0866F, -2.1664F, -0.133F, -0.4846F, 0.7139F));

		PartDefinition cube_r27 = hips.addOrReplaceChild("cube_r27", CubeListBuilder.create().texOffs(0, 23).addBox(-0.3519F, -0.5F, -2.6011F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.9953F, -1.0866F, -2.1664F, -0.1226F, -0.2855F, 0.6863F));

		PartDefinition cube_r28 = hips.addOrReplaceChild("cube_r28", CubeListBuilder.create().texOffs(27, 33).addBox(-0.2041F, -0.4139F, -0.2272F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(3.8836F, -1.2745F, -1.8398F, -0.1237F, -1.1336F, 0.3841F));

		PartDefinition cube_r29 = hips.addOrReplaceChild("cube_r29", CubeListBuilder.create().texOffs(37, 24).addBox(-1.0F, 0.3F, -0.2F, 2.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.9754F, -1.5887F, -0.0567F, -0.3198F, -0.0098F, -0.334F));

		PartDefinition cube_r30 = hips.addOrReplaceChild("cube_r30", CubeListBuilder.create().texOffs(26, 21).addBox(-1.9434F, -3.1427F, -1.863F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.9933F, 1.521F, -0.5235F, -0.3589F, 0.222F, 0.1942F));

		PartDefinition cube_r31 = hips.addOrReplaceChild("cube_r31", CubeListBuilder.create().texOffs(46, 18).addBox(-0.1173F, -3.5748F, 1.4612F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(2.9933F, 1.521F, -0.5235F, -0.6094F, -0.2738F, 0.4991F));

		PartDefinition cube_r32 = hips.addOrReplaceChild("cube_r32", CubeListBuilder.create().texOffs(51, 6).addBox(-0.375F, -0.3F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.3071F, -0.3056F, 3.1068F, -0.5843F, 0.0451F, 0.2828F));

		PartDefinition cube_r33 = hips.addOrReplaceChild("cube_r33", CubeListBuilder.create().texOffs(53, 60).addBox(-0.4028F, 0.3388F, -0.0491F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.4225F, 2.4014F, 2.5193F, 0.0603F, 0.0929F, 0.6169F));

		PartDefinition cube_r34 = hips.addOrReplaceChild("cube_r34", CubeListBuilder.create().texOffs(48, 60).addBox(-0.4028F, -1.0616F, -0.2419F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.4225F, 2.4014F, 2.5193F, 0.3657F, 0.0929F, 0.6169F));

		PartDefinition cube_r35 = hips.addOrReplaceChild("cube_r35", CubeListBuilder.create().texOffs(43, 60).addBox(-0.8755F, 0.0481F, -0.4068F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(2.9933F, 0.321F, 0.1765F, 0.5339F, 0.051F, 0.3983F));

		PartDefinition cube_r36 = hips.addOrReplaceChild("cube_r36", CubeListBuilder.create().texOffs(26, 59).addBox(-0.1818F, -2.3502F, -0.2158F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(1.4225F, 2.4014F, 2.5193F, 0.5934F, 0.0F, 0.2618F));

		PartDefinition cube_r37 = hips.addOrReplaceChild("cube_r37", CubeListBuilder.create().texOffs(0, 0).addBox(-2.0F, -0.3179F, -0.0004F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(1.5F, -1.2F, -1.3F, -0.192F, 0.0F, 0.0F));

		PartDefinition cube_r38 = hips.addOrReplaceChild("cube_r38", CubeListBuilder.create().texOffs(65, 15).addBox(-0.1275F, -1.2663F, -0.617F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.249F)), PartPose.offsetAndRotation(1.9227F, -1.2024F, 3.6604F, 1.9284F, 0.0714F, -3.0979F));

		PartDefinition cube_r39 = hips.addOrReplaceChild("cube_r39", CubeListBuilder.create().texOffs(0, 59).addBox(-1.5074F, -1.398F, -0.9904F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.249F)), PartPose.offsetAndRotation(0.7293F, -1.626F, 1.5746F, 1.9243F, -0.0155F, -3.0912F));

		PartDefinition cube_r40 = hips.addOrReplaceChild("cube_r40", CubeListBuilder.create().texOffs(31, 59).addBox(-0.4015F, -0.9705F, -0.4808F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.249F)), PartPose.offsetAndRotation(1.9476F, -2.9814F, -0.6655F, 1.706F, 0.0235F, -3.0899F));

		PartDefinition cube_r41 = hips.addOrReplaceChild("cube_r41", CubeListBuilder.create().texOffs(64, 47).addBox(-1.5115F, -0.2244F, -0.4602F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(5.2233F, -0.5684F, 2.9434F, -0.2227F, -0.2969F, -0.3274F));

		PartDefinition cube_r42 = hips.addOrReplaceChild("cube_r42", CubeListBuilder.create().texOffs(71, 3).addBox(-0.8F, -0.7F, -0.6F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(2.7684F, -0.4661F, 3.6555F, 0.3701F, -0.8243F, -0.8901F));

		PartDefinition cube_r43 = hips.addOrReplaceChild("cube_r43", CubeListBuilder.create().texOffs(72, 38).addBox(-0.5F, -0.5F, -0.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(3.4199F, -1.3536F, 0.8648F, -0.0828F, -0.3669F, -0.7102F));

		PartDefinition cube_r44 = hips.addOrReplaceChild("cube_r44", CubeListBuilder.create().texOffs(50, 73).addBox(-0.3418F, -1.4737F, 5.108F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(3.9641F, -1.3306F, -6.7897F, -0.0773F, -0.019F, -0.7385F));

		PartDefinition cube_r45 = hips.addOrReplaceChild("cube_r45", CubeListBuilder.create().texOffs(20, 69).addBox(-0.9387F, -0.4082F, -0.4914F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(5.2233F, -0.7601F, 0.9526F, -0.1752F, -0.2359F, -0.3628F));

		PartDefinition cube_r46 = hips.addOrReplaceChild("cube_r46", CubeListBuilder.create().texOffs(15, 73).addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(5.2233F, -0.7527F, -1.0574F, -0.0404F, -0.1947F, -0.3879F));

		PartDefinition tail1 = hips.addOrReplaceChild("tail1", CubeListBuilder.create().texOffs(0, 7).addBox(-0.5F, -0.4393F, -0.0927F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.005F))
				.texOffs(0, 17).addBox(0.5F, 0.0607F, -0.0927F, 1.0F, 0.0F, 5.0F, new CubeDeformation(0.0F))
				.texOffs(61, 79).addBox(0.0F, -1.0393F, -0.0927F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(0, 17).mirror().addBox(-1.5F, 0.0607F, -0.0927F, 1.0F, 0.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(80, 44).addBox(0.0F, -1.0393F, 3.9073F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.1313F, 3.5715F, -0.1386F, -0.3702F, 0.134F));

		PartDefinition cube_r47 = tail1.addOrReplaceChild("cube_r47", CubeListBuilder.create().texOffs(80, 68).addBox(0.0F, -0.7F, -0.9F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.3393F, 2.8073F, 0.0349F, 0.0F, 0.0F));

		PartDefinition cube_r48 = tail1.addOrReplaceChild("cube_r48", CubeListBuilder.create().texOffs(70, 0).mirror().addBox(-0.5511F, -0.5148F, -0.3981F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.102F)).mirror(false), PartPose.offsetAndRotation(-1.7513F, 0.1769F, 4.1059F, 0.073F, -0.5135F, -0.0763F));

		PartDefinition cube_r49 = tail1.addOrReplaceChild("cube_r49", CubeListBuilder.create().texOffs(69, 67).mirror().addBox(-0.4211F, -0.4889F, -0.4171F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.102F)).mirror(false), PartPose.offsetAndRotation(-1.7513F, 0.1769F, 4.1059F, 0.3387F, 1.386F, 0.3333F));

		PartDefinition cube_r50 = tail1.addOrReplaceChild("cube_r50", CubeListBuilder.create().texOffs(25, 72).mirror().addBox(-0.5734F, -3.077F, -1.9061F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.102F)).mirror(false)
				.texOffs(66, 64).mirror().addBox(-0.5734F, -3.077F, -2.7061F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.102F)).mirror(false), PartPose.offsetAndRotation(-2.8714F, 2.5844F, 4.5452F, 0.2217F, -0.4988F, -0.1486F));

		PartDefinition cube_r51 = tail1.addOrReplaceChild("cube_r51", CubeListBuilder.create().texOffs(69, 53).mirror().addBox(1.3717F, -3.0821F, 0.1995F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.102F)).mirror(false), PartPose.offsetAndRotation(-2.8714F, 2.5844F, 4.5452F, 0.8417F, 1.3121F, 0.8248F));

		PartDefinition cube_r52 = tail1.addOrReplaceChild("cube_r52", CubeListBuilder.create().texOffs(35, 76).mirror().addBox(-0.5F, -0.527F, -0.4032F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.249F)).mirror(false), PartPose.offsetAndRotation(-1.1961F, -1.1727F, 3.7251F, 1.1901F, -0.1327F, 3.0907F));

		PartDefinition cube_r53 = tail1.addOrReplaceChild("cube_r53", CubeListBuilder.create().texOffs(5, 78).mirror().addBox(-0.5F, -1.9251F, -1.2075F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.249F)).mirror(false), PartPose.offsetAndRotation(-1.1961F, -1.1727F, 3.7251F, 1.0592F, -0.1327F, 3.0907F));

		PartDefinition cube_r54 = tail1.addOrReplaceChild("cube_r54", CubeListBuilder.create().texOffs(20, 78).mirror().addBox(-0.1942F, 5.1772F, 3.1241F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.249F)).mirror(false), PartPose.offsetAndRotation(-1.3098F, -0.9908F, 0.0496F, 0.926F, -0.0891F, 3.091F));

		PartDefinition cube_r55 = tail1.addOrReplaceChild("cube_r55", CubeListBuilder.create().texOffs(10, 78).mirror().addBox(-0.5F, 0.8929F, 0.269F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.249F)).mirror(false), PartPose.offsetAndRotation(-1.3961F, -1.1727F, 3.7251F, 1.0155F, -0.1327F, 3.0907F));

		PartDefinition cube_r56 = tail1.addOrReplaceChild("cube_r56", CubeListBuilder.create().texOffs(15, 76).mirror().addBox(-0.8576F, 0.3087F, -0.1722F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.249F)).mirror(false), PartPose.offsetAndRotation(-2.1227F, -0.9799F, -0.4415F, 1.1898F, -0.1618F, 3.1389F));

		PartDefinition cube_r57 = tail1.addOrReplaceChild("cube_r57", CubeListBuilder.create().texOffs(10, 75).mirror().addBox(0.209F, -1.3351F, -0.1597F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.102F)).mirror(false), PartPose.offsetAndRotation(-3.2713F, 1.2573F, 1.7621F, 0.5679F, 1.2351F, 0.326F));

		PartDefinition cube_r58 = tail1.addOrReplaceChild("cube_r58", CubeListBuilder.create().texOffs(61, 64).mirror().addBox(0.0749F, -1.3294F, -1.1641F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.102F)).mirror(false), PartPose.offsetAndRotation(-3.2713F, 1.2573F, 1.7621F, 0.2023F, 0.4907F, -0.1199F));

		PartDefinition cube_r59 = tail1.addOrReplaceChild("cube_r59", CubeListBuilder.create().texOffs(20, 78).addBox(-0.8058F, 5.1772F, 3.1241F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.249F)), PartPose.offsetAndRotation(1.3098F, -0.9908F, 0.0496F, 0.926F, 0.0891F, -3.091F));

		PartDefinition cube_r60 = tail1.addOrReplaceChild("cube_r60", CubeListBuilder.create().texOffs(10, 78).addBox(-0.5F, 0.8929F, 0.269F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.249F)), PartPose.offsetAndRotation(1.3961F, -1.1727F, 3.7251F, 1.0155F, 0.1327F, -3.0907F));

		PartDefinition cube_r61 = tail1.addOrReplaceChild("cube_r61", CubeListBuilder.create().texOffs(35, 76).addBox(-0.5F, -0.527F, -0.4032F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.249F)), PartPose.offsetAndRotation(1.1961F, -1.1727F, 3.7251F, 1.1901F, 0.1327F, -3.0907F));

		PartDefinition cube_r62 = tail1.addOrReplaceChild("cube_r62", CubeListBuilder.create().texOffs(5, 78).addBox(-0.5F, -1.9251F, -1.2075F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.249F)), PartPose.offsetAndRotation(1.1961F, -1.1727F, 3.7251F, 1.0592F, 0.1327F, -3.0907F));

		PartDefinition cube_r63 = tail1.addOrReplaceChild("cube_r63", CubeListBuilder.create().texOffs(15, 76).addBox(-0.1424F, 0.3087F, -0.1722F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.249F)), PartPose.offsetAndRotation(2.1227F, -0.9799F, -0.4415F, 1.1898F, 0.1618F, -3.1389F));

		PartDefinition cube_r64 = tail1.addOrReplaceChild("cube_r64", CubeListBuilder.create().texOffs(10, 75).addBox(-1.209F, -1.3351F, -0.1597F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.102F)), PartPose.offsetAndRotation(3.2713F, 1.2573F, 1.7621F, 0.5679F, -1.2351F, -0.326F));

		PartDefinition cube_r65 = tail1.addOrReplaceChild("cube_r65", CubeListBuilder.create().texOffs(61, 64).addBox(-1.0749F, -1.3294F, -1.1641F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.102F)), PartPose.offsetAndRotation(3.2713F, 1.2573F, 1.7621F, 0.2023F, -0.4907F, 0.1199F));

		PartDefinition cube_r66 = tail1.addOrReplaceChild("cube_r66", CubeListBuilder.create().texOffs(80, 15).addBox(0.0F, 2.0F, 2.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(80, 15).addBox(0.0F, 1.0F, 2.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(80, 15).addBox(0.0F, 0.2F, 0.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(80, 15).addBox(0.0F, 1.2F, 0.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.1607F, 0.4073F, 0.6807F, 0.0F, 0.0F));

		PartDefinition cube_r67 = tail1.addOrReplaceChild("cube_r67", CubeListBuilder.create().texOffs(69, 67).addBox(-0.5789F, -0.4889F, -0.4171F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.102F)), PartPose.offsetAndRotation(1.7513F, 0.1769F, 4.1059F, 0.3387F, -1.386F, -0.3333F));

		PartDefinition cube_r68 = tail1.addOrReplaceChild("cube_r68", CubeListBuilder.create().texOffs(70, 0).addBox(-0.4489F, -0.5148F, -0.3981F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.102F)), PartPose.offsetAndRotation(1.7513F, 0.1769F, 4.1059F, 0.073F, 0.5135F, 0.0763F));

		PartDefinition cube_r69 = tail1.addOrReplaceChild("cube_r69", CubeListBuilder.create().texOffs(25, 72).addBox(-0.4266F, -3.077F, -1.9061F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.102F))
				.texOffs(66, 64).addBox(-0.4266F, -3.077F, -2.7061F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.102F)), PartPose.offsetAndRotation(2.8714F, 2.5844F, 4.5452F, 0.2217F, 0.4988F, 0.1486F));

		PartDefinition cube_r70 = tail1.addOrReplaceChild("cube_r70", CubeListBuilder.create().texOffs(69, 53).addBox(-2.3717F, -3.0821F, 0.1995F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.102F)), PartPose.offsetAndRotation(2.8714F, 2.5844F, 4.5452F, 0.8417F, -1.3121F, -0.8248F));

		PartDefinition tail6 = tail1.addOrReplaceChild("tail6", CubeListBuilder.create().texOffs(13, 0).addBox(-0.5F, -0.5017F, -0.0739F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.006F))
				.texOffs(18, 38).addBox(0.3F, -0.0017F, 0.9261F, 1.0F, 0.0F, 3.0F, new CubeDeformation(0.0F))
				.texOffs(64, 79).addBox(0.0F, -1.1017F, 0.9261F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(18, 38).mirror().addBox(-1.3F, -0.0017F, 0.9261F, 1.0F, 0.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(79, 65).addBox(0.0F, -1.0017F, 2.9261F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0514F, 4.8415F, 0.4089F, -0.4215F, -0.1162F));

		PartDefinition cube_r71 = tail6.addOrReplaceChild("cube_r71", CubeListBuilder.create().texOffs(80, 21).addBox(0.0F, 5.2F, 7.4F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(30, 80).addBox(0.0F, 3.8F, 5.4F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.0461F, -5.5227F, 0.6807F, 0.0F, 0.0F));

		PartDefinition cube_r72 = tail6.addOrReplaceChild("cube_r72", CubeListBuilder.create().texOffs(49, 67).mirror().addBox(-0.375F, -0.5F, -0.375F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.098F)).mirror(false), PartPose.offsetAndRotation(-1.3775F, 0.1438F, 3.8494F, 0.2066F, -0.7621F, -0.1854F));

		PartDefinition cube_r73 = tail6.addOrReplaceChild("cube_r73", CubeListBuilder.create().texOffs(70, 9).mirror().addBox(-0.3578F, -0.4924F, -0.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.102F)).mirror(false), PartPose.offsetAndRotation(-1.6341F, 0.0683F, 4.5038F, 0.8532F, 1.3734F, 0.8427F));

		PartDefinition cube_r74 = tail6.addOrReplaceChild("cube_r74", CubeListBuilder.create().texOffs(44, 67).mirror().addBox(-0.5713F, -0.5119F, -0.4032F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.102F)).mirror(false), PartPose.offsetAndRotation(-1.6341F, 0.0683F, 4.5038F, 0.1665F, -0.4618F, -0.1164F));

		PartDefinition cube_r75 = tail6.addOrReplaceChild("cube_r75", CubeListBuilder.create().texOffs(39, 67).mirror().addBox(-0.5713F, -0.5119F, -0.4032F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.102F)).mirror(false), PartPose.offsetAndRotation(-1.6341F, 0.1433F, 2.5038F, 0.118F, -0.4664F, -0.0947F));

		PartDefinition cube_r76 = tail6.addOrReplaceChild("cube_r76", CubeListBuilder.create().texOffs(70, 6).mirror().addBox(-0.4328F, -0.4924F, -0.4F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.102F)).mirror(false), PartPose.offsetAndRotation(-1.6341F, 0.1433F, 2.5038F, 0.6781F, 1.4034F, 0.6705F));

		PartDefinition cube_r77 = tail6.addOrReplaceChild("cube_r77", CubeListBuilder.create().texOffs(15, 64).mirror().addBox(0.046F, -0.2238F, -0.3728F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.249F)).mirror(false), PartPose.offsetAndRotation(-0.37F, -1.0522F, 3.7118F, 1.1398F, -0.0019F, 3.0912F));

		PartDefinition cube_r78 = tail6.addOrReplaceChild("cube_r78", CubeListBuilder.create().texOffs(69, 47).mirror().addBox(0.5624F, -0.5978F, 0.0716F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.102F)).mirror(false), PartPose.offsetAndRotation(-2.2713F, 0.233F, 1.9037F, 0.1002F, 1.3954F, 0.0987F));

		PartDefinition cube_r79 = tail6.addOrReplaceChild("cube_r79", CubeListBuilder.create().texOffs(67, 18).mirror().addBox(-0.4581F, -0.5938F, -1.5007F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.102F)).mirror(false), PartPose.offsetAndRotation(-2.2713F, 0.233F, 1.9037F, 0.0229F, -0.5163F, -0.0517F));

		PartDefinition cube_r80 = tail6.addOrReplaceChild("cube_r80", CubeListBuilder.create().texOffs(15, 64).addBox(-1.046F, -0.2238F, -0.3728F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.249F)), PartPose.offsetAndRotation(0.37F, -1.0522F, 3.7118F, 1.1398F, 0.0019F, -3.0912F));

		PartDefinition cube_r81 = tail6.addOrReplaceChild("cube_r81", CubeListBuilder.create().texOffs(49, 67).addBox(-0.625F, -0.5F, -0.375F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.098F)), PartPose.offsetAndRotation(1.3775F, 0.1438F, 3.8494F, 0.2066F, 0.7621F, 0.1854F));

		PartDefinition cube_r82 = tail6.addOrReplaceChild("cube_r82", CubeListBuilder.create().texOffs(44, 67).addBox(-0.4287F, -0.5119F, -0.4032F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.102F)), PartPose.offsetAndRotation(1.6341F, 0.0683F, 4.5038F, 0.1665F, 0.4618F, 0.1164F));

		PartDefinition cube_r83 = tail6.addOrReplaceChild("cube_r83", CubeListBuilder.create().texOffs(70, 9).addBox(-0.6422F, -0.4924F, -0.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.102F)), PartPose.offsetAndRotation(1.6341F, 0.0683F, 4.5038F, 0.8532F, -1.3734F, -0.8427F));

		PartDefinition cube_r84 = tail6.addOrReplaceChild("cube_r84", CubeListBuilder.create().texOffs(70, 6).addBox(-0.5672F, -0.4924F, -0.4F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.102F)), PartPose.offsetAndRotation(1.6341F, 0.1433F, 2.5038F, 0.6781F, -1.4034F, -0.6705F));

		PartDefinition cube_r85 = tail6.addOrReplaceChild("cube_r85", CubeListBuilder.create().texOffs(39, 67).addBox(-0.4287F, -0.5119F, -0.4032F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.102F)), PartPose.offsetAndRotation(1.6341F, 0.1433F, 2.5038F, 0.118F, 0.4664F, 0.0947F));

		PartDefinition cube_r86 = tail6.addOrReplaceChild("cube_r86", CubeListBuilder.create().texOffs(69, 47).addBox(-1.5624F, -0.5978F, 0.0716F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.102F)), PartPose.offsetAndRotation(2.2713F, 0.233F, 1.9037F, 0.1002F, -1.3954F, -0.0987F));

		PartDefinition cube_r87 = tail6.addOrReplaceChild("cube_r87", CubeListBuilder.create().texOffs(67, 18).addBox(-0.5419F, -0.5938F, -1.5007F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.102F)), PartPose.offsetAndRotation(2.2713F, 0.233F, 1.9037F, 0.0229F, 0.5163F, 0.0517F));

		PartDefinition tail7 = tail6.addOrReplaceChild("tail7", CubeListBuilder.create().texOffs(37, 20).addBox(0.1F, 0.1411F, -0.0184F, 1.0F, 0.0F, 3.0F, new CubeDeformation(0.0F))
				.texOffs(22, 27).addBox(-0.5F, -0.3589F, -0.0184F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.005F))
				.texOffs(37, 20).mirror().addBox(-1.1F, 0.1411F, -0.0184F, 1.0F, 0.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, -0.1168F, 4.7565F, 0.3695F, -0.3272F, -0.1238F));

		PartDefinition cube_r88 = tail7.addOrReplaceChild("cube_r88", CubeListBuilder.create().texOffs(65, 76).mirror().addBox(-0.5785F, -0.5012F, -0.7985F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.098F)).mirror(false), PartPose.offsetAndRotation(-1.33F, 0.202F, 2.4334F, 0.0634F, -1.0828F, -0.0898F));

		PartDefinition cube_r89 = tail7.addOrReplaceChild("cube_r89", CubeListBuilder.create().texOffs(70, 15).mirror().addBox(-0.6835F, -0.4777F, -0.2752F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.102F)).mirror(false), PartPose.offsetAndRotation(-1.33F, 0.202F, 2.4334F, 2.8086F, 1.5247F, 2.7971F));

		PartDefinition cube_r90 = tail7.addOrReplaceChild("cube_r90", CubeListBuilder.create().texOffs(68, 56).mirror().addBox(-0.5667F, -0.5012F, -0.1651F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.102F)).mirror(false), PartPose.offsetAndRotation(-1.33F, 0.202F, 2.4334F, 0.0417F, -0.7777F, -0.0631F));

		PartDefinition cube_r91 = tail7.addOrReplaceChild("cube_r91", CubeListBuilder.create().texOffs(54, 67).mirror().addBox(-0.5667F, -0.5012F, -0.1651F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.102F)).mirror(false), PartPose.offsetAndRotation(-1.63F, 0.202F, 1.1334F, 0.0204F, -0.4728F, -0.0505F));

		PartDefinition cube_r92 = tail7.addOrReplaceChild("cube_r92", CubeListBuilder.create().texOffs(15, 70).mirror().addBox(-0.5835F, -0.4777F, -0.2752F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.102F)).mirror(false), PartPose.offsetAndRotation(-1.63F, 0.202F, 1.1334F, 0.1328F, 1.4388F, 0.1309F));

		PartDefinition cube_r93 = tail7.addOrReplaceChild("cube_r93", CubeListBuilder.create().texOffs(40, 76).mirror().addBox(-0.5785F, -0.5012F, -0.7985F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.098F)).mirror(false), PartPose.offsetAndRotation(-1.63F, 0.202F, 1.1334F, 0.0255F, -0.7781F, -0.0591F));

		PartDefinition cube_r94 = tail7.addOrReplaceChild("cube_r94", CubeListBuilder.create().texOffs(25, 66).mirror().addBox(-0.4984F, -2.3037F, -1.171F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.249F)).mirror(false), PartPose.offsetAndRotation(-0.7059F, -0.6965F, 3.2644F, 1.3144F, -0.0081F, 3.0941F));

		PartDefinition cube_r95 = tail7.addOrReplaceChild("cube_r95", CubeListBuilder.create().texOffs(69, 50).mirror().addBox(-0.5029F, -0.697F, -0.7663F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.249F)).mirror(false), PartPose.offsetAndRotation(-0.7059F, -0.6965F, 3.2644F, 1.0084F, 0.003F, 3.1049F));

		PartDefinition cube_r96 = tail7.addOrReplaceChild("cube_r96", CubeListBuilder.create().texOffs(25, 66).addBox(-0.5016F, -2.3037F, -1.171F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.249F)), PartPose.offsetAndRotation(0.7059F, -0.6965F, 3.2644F, 1.3144F, 0.0081F, -3.0941F));

		PartDefinition cube_r97 = tail7.addOrReplaceChild("cube_r97", CubeListBuilder.create().texOffs(69, 50).addBox(-0.4971F, -0.697F, -0.7663F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.249F)), PartPose.offsetAndRotation(0.7059F, -0.6965F, 3.2644F, 1.0084F, -0.003F, -3.1049F));

		PartDefinition cube_r98 = tail7.addOrReplaceChild("cube_r98", CubeListBuilder.create().texOffs(80, 0).addBox(0.0F, -0.4611F, 1.9F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(70, 79).addBox(0.0F, -0.4611F, -0.1F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.3977F, 0.0816F, -0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r99 = tail7.addOrReplaceChild("cube_r99", CubeListBuilder.create().texOffs(68, 56).addBox(-0.4333F, -0.5012F, -0.1651F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.102F)), PartPose.offsetAndRotation(1.33F, 0.202F, 2.4334F, 0.0417F, 0.7777F, 0.0631F));

		PartDefinition cube_r100 = tail7.addOrReplaceChild("cube_r100", CubeListBuilder.create().texOffs(70, 15).addBox(-0.3165F, -0.4777F, -0.2752F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.102F)), PartPose.offsetAndRotation(1.33F, 0.202F, 2.4334F, 2.8086F, -1.5247F, -2.7971F));

		PartDefinition cube_r101 = tail7.addOrReplaceChild("cube_r101", CubeListBuilder.create().texOffs(65, 76).addBox(-0.4215F, -0.5012F, -0.7985F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.098F)), PartPose.offsetAndRotation(1.33F, 0.202F, 2.4334F, 0.0634F, 1.0828F, 0.0898F));

		PartDefinition cube_r102 = tail7.addOrReplaceChild("cube_r102", CubeListBuilder.create().texOffs(40, 76).addBox(-0.4215F, -0.5012F, -0.7985F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.098F)), PartPose.offsetAndRotation(1.63F, 0.202F, 1.1334F, 0.0255F, 0.7781F, 0.0591F));

		PartDefinition cube_r103 = tail7.addOrReplaceChild("cube_r103", CubeListBuilder.create().texOffs(15, 70).addBox(-0.4165F, -0.4777F, -0.2752F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.102F)), PartPose.offsetAndRotation(1.63F, 0.202F, 1.1334F, 0.1328F, -1.4388F, -0.1309F));

		PartDefinition cube_r104 = tail7.addOrReplaceChild("cube_r104", CubeListBuilder.create().texOffs(54, 67).addBox(-0.4333F, -0.5012F, -0.1651F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.102F)), PartPose.offsetAndRotation(1.63F, 0.202F, 1.1334F, 0.0204F, 0.4728F, 0.0505F));

		PartDefinition tail8 = tail7.addOrReplaceChild("tail8", CubeListBuilder.create().texOffs(26, 9).addBox(-0.5F, -0.4711F, 0.0008F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.0F, 0.1107F, 3.8849F, 0.3794F, -0.1355F, -0.0058F));

		PartDefinition cube_r105 = tail8.addOrReplaceChild("cube_r105", CubeListBuilder.create().texOffs(9, 38).mirror().addBox(-0.7548F, -0.5099F, -1.7507F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.102F)).mirror(false), PartPose.offsetAndRotation(-1.4051F, 0.0918F, 3.5821F, 0.0381F, -0.9088F, -0.0685F));

		PartDefinition cube_r106 = tail8.addOrReplaceChild("cube_r106", CubeListBuilder.create().texOffs(35, 70).mirror().addBox(-0.7493F, -0.5099F, -0.3225F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.108F)).mirror(false), PartPose.offsetAndRotation(-1.4051F, 0.0918F, 3.5821F, 0.0248F, -0.3418F, -0.0468F));

		PartDefinition cube_r107 = tail8.addOrReplaceChild("cube_r107", CubeListBuilder.create().texOffs(31, 52).mirror().addBox(-1.0447F, -0.4817F, -1.0691F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.102F)).mirror(false), PartPose.offsetAndRotation(-1.4051F, 0.0918F, 3.5821F, 2.9959F, 1.4827F, 2.9821F));

		PartDefinition cube_r108 = tail8.addOrReplaceChild("cube_r108", CubeListBuilder.create().texOffs(14, 51).mirror().addBox(-0.8447F, -0.4817F, -0.7691F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.102F)).mirror(false), PartPose.offsetAndRotation(-1.5051F, 0.0918F, 2.0821F, 0.1456F, 1.4825F, 0.1307F));

		PartDefinition cube_r109 = tail8.addOrReplaceChild("cube_r109", CubeListBuilder.create().texOffs(70, 21).mirror().addBox(-0.7493F, -0.5099F, -0.3225F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.108F)).mirror(false), PartPose.offsetAndRotation(-1.5051F, 0.0918F, 2.0821F, 0.0248F, -0.3418F, -0.0468F));

		PartDefinition cube_r110 = tail8.addOrReplaceChild("cube_r110", CubeListBuilder.create().texOffs(33, 56).mirror().addBox(-0.7548F, -0.5099F, -0.7507F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.102F)).mirror(false), PartPose.offsetAndRotation(-1.5051F, 0.0918F, 2.0821F, 0.0381F, -0.9088F, -0.0685F));

		PartDefinition cube_r111 = tail8.addOrReplaceChild("cube_r111", CubeListBuilder.create().texOffs(70, 76).mirror().addBox(-0.5785F, -0.5012F, -0.7985F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.108F)).mirror(false), PartPose.offsetAndRotation(-1.4301F, 0.0913F, 0.4485F, 0.0634F, -1.0828F, -0.0898F));

		PartDefinition cube_r112 = tail8.addOrReplaceChild("cube_r112", CubeListBuilder.create().texOffs(68, 59).mirror().addBox(-0.5667F, -0.5012F, 0.2349F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.108F)).mirror(false)
				.texOffs(19, 55).mirror().addBox(-0.5667F, -0.5012F, -0.1651F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.102F)).mirror(false), PartPose.offsetAndRotation(-1.4301F, 0.0913F, 0.4485F, 0.0417F, -0.7777F, -0.0631F));

		PartDefinition cube_r113 = tail8.addOrReplaceChild("cube_r113", CubeListBuilder.create().texOffs(51, 10).mirror().addBox(-0.9835F, -0.4777F, -0.6752F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.102F)).mirror(false), PartPose.offsetAndRotation(-1.4301F, 0.0913F, 0.4485F, 2.8086F, 1.5247F, 2.7971F));

		PartDefinition cube_r114 = tail8.addOrReplaceChild("cube_r114", CubeListBuilder.create().texOffs(33, 30).mirror().addBox(-0.3F, -0.5F, -0.375F, 4.0F, 1.0F, 1.0F, new CubeDeformation(-0.098F)).mirror(false), PartPose.offsetAndRotation(-0.4961F, 0.0759F, -0.1349F, 1.3317F, -1.5402F, -1.3655F));

		PartDefinition cube_r115 = tail8.addOrReplaceChild("cube_r115", CubeListBuilder.create().texOffs(31, 52).addBox(0.0447F, -0.4817F, -1.0691F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.102F)), PartPose.offsetAndRotation(1.4051F, 0.0918F, 3.5821F, 2.9959F, -1.4827F, -2.9821F));

		PartDefinition cube_r116 = tail8.addOrReplaceChild("cube_r116", CubeListBuilder.create().texOffs(35, 70).addBox(-0.2507F, -0.5099F, -0.3225F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.108F)), PartPose.offsetAndRotation(1.4051F, 0.0918F, 3.5821F, 0.0248F, 0.3418F, 0.0468F));

		PartDefinition cube_r117 = tail8.addOrReplaceChild("cube_r117", CubeListBuilder.create().texOffs(9, 38).addBox(-1.2452F, -0.5099F, -1.7507F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.102F)), PartPose.offsetAndRotation(1.4051F, 0.0918F, 3.5821F, 0.0381F, 0.9088F, 0.0685F));

		PartDefinition cube_r118 = tail8.addOrReplaceChild("cube_r118", CubeListBuilder.create().texOffs(33, 56).addBox(-1.2452F, -0.5099F, -0.7507F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.102F)), PartPose.offsetAndRotation(1.5051F, 0.0918F, 2.0821F, 0.0381F, 0.9088F, 0.0685F));

		PartDefinition cube_r119 = tail8.addOrReplaceChild("cube_r119", CubeListBuilder.create().texOffs(70, 21).addBox(-0.2507F, -0.5099F, -0.3225F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.108F)), PartPose.offsetAndRotation(1.5051F, 0.0918F, 2.0821F, 0.0248F, 0.3418F, 0.0468F));

		PartDefinition cube_r120 = tail8.addOrReplaceChild("cube_r120", CubeListBuilder.create().texOffs(14, 51).addBox(-0.1553F, -0.4817F, -0.7691F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.102F)), PartPose.offsetAndRotation(1.5051F, 0.0918F, 2.0821F, 0.1456F, -1.4825F, -0.1307F));

		PartDefinition cube_r121 = tail8.addOrReplaceChild("cube_r121", CubeListBuilder.create().texOffs(70, 76).addBox(-0.4215F, -0.5012F, -0.7985F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.108F)), PartPose.offsetAndRotation(1.4301F, 0.0913F, 0.4485F, 0.0634F, 1.0828F, 0.0898F));

		PartDefinition cube_r122 = tail8.addOrReplaceChild("cube_r122", CubeListBuilder.create().texOffs(33, 30).addBox(-3.7F, -0.5F, -0.375F, 4.0F, 1.0F, 1.0F, new CubeDeformation(-0.098F)), PartPose.offsetAndRotation(0.4961F, 0.0759F, -0.1349F, 1.3317F, 1.5402F, 1.3655F));

		PartDefinition cube_r123 = tail8.addOrReplaceChild("cube_r123", CubeListBuilder.create().texOffs(51, 10).addBox(-0.0165F, -0.4777F, -0.6752F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.102F)), PartPose.offsetAndRotation(1.4301F, 0.0913F, 0.4485F, 2.8086F, -1.5247F, -2.7971F));

		PartDefinition cube_r124 = tail8.addOrReplaceChild("cube_r124", CubeListBuilder.create().texOffs(68, 59).addBox(-0.4333F, -0.5012F, 0.2349F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.108F))
				.texOffs(19, 55).addBox(-1.4333F, -0.5012F, -0.1651F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.102F)), PartPose.offsetAndRotation(1.4301F, 0.0913F, 0.4485F, 0.0417F, 0.7777F, 0.0631F));

		PartDefinition tail = tail8.addOrReplaceChild("tail", CubeListBuilder.create().texOffs(26, 15).addBox(-1.0F, -0.35F, -0.1F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.1174F, 4.0008F, 0.3542F, -0.2129F, -0.0479F));

		PartDefinition cube_r125 = tail.addOrReplaceChild("cube_r125", CubeListBuilder.create().texOffs(40, 70).mirror().addBox(-1.093F, -0.6107F, 0.7772F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.102F)).mirror(false), PartPose.offsetAndRotation(-1.2975F, 0.2081F, 2.4051F, -0.1146F, 0.6477F, -0.112F));

		PartDefinition cube_r126 = tail.addOrReplaceChild("cube_r126", CubeListBuilder.create().texOffs(45, 52).mirror().addBox(-1.2353F, -0.5582F, -2.0779F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.102F)).mirror(false), PartPose.offsetAndRotation(-1.2975F, 0.2081F, 2.4051F, -3.0727F, 0.0528F, 3.1165F));

		PartDefinition cube_r127 = tail.addOrReplaceChild("cube_r127", CubeListBuilder.create().texOffs(77, 12).mirror().addBox(-0.3343F, -0.4752F, -0.7289F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.098F)).mirror(false), PartPose.offsetAndRotation(-1.2975F, 0.2081F, 2.4051F, 0.0848F, -1.0454F, -0.1648F));

		PartDefinition cube_r128 = tail.addOrReplaceChild("cube_r128", CubeListBuilder.create().texOffs(55, 38).mirror().addBox(-0.4063F, -0.4752F, -0.0782F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.102F)).mirror(false), PartPose.offsetAndRotation(-1.2975F, 0.2081F, 2.4051F, 0.0479F, -0.4792F, -0.1135F));

		PartDefinition cube_r129 = tail.addOrReplaceChild("cube_r129", CubeListBuilder.create().texOffs(38, 52).mirror().addBox(-1.31F, -0.4565F, -0.6584F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.102F)).mirror(false), PartPose.offsetAndRotation(-1.2975F, 0.2081F, 2.4051F, 0.5126F, 1.5123F, 0.443F));

		PartDefinition cube_r130 = tail.addOrReplaceChild("cube_r130", CubeListBuilder.create().texOffs(56, 29).mirror().addBox(-2.112F, -0.5585F, -1.2048F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.098F)).mirror(false), PartPose.offsetAndRotation(-1.2975F, 0.2081F, 2.4051F, 0.023F, -1.1793F, -0.1216F));

		PartDefinition cube_r131 = tail.addOrReplaceChild("cube_r131", CubeListBuilder.create().texOffs(52, 34).mirror().addBox(0.1532F, -0.5143F, -0.9581F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.102F)).mirror(false), PartPose.offsetAndRotation(-1.2975F, 0.2081F, 2.4051F, 3.1299F, 1.2736F, 3.0559F));

		PartDefinition cube_r132 = tail.addOrReplaceChild("cube_r132", CubeListBuilder.create().texOffs(59, 67).mirror().addBox(-1.2863F, -0.5585F, -1.2835F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-1.2975F, 0.2081F, 2.4051F, 0.0088F, -0.1321F, -0.1015F));

		PartDefinition cube_r133 = tail.addOrReplaceChild("cube_r133", CubeListBuilder.create().texOffs(40, 56).mirror().addBox(-1.7241F, -0.5585F, -1.2727F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.102F)).mirror(false), PartPose.offsetAndRotation(-1.2975F, 0.2081F, 2.4051F, 0.0114F, -0.6994F, -0.1077F));

		PartDefinition cube_r134 = tail.addOrReplaceChild("cube_r134", CubeListBuilder.create().texOffs(45, 52).addBox(0.2353F, -0.5582F, -2.0779F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.102F)), PartPose.offsetAndRotation(0.2975F, 0.2081F, 2.4051F, -3.0727F, -0.0528F, -3.1165F));

		PartDefinition cube_r135 = tail.addOrReplaceChild("cube_r135", CubeListBuilder.create().texOffs(40, 70).addBox(0.093F, -0.6107F, 0.7772F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.102F)), PartPose.offsetAndRotation(0.2975F, 0.2081F, 2.4051F, -0.1146F, -0.6477F, 0.112F));

		PartDefinition cube_r136 = tail.addOrReplaceChild("cube_r136", CubeListBuilder.create().texOffs(38, 52).addBox(0.31F, -0.4565F, -0.6584F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.102F)), PartPose.offsetAndRotation(0.2975F, 0.2081F, 2.4051F, 0.5126F, -1.5123F, -0.443F));

		PartDefinition cube_r137 = tail.addOrReplaceChild("cube_r137", CubeListBuilder.create().texOffs(55, 38).addBox(-1.5937F, -0.4752F, -0.0782F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.102F)), PartPose.offsetAndRotation(0.2975F, 0.2081F, 2.4051F, 0.0479F, 0.4792F, 0.1135F));

		PartDefinition cube_r138 = tail.addOrReplaceChild("cube_r138", CubeListBuilder.create().texOffs(77, 12).addBox(-0.6657F, -0.4752F, -0.7289F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.098F)), PartPose.offsetAndRotation(0.2975F, 0.2081F, 2.4051F, 0.0848F, 1.0454F, 0.1648F));

		PartDefinition cube_r139 = tail.addOrReplaceChild("cube_r139", CubeListBuilder.create().texOffs(40, 56).addBox(-0.2759F, -0.5585F, -1.2727F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.102F)), PartPose.offsetAndRotation(0.2975F, 0.2081F, 2.4051F, 0.0114F, 0.6994F, 0.1077F));

		PartDefinition cube_r140 = tail.addOrReplaceChild("cube_r140", CubeListBuilder.create().texOffs(59, 67).addBox(0.2863F, -0.5585F, -1.2835F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.2975F, 0.2081F, 2.4051F, 0.0088F, 0.1321F, 0.1015F));

		PartDefinition cube_r141 = tail.addOrReplaceChild("cube_r141", CubeListBuilder.create().texOffs(52, 34).addBox(-1.1532F, -0.5143F, -0.9581F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.102F)), PartPose.offsetAndRotation(0.2975F, 0.2081F, 2.4051F, 3.1299F, -1.2736F, -3.0559F));

		PartDefinition cube_r142 = tail.addOrReplaceChild("cube_r142", CubeListBuilder.create().texOffs(56, 29).addBox(0.112F, -0.5585F, -1.2048F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.098F)), PartPose.offsetAndRotation(0.2975F, 0.2081F, 2.4051F, 0.023F, 1.1793F, 0.1216F));

		PartDefinition torso = hips.addOrReplaceChild("torso", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -1.1F, -1.1F, 0.0352F, 0.1308F, 0.0046F));

		PartDefinition cube_r143 = torso.addOrReplaceChild("cube_r143", CubeListBuilder.create().texOffs(49, 79).addBox(-2.0F, -1.2629F, -0.0088F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.0F, -0.4F, -1.1F, -0.1309F, 0.0F, 0.0F));

		PartDefinition cube_r144 = torso.addOrReplaceChild("cube_r144", CubeListBuilder.create().texOffs(55, 79).addBox(-2.0F, -1.275F, 3.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(11, 27).addBox(-2.5F, -0.05F, 2.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(2.0F, -0.7F, -6.1F, -0.0524F, 0.0F, 0.0F));

		PartDefinition cube_r145 = torso.addOrReplaceChild("cube_r145", CubeListBuilder.create().texOffs(60, 21).mirror().addBox(-1.996F, -0.0788F, -0.4573F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.2F, -0.0233F, -2.7102F, -0.0543F, -0.0471F, -0.0764F));

		PartDefinition cube_r146 = torso.addOrReplaceChild("cube_r146", CubeListBuilder.create().texOffs(59, 4).mirror().addBox(-3.7437F, -0.9754F, -0.5043F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.2F, -0.0233F, -2.7102F, -0.0326F, -0.0428F, -0.5481F));

		PartDefinition cube_r147 = torso.addOrReplaceChild("cube_r147", CubeListBuilder.create().texOffs(47, 56).mirror().addBox(-3.7066F, -2.7642F, -0.5043F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.2F, -0.0233F, -2.7102F, -0.0059F, -0.0535F, -1.0897F));

		PartDefinition cube_r148 = torso.addOrReplaceChild("cube_r148", CubeListBuilder.create().texOffs(50, 4).mirror().addBox(-3.6966F, -0.4132F, -0.5482F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.0767F, -0.6352F, -0.1691F, -0.1572F, -0.1785F));

		PartDefinition cube_r149 = torso.addOrReplaceChild("cube_r149", CubeListBuilder.create().texOffs(77, 39).mirror().addBox(-0.8092F, -0.0522F, -0.5292F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.0767F, -0.6352F, -0.2275F, -0.0874F, 0.2912F));

		PartDefinition cube_r150 = torso.addOrReplaceChild("cube_r150", CubeListBuilder.create().texOffs(59, 34).mirror().addBox(-0.7F, -1.0F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.249F)).mirror(false), PartPose.offsetAndRotation(-2.0503F, -2.23F, -2.2593F, 1.5728F, 0.0175F, 3.1305F));

		PartDefinition cube_r151 = torso.addOrReplaceChild("cube_r151", CubeListBuilder.create().texOffs(0, 72).mirror().addBox(-0.948F, -0.2979F, -0.6459F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.102F)).mirror(false), PartPose.offsetAndRotation(-4.9465F, 2.5228F, -1.5945F, 0.4141F, 0.1506F, 0.2879F));

		PartDefinition cube_r152 = torso.addOrReplaceChild("cube_r152", CubeListBuilder.create().texOffs(71, 62).mirror().addBox(-1.4578F, -0.2979F, -0.7043F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.102F)).mirror(false), PartPose.offsetAndRotation(-4.6521F, 3.0734F, -2.7853F, 0.4118F, 0.1106F, 0.2702F));

		PartDefinition cube_r153 = torso.addOrReplaceChild("cube_r153", CubeListBuilder.create().texOffs(40, 73).mirror().addBox(-0.6582F, -1.4737F, 3.108F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-3.9641F, -0.2306F, -5.6897F, -0.0773F, 0.019F, 0.7385F));

		PartDefinition cube_r154 = torso.addOrReplaceChild("cube_r154", CubeListBuilder.create().texOffs(30, 74).mirror().addBox(-1.2575F, -0.2847F, -0.6918F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-4.5836F, 1.129F, -2.8301F, 0.3198F, 0.1189F, 0.2678F));

		PartDefinition cube_r155 = torso.addOrReplaceChild("cube_r155", CubeListBuilder.create().texOffs(30, 71).mirror().addBox(-1.4886F, -0.5331F, 1.9289F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-4.5992F, 2.1817F, -6.993F, 0.2306F, -0.0469F, 0.2132F));

		PartDefinition cube_r156 = torso.addOrReplaceChild("cube_r156", CubeListBuilder.create().texOffs(75, 0).mirror().addBox(-0.6197F, -1.2232F, 1.1439F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-3.9641F, -0.2306F, -5.6897F, -0.0337F, 0.019F, 0.7385F));

		PartDefinition cube_r157 = torso.addOrReplaceChild("cube_r157", CubeListBuilder.create().texOffs(59, 34).addBox(-0.3F, -1.0F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.249F)), PartPose.offsetAndRotation(2.0503F, -2.23F, -2.2593F, 1.5728F, -0.0175F, -3.1305F));

		PartDefinition cube_r158 = torso.addOrReplaceChild("cube_r158", CubeListBuilder.create().texOffs(0, 72).addBox(-0.052F, -0.2979F, -0.6459F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.102F)), PartPose.offsetAndRotation(4.9465F, 2.5228F, -1.5945F, 0.4141F, -0.1506F, -0.2879F));

		PartDefinition cube_r159 = torso.addOrReplaceChild("cube_r159", CubeListBuilder.create().texOffs(71, 62).addBox(0.4578F, -0.2979F, -0.7043F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.102F)), PartPose.offsetAndRotation(4.6521F, 3.0734F, -2.7853F, 0.4118F, -0.1106F, -0.2702F));

		PartDefinition cube_r160 = torso.addOrReplaceChild("cube_r160", CubeListBuilder.create().texOffs(47, 56).addBox(2.7066F, -2.7642F, -0.5043F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.2F, -0.0233F, -2.7102F, -0.0059F, 0.0535F, 1.0897F));

		PartDefinition cube_r161 = torso.addOrReplaceChild("cube_r161", CubeListBuilder.create().texOffs(59, 4).addBox(1.7437F, -0.9754F, -0.5043F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.2F, -0.0233F, -2.7102F, -0.0326F, 0.0428F, 0.5481F));

		PartDefinition cube_r162 = torso.addOrReplaceChild("cube_r162", CubeListBuilder.create().texOffs(60, 21).addBox(-0.004F, -0.0788F, -0.4573F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.2F, -0.0233F, -2.7102F, -0.0543F, 0.0471F, 0.0764F));

		PartDefinition cube_r163 = torso.addOrReplaceChild("cube_r163", CubeListBuilder.create().texOffs(40, 73).addBox(-0.3418F, -1.4737F, 3.108F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(3.9641F, -0.2306F, -5.6897F, -0.0773F, -0.019F, -0.7385F));

		PartDefinition cube_r164 = torso.addOrReplaceChild("cube_r164", CubeListBuilder.create().texOffs(30, 74).addBox(0.2575F, -0.2847F, -0.6918F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(4.5836F, 1.129F, -2.8301F, 0.3198F, -0.1189F, -0.2678F));

		PartDefinition cube_r165 = torso.addOrReplaceChild("cube_r165", CubeListBuilder.create().texOffs(30, 71).addBox(0.4886F, -0.5331F, 1.9289F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(4.5992F, 2.1817F, -6.993F, 0.2306F, 0.0469F, -0.2132F));

		PartDefinition cube_r166 = torso.addOrReplaceChild("cube_r166", CubeListBuilder.create().texOffs(75, 0).addBox(-0.3803F, -1.2232F, 1.1439F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(3.9641F, -0.2306F, -5.6897F, -0.0337F, -0.019F, -0.7385F));

		PartDefinition cube_r167 = torso.addOrReplaceChild("cube_r167", CubeListBuilder.create().texOffs(77, 39).addBox(-0.1909F, -0.0522F, -0.5292F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.0767F, -0.6352F, -0.2275F, 0.0874F, -0.2912F));

		PartDefinition cube_r168 = torso.addOrReplaceChild("cube_r168", CubeListBuilder.create().texOffs(50, 4).addBox(0.6966F, -0.4132F, -0.5482F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.0767F, -0.6352F, -0.1691F, 0.1572F, 0.1785F));

		PartDefinition chest = torso.addOrReplaceChild("chest", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.1431F, -3.9826F, 0.1506F, 0.1726F, 0.0261F));

		PartDefinition cube_r169 = chest.addOrReplaceChild("cube_r169", CubeListBuilder.create().texOffs(0, 15).mirror().addBox(-7.1F, 0.0F, -0.7F, 7.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.0593F, 4.8547F, -6.7208F, 0.1139F, 0.7229F, 0.2426F));

		PartDefinition cube_r170 = chest.addOrReplaceChild("cube_r170", CubeListBuilder.create().texOffs(13, 7).mirror().addBox(-6.2F, 0.0F, -0.5F, 7.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.0593F, 4.8547F, -6.7208F, 0.0866F, 0.5509F, 0.1993F));

		PartDefinition cube_r171 = chest.addOrReplaceChild("cube_r171", CubeListBuilder.create().texOffs(41, 39).mirror().addBox(-0.5F, -1.0F, -1.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.6619F, 3.3676F, -9.9094F, 1.1851F, -0.6297F, -0.7229F));

		PartDefinition cube_r172 = chest.addOrReplaceChild("cube_r172", CubeListBuilder.create().texOffs(60, 43).mirror().addBox(-0.9624F, -1.6555F, -1.5996F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.136F, 1.5865F, -8.312F, 1.213F, -0.1745F, 0.0436F));

		PartDefinition cube_r173 = chest.addOrReplaceChild("cube_r173", CubeListBuilder.create().texOffs(64, 67).mirror().addBox(-0.9624F, -1.053F, -1.114F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(-2.136F, 1.5865F, -8.312F, 1.0385F, -0.1745F, 0.0436F));

		PartDefinition cube_r174 = chest.addOrReplaceChild("cube_r174", CubeListBuilder.create().texOffs(31, 48).mirror().addBox(-0.9624F, -0.9313F, -0.47F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.136F, 1.5865F, -8.312F, 0.6894F, -0.1745F, 0.0436F));

		PartDefinition cube_r175 = chest.addOrReplaceChild("cube_r175", CubeListBuilder.create().texOffs(46, 44).mirror().addBox(-0.9624F, -1.1842F, 1.3445F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(-2.136F, 1.5865F, -8.312F, 0.5149F, -0.1745F, 0.0436F));

		PartDefinition cube_r176 = chest.addOrReplaceChild("cube_r176", CubeListBuilder.create().texOffs(70, 70).mirror().addBox(-0.4F, -0.5F, -1.3F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false)
				.texOffs(10, 66).mirror().addBox(-0.6F, -0.5F, 0.3F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-3.1565F, 0.5799F, -8.1924F, 0.0972F, -0.2185F, 0.7233F));

		PartDefinition cube_r177 = chest.addOrReplaceChild("cube_r177", CubeListBuilder.create().texOffs(67, 38).mirror().addBox(-0.8F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-3.4251F, -0.0154F, -5.5047F, 0.0995F, -0.3054F, 0.7145F));

		PartDefinition cube_r178 = chest.addOrReplaceChild("cube_r178", CubeListBuilder.create().texOffs(5, 66).mirror().addBox(-0.2305F, -0.0316F, -0.7436F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)).mirror(false)
				.texOffs(66, 3).mirror().addBox(-0.2305F, -0.3316F, -0.7436F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.247F)).mirror(false), PartPose.offsetAndRotation(-1.8214F, -1.7978F, -8.3099F, 0.3053F, 0.1396F, 2.6051F));

		PartDefinition cube_r179 = chest.addOrReplaceChild("cube_r179", CubeListBuilder.create().texOffs(0, 66).mirror().addBox(-0.2305F, -0.8209F, -0.7336F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.249F)).mirror(false), PartPose.offsetAndRotation(-1.8214F, -1.7978F, -8.3099F, 0.3926F, 0.1396F, 2.6051F));

		PartDefinition cube_r180 = chest.addOrReplaceChild("cube_r180", CubeListBuilder.create().texOffs(70, 73).mirror().addBox(-0.2305F, -0.6291F, -0.7857F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.249F)).mirror(false), PartPose.offsetAndRotation(-1.8214F, -1.7978F, -8.3099F, 2.3124F, 0.1396F, 2.6051F));

		PartDefinition cube_r181 = chest.addOrReplaceChild("cube_r181", CubeListBuilder.create().texOffs(65, 73).mirror().addBox(-0.2305F, -0.3075F, -0.8086F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.247F)).mirror(false), PartPose.offsetAndRotation(-1.8214F, -1.7978F, -8.3099F, 2.6615F, 0.1396F, 2.6051F));

		PartDefinition cube_r182 = chest.addOrReplaceChild("cube_r182", CubeListBuilder.create().texOffs(60, 73).mirror().addBox(-0.2305F, -0.3177F, -0.3782F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)).mirror(false), PartPose.offsetAndRotation(-1.8214F, -1.7978F, -8.3099F, 2.7924F, 0.1396F, 2.6051F));

		PartDefinition cube_r183 = chest.addOrReplaceChild("cube_r183", CubeListBuilder.create().texOffs(20, 72).mirror().addBox(-0.4982F, -0.3645F, -0.5061F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.246F)).mirror(false), PartPose.offsetAndRotation(-1.9039F, -2.2376F, -5.3008F, 2.8014F, -0.0087F, 2.8836F));

		PartDefinition cube_r184 = chest.addOrReplaceChild("cube_r184", CubeListBuilder.create().texOffs(73, 59).mirror().addBox(-0.4973F, -0.3232F, -0.4407F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.252F)).mirror(false)
				.texOffs(73, 56).mirror().addBox(-0.4973F, -0.3232F, -0.6407F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.249F)).mirror(false)
				.texOffs(55, 73).mirror().addBox(-0.4973F, -0.6232F, -0.6407F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.245F)).mirror(false), PartPose.offsetAndRotation(-1.9534F, -1.9618F, -6.8216F, 2.6621F, 0.096F, 2.7797F));

		PartDefinition cube_r185 = chest.addOrReplaceChild("cube_r185", CubeListBuilder.create().texOffs(65, 44).mirror().addBox(-0.4973F, -0.7244F, -0.6571F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.258F)).mirror(false), PartPose.offsetAndRotation(-1.9534F, -1.9618F, -6.8216F, 0.3931F, 0.096F, 2.7797F));

		PartDefinition cube_r186 = chest.addOrReplaceChild("cube_r186", CubeListBuilder.create().texOffs(65, 41).mirror().addBox(-0.4973F, -0.4278F, -0.6118F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.249F)).mirror(false), PartPose.offsetAndRotation(-1.9534F, -1.9618F, -6.8216F, 0.9604F, 0.096F, 2.7797F));

		PartDefinition cube_r187 = chest.addOrReplaceChild("cube_r187", CubeListBuilder.create().texOffs(72, 18).mirror().addBox(-0.4982F, -0.4082F, -0.5865F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)).mirror(false)
				.texOffs(72, 12).mirror().addBox(-0.4982F, -0.6832F, -0.5865F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.249F)).mirror(false), PartPose.offsetAndRotation(-1.9039F, -2.2376F, -5.3008F, 0.6197F, -0.0087F, 2.8836F));

		PartDefinition cube_r188 = chest.addOrReplaceChild("cube_r188", CubeListBuilder.create().texOffs(10, 72).mirror().addBox(-0.4982F, -0.332F, -0.5699F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.249F)).mirror(false), PartPose.offsetAndRotation(-1.9039F, -2.2376F, -5.3008F, 2.2778F, -0.0087F, 2.8836F));

		PartDefinition cube_r189 = chest.addOrReplaceChild("cube_r189", CubeListBuilder.create().texOffs(35, 73).mirror().addBox(-0.2848F, -2.6903F, -0.8542F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.249F)).mirror(false)
				.texOffs(74, 65).mirror().addBox(-0.2848F, -2.1903F, -0.8542F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.249F)).mirror(false), PartPose.offsetAndRotation(-1.7897F, -2.0178F, -1.7269F, 1.53F, 0.0612F, 3.1198F));

		PartDefinition cube_r190 = chest.addOrReplaceChild("cube_r190", CubeListBuilder.create().texOffs(55, 76).mirror().addBox(-0.4188F, -1.2309F, -0.7824F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.249F)).mirror(false)
				.texOffs(77, 36).mirror().addBox(-0.4188F, -0.7309F, -0.7824F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.249F)).mirror(false)
				.texOffs(75, 21).mirror().addBox(-0.4018F, 1.1717F, -0.6824F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.249F)).mirror(false)
				.texOffs(0, 75).mirror().addBox(-0.4018F, 0.6717F, -0.6824F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.249F)).mirror(false), PartPose.offsetAndRotation(-1.7897F, -2.0178F, -1.7269F, 1.6171F, -0.026F, 3.1272F));

		PartDefinition cube_r191 = chest.addOrReplaceChild("cube_r191", CubeListBuilder.create().texOffs(56, 32).mirror().addBox(-2.891F, -0.4534F, -0.5238F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.4948F, -8.2776F, 0.1238F, 0.3916F, -0.7287F));

		PartDefinition cube_r192 = chest.addOrReplaceChild("cube_r192", CubeListBuilder.create().texOffs(19, 58).mirror().addBox(-1.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.4948F, -8.2776F, 0.2835F, 0.2698F, -0.2465F));

		PartDefinition cube_r193 = chest.addOrReplaceChild("cube_r193", CubeListBuilder.create().texOffs(12, 58).mirror().addBox(-4.2446F, -1.8776F, -0.5238F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.4948F, -8.2776F, -0.1073F, 0.3963F, -1.3159F));

		PartDefinition cube_r194 = chest.addOrReplaceChild("cube_r194", CubeListBuilder.create().texOffs(55, 41).mirror().addBox(-2.891F, -0.4534F, -0.5238F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.1F, 0.1948F, -6.3776F, 0.0596F, 0.2756F, -0.6451F));

		PartDefinition cube_r195 = chest.addOrReplaceChild("cube_r195", CubeListBuilder.create().texOffs(47, 58).mirror().addBox(-1.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.1F, 0.1948F, -6.3776F, 0.1731F, 0.1949F, -0.1672F));

		PartDefinition cube_r196 = chest.addOrReplaceChild("cube_r196", CubeListBuilder.create().texOffs(17, 15).mirror().addBox(-5.2446F, -1.8776F, -0.5238F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.1F, 0.1948F, -6.3776F, -0.0945F, 0.2659F, -1.207F));

		PartDefinition cube_r197 = chest.addOrReplaceChild("cube_r197", CubeListBuilder.create().texOffs(60, 19).mirror().addBox(-1.996F, -0.0788F, -0.4573F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.0052F, -0.5776F, -0.185F, -0.0567F, -0.0696F));

		PartDefinition cube_r198 = chest.addOrReplaceChild("cube_r198", CubeListBuilder.create().texOffs(60, 13).mirror().addBox(-3.7437F, -0.9754F, -0.5042F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.0052F, -0.5776F, -0.145F, -0.1106F, -0.5395F));

		PartDefinition cube_r199 = chest.addOrReplaceChild("cube_r199", CubeListBuilder.create().texOffs(12, 60).mirror().addBox(-4.7066F, -2.7642F, -0.5042F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.0052F, -0.5776F, -0.0672F, -0.1694F, -1.0829F));

		PartDefinition cube_r200 = chest.addOrReplaceChild("cube_r200", CubeListBuilder.create().texOffs(23, 43).mirror().addBox(-5.2446F, -1.8776F, -0.5238F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.5F, -0.1052F, -4.4776F, -0.0827F, 0.1355F, -1.161F));

		PartDefinition cube_r201 = chest.addOrReplaceChild("cube_r201", CubeListBuilder.create().texOffs(58, 11).mirror().addBox(-2.891F, -0.4534F, -0.5238F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.5F, -0.1052F, -4.4776F, -0.0006F, 0.1586F, -0.6144F));

		PartDefinition cube_r202 = chest.addOrReplaceChild("cube_r202", CubeListBuilder.create().texOffs(54, 58).mirror().addBox(-1.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.5F, -0.1052F, -4.4776F, 0.066F, 0.1178F, -0.1403F));

		PartDefinition cube_r203 = chest.addOrReplaceChild("cube_r203", CubeListBuilder.create().texOffs(36, 59).mirror().addBox(-1.7961F, -0.0768F, -0.5189F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.2052F, -2.4776F, -0.0167F, 0.0221F, -0.0966F));

		PartDefinition cube_r204 = chest.addOrReplaceChild("cube_r204", CubeListBuilder.create().texOffs(5, 60).mirror().addBox(-3.565F, -0.8827F, -0.5611F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.2052F, -2.4776F, -0.0306F, 0.0358F, -0.5678F));

		PartDefinition cube_r205 = chest.addOrReplaceChild("cube_r205", CubeListBuilder.create().texOffs(21, 53).mirror().addBox(-5.6012F, -2.5927F, -0.5611F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.2052F, -2.4776F, -0.0447F, 0.015F, -1.1086F));

		PartDefinition cube_r206 = chest.addOrReplaceChild("cube_r206", CubeListBuilder.create().texOffs(30, 6).mirror().addBox(-4.9F, 0.0F, -0.1F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5485F, 4.8306F, -7.5927F, 0.0475F, 0.5098F, 0.1463F));

		PartDefinition cube_r207 = chest.addOrReplaceChild("cube_r207", CubeListBuilder.create().texOffs(36, 33).mirror().addBox(-3.7F, 0.0F, -0.5F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.3264F, 4.6431F, -7.7322F, 0.2651F, 0.328F, 0.2594F));

		PartDefinition cube_r208 = chest.addOrReplaceChild("cube_r208", CubeListBuilder.create().texOffs(25, 69).mirror().addBox(-0.5749F, -0.9669F, -0.7033F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-3.9641F, -0.3389F, -1.6754F, -0.036F, -0.0013F, 0.7443F));

		PartDefinition cube_r209 = chest.addOrReplaceChild("cube_r209", CubeListBuilder.create().texOffs(62, 38).mirror().addBox(-0.7671F, -0.9895F, -2.3844F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-3.9641F, -0.3389F, -1.6754F, 0.0963F, -0.1751F, 0.7276F));

		PartDefinition cube_r210 = chest.addOrReplaceChild("cube_r210", CubeListBuilder.create().texOffs(30, 77).mirror().addBox(-0.1721F, -0.3504F, -4.9151F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-4.7992F, 1.8543F, -3.321F, 0.0161F, -0.1896F, 0.2149F));

		PartDefinition cube_r211 = chest.addOrReplaceChild("cube_r211", CubeListBuilder.create().texOffs(60, 23).mirror().addBox(-1.4316F, -0.5343F, -2.6344F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-4.1992F, 1.8543F, -3.321F, 0.0161F, -0.1896F, 0.2149F));

		PartDefinition cube_r212 = chest.addOrReplaceChild("cube_r212", CubeListBuilder.create().texOffs(50, 76).mirror().addBox(-0.5809F, -0.5F, -0.7025F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.102F)).mirror(false), PartPose.offsetAndRotation(-4.5943F, 3.4056F, -6.3482F, -0.3343F, -0.8097F, 0.3561F));

		PartDefinition cube_r213 = chest.addOrReplaceChild("cube_r213", CubeListBuilder.create().texOffs(63, 58).mirror().addBox(-0.5772F, -0.5F, -0.296F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-4.5943F, 3.4056F, -6.3482F, -0.2293F, -0.0938F, 0.1316F));

		PartDefinition cube_r214 = chest.addOrReplaceChild("cube_r214", CubeListBuilder.create().texOffs(64, 50).mirror().addBox(-0.7746F, -0.4313F, -0.5005F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.102F)).mirror(false), PartPose.offsetAndRotation(-4.8844F, 3.7626F, -4.6684F, -0.1294F, -0.3161F, 0.2732F));

		PartDefinition cube_r215 = chest.addOrReplaceChild("cube_r215", CubeListBuilder.create().texOffs(56, 64).mirror().addBox(-0.794F, -0.4412F, -0.51F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-4.9531F, 3.8263F, -4.1772F, -0.154F, 0.0642F, 0.1899F));

		PartDefinition cube_r216 = chest.addOrReplaceChild("cube_r216", CubeListBuilder.create().texOffs(67, 12).mirror().addBox(-0.8052F, -0.7856F, -1.2803F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-4.5992F, 1.8543F, -3.321F, 0.0158F, -0.0151F, 0.2177F));

		PartDefinition cube_r217 = chest.addOrReplaceChild("cube_r217", CubeListBuilder.create().texOffs(64, 32).mirror().addBox(-0.9004F, -0.7444F, 0.2211F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-4.7992F, 1.8543F, -3.321F, 0.1467F, -0.0151F, 0.2177F));

		PartDefinition cube_r218 = chest.addOrReplaceChild("cube_r218", CubeListBuilder.create().texOffs(74, 30).mirror().addBox(-0.6565F, -0.6659F, -0.1566F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.102F)).mirror(false)
				.texOffs(77, 18).mirror().addBox(-0.6636F, -0.7297F, -2.0442F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.102F)).mirror(false)
				.texOffs(78, 24).mirror().addBox(-0.6636F, -0.7297F, -1.5442F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-5.733F, 3.9455F, -1.1399F, 0.0601F, -0.0094F, 0.218F));

		PartDefinition cube_r219 = chest.addOrReplaceChild("cube_r219", CubeListBuilder.create().texOffs(60, 19).addBox(-0.004F, -0.0788F, -0.4573F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.0052F, -0.5776F, -0.185F, 0.0567F, 0.0696F));

		PartDefinition cube_r220 = chest.addOrReplaceChild("cube_r220", CubeListBuilder.create().texOffs(60, 13).addBox(1.7437F, -0.9754F, -0.5042F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.0052F, -0.5776F, -0.145F, 0.1106F, 0.5395F));

		PartDefinition cube_r221 = chest.addOrReplaceChild("cube_r221", CubeListBuilder.create().texOffs(12, 60).addBox(2.7066F, -2.7642F, -0.5042F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.0052F, -0.5776F, -0.0672F, 0.1694F, 1.0829F));

		PartDefinition cube_r222 = chest.addOrReplaceChild("cube_r222", CubeListBuilder.create().texOffs(12, 58).addBox(2.2446F, -1.8776F, -0.5238F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.4948F, -8.2776F, -0.1073F, -0.3963F, 1.3159F));

		PartDefinition cube_r223 = chest.addOrReplaceChild("cube_r223", CubeListBuilder.create().texOffs(19, 58).addBox(-1.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.4948F, -8.2776F, 0.2835F, -0.2698F, 0.2465F));

		PartDefinition cube_r224 = chest.addOrReplaceChild("cube_r224", CubeListBuilder.create().texOffs(56, 32).addBox(0.891F, -0.4534F, -0.5238F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.4948F, -8.2776F, 0.1238F, -0.3916F, 0.7287F));

		PartDefinition cube_r225 = chest.addOrReplaceChild("cube_r225", CubeListBuilder.create().texOffs(17, 15).addBox(2.2446F, -1.8776F, -0.5238F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.1F, 0.1948F, -6.3776F, -0.0945F, -0.2659F, 1.207F));

		PartDefinition cube_r226 = chest.addOrReplaceChild("cube_r226", CubeListBuilder.create().texOffs(47, 58).addBox(-1.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.1F, 0.1948F, -6.3776F, 0.1731F, -0.1949F, 0.1672F));

		PartDefinition cube_r227 = chest.addOrReplaceChild("cube_r227", CubeListBuilder.create().texOffs(55, 41).addBox(0.891F, -0.4534F, -0.5238F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.1F, 0.1948F, -6.3776F, 0.0596F, -0.2756F, 0.6451F));

		PartDefinition cube_r228 = chest.addOrReplaceChild("cube_r228", CubeListBuilder.create().texOffs(23, 43).addBox(2.2446F, -1.8776F, -0.5238F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.5F, -0.1052F, -4.4776F, -0.0827F, -0.1355F, 1.161F));

		PartDefinition cube_r229 = chest.addOrReplaceChild("cube_r229", CubeListBuilder.create().texOffs(58, 11).addBox(0.891F, -0.4534F, -0.5238F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.5F, -0.1052F, -4.4776F, -0.0006F, -0.1586F, 0.6144F));

		PartDefinition cube_r230 = chest.addOrReplaceChild("cube_r230", CubeListBuilder.create().texOffs(54, 58).addBox(-1.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.5F, -0.1052F, -4.4776F, 0.066F, -0.1178F, 0.1403F));

		PartDefinition cube_r231 = chest.addOrReplaceChild("cube_r231", CubeListBuilder.create().texOffs(36, 59).addBox(-0.2039F, -0.0768F, -0.5189F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.2052F, -2.4776F, -0.0167F, -0.0221F, 0.0966F));

		PartDefinition cube_r232 = chest.addOrReplaceChild("cube_r232", CubeListBuilder.create().texOffs(5, 60).addBox(1.565F, -0.8827F, -0.5611F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.2052F, -2.4776F, -0.0306F, -0.0358F, 0.5678F));

		PartDefinition cube_r233 = chest.addOrReplaceChild("cube_r233", CubeListBuilder.create().texOffs(21, 53).addBox(2.6012F, -2.5927F, -0.5611F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.2052F, -2.4776F, -0.0447F, -0.015F, 1.1086F));

		PartDefinition cube_r234 = chest.addOrReplaceChild("cube_r234", CubeListBuilder.create().texOffs(40, 79).addBox(-0.5F, -1.5486F, 0.0566F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.3164F, -5.0259F, 0.0611F, 0.0F, 0.0F));

		PartDefinition cube_r235 = chest.addOrReplaceChild("cube_r235", CubeListBuilder.create().texOffs(52, 79).addBox(-0.5F, -1.1178F, -1.0168F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.0836F, -7.9259F, 0.1833F, 0.0F, 0.0F));

		PartDefinition cube_r236 = chest.addOrReplaceChild("cube_r236", CubeListBuilder.create().texOffs(79, 51).addBox(-0.5F, -1.475F, -3.9305F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.3164F, -3.0259F, 0.1134F, 0.0F, 0.0F));

		PartDefinition cube_r237 = chest.addOrReplaceChild("cube_r237", CubeListBuilder.create().texOffs(24, 45).addBox(-0.5F, -0.2495F, -0.441F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 4.751F, -8.0869F, -0.0611F, 0.0F, 0.0F));

		PartDefinition cube_r238 = chest.addOrReplaceChild("cube_r238", CubeListBuilder.create().texOffs(37, 8).addBox(-1.0F, -0.2F, 0.0F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 3.651F, -9.6869F, -0.6283F, 0.0F, 0.0F));

		PartDefinition cube_r239 = chest.addOrReplaceChild("cube_r239", CubeListBuilder.create().texOffs(41, 39).addBox(-0.5F, -1.0F, -1.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.6619F, 3.3676F, -9.9094F, 1.1851F, 0.6297F, 0.7229F));

		PartDefinition cube_r240 = chest.addOrReplaceChild("cube_r240", CubeListBuilder.create().texOffs(60, 43).addBox(-0.0376F, -1.6555F, -1.5996F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.136F, 1.5865F, -8.312F, 1.213F, 0.1745F, -0.0436F));

		PartDefinition cube_r241 = chest.addOrReplaceChild("cube_r241", CubeListBuilder.create().texOffs(64, 67).addBox(-0.0376F, -1.053F, -1.114F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(2.136F, 1.5865F, -8.312F, 1.0385F, 0.1745F, -0.0436F));

		PartDefinition cube_r242 = chest.addOrReplaceChild("cube_r242", CubeListBuilder.create().texOffs(31, 48).addBox(-0.0376F, -0.9313F, -0.47F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.136F, 1.5865F, -8.312F, 0.6894F, 0.1745F, -0.0436F));

		PartDefinition cube_r243 = chest.addOrReplaceChild("cube_r243", CubeListBuilder.create().texOffs(46, 44).addBox(-0.0376F, -1.1842F, 1.3445F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(2.136F, 1.5865F, -8.312F, 0.5149F, 0.1745F, -0.0436F));

		PartDefinition cube_r244 = chest.addOrReplaceChild("cube_r244", CubeListBuilder.create().texOffs(26, 0).addBox(-1.0F, 0.0032F, -4.0242F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.3164F, -5.9259F, 0.1658F, 0.0F, 0.0F));

		PartDefinition cube_r245 = chest.addOrReplaceChild("cube_r245", CubeListBuilder.create().texOffs(43, 79).addBox(-1.5F, -1.4827F, -0.0233F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.5F, -0.4307F, -2.9507F, -0.0785F, 0.0F, 0.0F));

		PartDefinition cube_r246 = chest.addOrReplaceChild("cube_r246", CubeListBuilder.create().texOffs(0, 15).addBox(0.1F, 0.0F, -0.7F, 7.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0593F, 4.8547F, -6.7208F, 0.1139F, -0.7229F, -0.2426F));

		PartDefinition cube_r247 = chest.addOrReplaceChild("cube_r247", CubeListBuilder.create().texOffs(13, 7).addBox(-0.8F, 0.0F, -0.5F, 7.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0593F, 4.8547F, -6.7208F, 0.0866F, -0.5509F, -0.1993F));

		PartDefinition cube_r248 = chest.addOrReplaceChild("cube_r248", CubeListBuilder.create().texOffs(30, 6).addBox(-0.1F, 0.0F, -0.1F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5485F, 4.8306F, -7.5927F, 0.0475F, -0.5098F, -0.1463F));

		PartDefinition cube_r249 = chest.addOrReplaceChild("cube_r249", CubeListBuilder.create().texOffs(36, 33).addBox(-0.3F, 0.0F, -0.5F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.3264F, 4.6431F, -7.7322F, 0.2651F, -0.328F, -0.2594F));

		PartDefinition cube_r250 = chest.addOrReplaceChild("cube_r250", CubeListBuilder.create().texOffs(46, 79).addBox(0.0F, -1.4349F, -0.0012F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.4486F, -0.9727F, -0.1396F, 0.0F, 0.0F));

		PartDefinition cube_r251 = chest.addOrReplaceChild("cube_r251", CubeListBuilder.create().texOffs(25, 69).addBox(-0.4251F, -0.9669F, -0.7033F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(3.9641F, -0.3389F, -1.6754F, -0.036F, 0.0013F, -0.7443F));

		PartDefinition cube_r252 = chest.addOrReplaceChild("cube_r252", CubeListBuilder.create().texOffs(67, 38).addBox(-0.2F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(3.4251F, -0.0154F, -5.5047F, 0.0995F, 0.3054F, -0.7145F));

		PartDefinition cube_r253 = chest.addOrReplaceChild("cube_r253", CubeListBuilder.create().texOffs(70, 70).addBox(-0.6F, -0.5F, -1.3F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F))
				.texOffs(10, 66).addBox(-0.4F, -0.5F, 0.3F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(3.1565F, 0.5799F, -8.1924F, 0.0972F, 0.2185F, -0.7233F));

		PartDefinition cube_r254 = chest.addOrReplaceChild("cube_r254", CubeListBuilder.create().texOffs(62, 38).addBox(-0.2329F, -0.9895F, -2.3844F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(3.9641F, -0.3389F, -1.6754F, 0.0963F, 0.1751F, -0.7276F));

		PartDefinition cube_r255 = chest.addOrReplaceChild("cube_r255", CubeListBuilder.create().texOffs(30, 77).addBox(-0.8279F, -0.3504F, -4.9151F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(4.7992F, 1.8543F, -3.321F, 0.0161F, 0.1896F, -0.2149F));

		PartDefinition cube_r256 = chest.addOrReplaceChild("cube_r256", CubeListBuilder.create().texOffs(60, 23).addBox(0.4316F, -0.5343F, -2.6344F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(4.1992F, 1.8543F, -3.321F, 0.0161F, 0.1896F, -0.2149F));

		PartDefinition cube_r257 = chest.addOrReplaceChild("cube_r257", CubeListBuilder.create().texOffs(50, 76).addBox(-0.4191F, -0.5F, -0.7025F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.102F)), PartPose.offsetAndRotation(4.5943F, 3.4056F, -6.3482F, -0.3343F, 0.8097F, -0.3561F));

		PartDefinition cube_r258 = chest.addOrReplaceChild("cube_r258", CubeListBuilder.create().texOffs(63, 58).addBox(-0.4228F, -0.5F, -0.296F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(4.5943F, 3.4056F, -6.3482F, -0.2293F, 0.0938F, -0.1316F));

		PartDefinition cube_r259 = chest.addOrReplaceChild("cube_r259", CubeListBuilder.create().texOffs(64, 50).addBox(-0.2254F, -0.4313F, -0.5005F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.102F)), PartPose.offsetAndRotation(4.8844F, 3.7626F, -4.6684F, -0.1294F, 0.3161F, -0.2732F));

		PartDefinition cube_r260 = chest.addOrReplaceChild("cube_r260", CubeListBuilder.create().texOffs(56, 64).addBox(-0.206F, -0.4412F, -0.51F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(4.9531F, 3.8263F, -4.1772F, -0.154F, -0.0642F, -0.1899F));

		PartDefinition cube_r261 = chest.addOrReplaceChild("cube_r261", CubeListBuilder.create().texOffs(67, 12).addBox(-0.1948F, -0.7856F, -1.2803F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(4.5992F, 1.8543F, -3.321F, 0.0158F, 0.0151F, -0.2177F));

		PartDefinition cube_r262 = chest.addOrReplaceChild("cube_r262", CubeListBuilder.create().texOffs(64, 32).addBox(-0.0996F, -0.7444F, 0.2211F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(4.7992F, 1.8543F, -3.321F, 0.1467F, 0.0151F, -0.2177F));

		PartDefinition cube_r263 = chest.addOrReplaceChild("cube_r263", CubeListBuilder.create().texOffs(60, 73).addBox(-0.7695F, -0.3177F, -0.3782F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)), PartPose.offsetAndRotation(1.8214F, -1.7978F, -8.3099F, 2.7924F, -0.1396F, -2.6051F));

		PartDefinition cube_r264 = chest.addOrReplaceChild("cube_r264", CubeListBuilder.create().texOffs(65, 73).addBox(-0.7695F, -0.3075F, -0.8086F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.247F)), PartPose.offsetAndRotation(1.8214F, -1.7978F, -8.3099F, 2.6615F, -0.1396F, -2.6051F));

		PartDefinition cube_r265 = chest.addOrReplaceChild("cube_r265", CubeListBuilder.create().texOffs(70, 73).addBox(-0.7695F, -0.6291F, -0.7857F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.249F)), PartPose.offsetAndRotation(1.8214F, -1.7978F, -8.3099F, 2.3124F, -0.1396F, -2.6051F));

		PartDefinition cube_r266 = chest.addOrReplaceChild("cube_r266", CubeListBuilder.create().texOffs(0, 66).addBox(-0.7695F, -0.8209F, -0.7336F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.249F)), PartPose.offsetAndRotation(1.8214F, -1.7978F, -8.3099F, 0.3926F, -0.1396F, -2.6051F));

		PartDefinition cube_r267 = chest.addOrReplaceChild("cube_r267", CubeListBuilder.create().texOffs(5, 66).addBox(-0.7695F, -0.0316F, -0.7436F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F))
				.texOffs(66, 3).addBox(-0.7695F, -0.3316F, -0.7436F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.247F)), PartPose.offsetAndRotation(1.8214F, -1.7978F, -8.3099F, 0.3053F, -0.1396F, -2.6051F));

		PartDefinition cube_r268 = chest.addOrReplaceChild("cube_r268", CubeListBuilder.create().texOffs(65, 41).addBox(-0.5027F, -0.4278F, -0.6118F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.249F)), PartPose.offsetAndRotation(1.9534F, -1.9618F, -6.8216F, 0.9604F, -0.096F, -2.7797F));

		PartDefinition cube_r269 = chest.addOrReplaceChild("cube_r269", CubeListBuilder.create().texOffs(65, 44).addBox(-0.5027F, -0.7244F, -0.6571F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.258F)), PartPose.offsetAndRotation(1.9534F, -1.9618F, -6.8216F, 0.3931F, -0.096F, -2.7797F));

		PartDefinition cube_r270 = chest.addOrReplaceChild("cube_r270", CubeListBuilder.create().texOffs(73, 59).addBox(-0.5027F, -0.3232F, -0.4407F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.252F))
				.texOffs(73, 56).addBox(-0.5027F, -0.3232F, -0.6407F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.249F))
				.texOffs(55, 73).addBox(-0.5027F, -0.6232F, -0.6407F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.245F)), PartPose.offsetAndRotation(1.9534F, -1.9618F, -6.8216F, 2.6621F, -0.096F, -2.7797F));

		PartDefinition cube_r271 = chest.addOrReplaceChild("cube_r271", CubeListBuilder.create().texOffs(20, 72).addBox(-0.5018F, -0.3645F, -0.5061F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.246F)), PartPose.offsetAndRotation(1.9039F, -2.2376F, -5.3008F, 2.8014F, 0.0087F, -2.8836F));

		PartDefinition cube_r272 = chest.addOrReplaceChild("cube_r272", CubeListBuilder.create().texOffs(10, 72).addBox(-0.5018F, -0.332F, -0.5699F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.249F)), PartPose.offsetAndRotation(1.9039F, -2.2376F, -5.3008F, 2.2778F, 0.0087F, -2.8836F));

		PartDefinition cube_r273 = chest.addOrReplaceChild("cube_r273", CubeListBuilder.create().texOffs(72, 18).addBox(-0.5018F, -0.4082F, -0.5865F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F))
				.texOffs(72, 12).addBox(-0.5018F, -0.6832F, -0.5865F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.249F)), PartPose.offsetAndRotation(1.9039F, -2.2376F, -5.3008F, 0.6197F, 0.0087F, -2.8836F));

		PartDefinition cube_r274 = chest.addOrReplaceChild("cube_r274", CubeListBuilder.create().texOffs(74, 65).addBox(-0.7153F, -2.1903F, -0.8542F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.249F))
				.texOffs(35, 73).addBox(-0.7153F, -2.6903F, -0.8542F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.249F)), PartPose.offsetAndRotation(1.7897F, -2.0178F, -1.7269F, 1.53F, -0.0612F, -3.1198F));

		PartDefinition cube_r275 = chest.addOrReplaceChild("cube_r275", CubeListBuilder.create().texOffs(77, 36).addBox(-0.5812F, -0.7309F, -0.7824F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.249F))
				.texOffs(55, 76).addBox(-0.5812F, -1.2309F, -0.7824F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.249F))
				.texOffs(0, 75).addBox(-0.5982F, 0.6717F, -0.6824F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.249F))
				.texOffs(75, 21).addBox(-0.5982F, 1.1717F, -0.6824F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.249F)), PartPose.offsetAndRotation(1.7897F, -2.0178F, -1.7269F, 1.6171F, 0.026F, -3.1272F));

		PartDefinition cube_r276 = chest.addOrReplaceChild("cube_r276", CubeListBuilder.create().texOffs(74, 30).addBox(-0.3435F, -0.6659F, -0.1566F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.102F))
				.texOffs(77, 18).addBox(-0.3364F, -0.7297F, -2.0442F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.102F))
				.texOffs(78, 24).addBox(-0.3364F, -0.7297F, -1.5442F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(5.733F, 3.9455F, -1.1399F, 0.0601F, 0.0094F, -0.218F));

		PartDefinition cube_r277 = chest.addOrReplaceChild("cube_r277", CubeListBuilder.create().texOffs(18, 33).addBox(-2.0F, 0.0172F, -3.018F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(1.5F, -0.6307F, -2.9507F, 0.1047F, 0.0F, 0.0F));

		PartDefinition cube_r278 = chest.addOrReplaceChild("cube_r278", CubeListBuilder.create().texOffs(9, 33).addBox(-2.0F, -0.2796F, 3.6755F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(1.5F, -0.4307F, -6.6507F, -0.0262F, 0.0F, 0.0F));

		PartDefinition leftarm = chest.addOrReplaceChild("leftarm", CubeListBuilder.create(), PartPose.offsetAndRotation(2.609F, 3.0685F, -8.981F, -0.3927F, 0.0F, -0.2618F));

		PartDefinition cube_r279 = leftarm.addOrReplaceChild("cube_r279", CubeListBuilder.create().texOffs(46, 64).addBox(-0.5F, -0.7679F, -0.5976F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.0565F, 0.7082F, -0.1408F, 0.7088F, -0.9209F, -0.6401F));

		PartDefinition cube_r280 = leftarm.addOrReplaceChild("cube_r280", CubeListBuilder.create().texOffs(64, 35).addBox(-0.5F, -0.2304F, -0.5928F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.007F)), PartPose.offsetAndRotation(0.0565F, 0.7082F, -0.1408F, 1.3895F, -0.9209F, -0.6401F));

		PartDefinition cube_r281 = leftarm.addOrReplaceChild("cube_r281", CubeListBuilder.create().texOffs(44, 27).addBox(0.0F, -3.648F, -0.862F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(-0.7847F, 2.8391F, 1.9019F, 0.48F, 0.0F, 0.0F));

		PartDefinition cube_r282 = leftarm.addOrReplaceChild("cube_r282", CubeListBuilder.create().texOffs(65, 9).addBox(0.0F, 2.25F, -0.35F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(-0.7847F, 1.5391F, 0.1019F, 0.6894F, 0.0F, 0.0F));

		PartDefinition leftarm2 = leftarm.addOrReplaceChild("leftarm2", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.4053F, 3.891F, 2.3325F, -0.0393F, 0.0774F, 0.2579F));

		PartDefinition cube_r283 = leftarm2.addOrReplaceChild("cube_r283", CubeListBuilder.create().texOffs(19, 45).addBox(-1.05F, -2.1F, -0.5F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(46, 8).addBox(0.05F, -2.1F, -0.5F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.05F, 2.2149F, -0.7875F, -0.6892F, -1.0782F, 0.6279F));

		PartDefinition lefthand = leftarm2.addOrReplaceChild("lefthand", CubeListBuilder.create().texOffs(13, 17).addBox(-1.499F, -0.4896F, -2.3405F, 3.0F, 1.0F, 3.0F, new CubeDeformation(0.002F)), PartPose.offsetAndRotation(0.0F, 4.0872F, -1.3854F, 0.288F, 0.0F, 0.0F));

		PartDefinition rightarm = chest.addOrReplaceChild("rightarm", CubeListBuilder.create(), PartPose.offsetAndRotation(-2.609F, 3.0685F, -8.981F, 0.48F, 0.0F, 0.2618F));

		PartDefinition cube_r284 = rightarm.addOrReplaceChild("cube_r284", CubeListBuilder.create().texOffs(46, 64).mirror().addBox(-0.5F, -0.7679F, -0.5976F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.001F)).mirror(false), PartPose.offsetAndRotation(-0.0565F, 0.7082F, -0.1408F, 0.7088F, 0.9209F, 0.6401F));

		PartDefinition cube_r285 = rightarm.addOrReplaceChild("cube_r285", CubeListBuilder.create().texOffs(64, 35).mirror().addBox(-0.5F, -0.2304F, -0.5928F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.007F)).mirror(false), PartPose.offsetAndRotation(-0.0565F, 0.7082F, -0.1408F, 1.3895F, 0.9209F, 0.6401F));

		PartDefinition cube_r286 = rightarm.addOrReplaceChild("cube_r286", CubeListBuilder.create().texOffs(44, 27).mirror().addBox(-1.0F, -3.648F, -0.862F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.001F)).mirror(false), PartPose.offsetAndRotation(0.7847F, 2.8391F, 1.9019F, 0.48F, 0.0F, 0.0F));

		PartDefinition cube_r287 = rightarm.addOrReplaceChild("cube_r287", CubeListBuilder.create().texOffs(65, 9).mirror().addBox(-1.0F, 2.25F, -0.35F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.007F)).mirror(false), PartPose.offsetAndRotation(0.7847F, 1.5391F, 0.1019F, 0.6894F, 0.0F, 0.0F));

		PartDefinition rightarm2 = rightarm.addOrReplaceChild("rightarm2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.4053F, 3.891F, 2.3325F, -0.4756F, -0.0774F, -0.2579F));

		PartDefinition cube_r288 = rightarm2.addOrReplaceChild("cube_r288", CubeListBuilder.create().texOffs(19, 45).mirror().addBox(0.05F, -2.1F, -0.5F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(46, 8).mirror().addBox(-1.05F, -2.1F, -0.5F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.05F, 2.2149F, -0.7875F, -0.6892F, 1.0782F, -0.6279F));

		PartDefinition righthand = rightarm2.addOrReplaceChild("righthand", CubeListBuilder.create().texOffs(13, 17).mirror().addBox(-1.501F, -0.4896F, -2.3405F, 3.0F, 1.0F, 3.0F, new CubeDeformation(0.002F)).mirror(false), PartPose.offsetAndRotation(0.0F, 4.0872F, -1.3854F, 0.7243F, 0.0F, 0.0F));

		PartDefinition neck4 = chest.addOrReplaceChild("neck4", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.7241F, -9.4545F, 1.121F, 0.2368F, -0.1128F));

		PartDefinition cube_r289 = neck4.addOrReplaceChild("cube_r289", CubeListBuilder.create().texOffs(52, 48).mirror().addBox(-0.2147F, -0.5379F, -1.2284F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.25F)).mirror(false)
				.texOffs(46, 22).mirror().addBox(-0.8147F, -0.5379F, -1.2284F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.25F)).mirror(false), PartPose.offsetAndRotation(-2.3526F, -1.0736F, -0.7617F, -1.0326F, 1.3238F, 0.7625F));

		PartDefinition cube_r290 = neck4.addOrReplaceChild("cube_r290", CubeListBuilder.create().texOffs(19, 60).mirror().addBox(-0.5147F, -1.4664F, -0.8292F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.249F)).mirror(false), PartPose.offsetAndRotation(-2.3526F, -1.0736F, -0.7617F, 0.2328F, 1.3238F, 0.7625F));

		PartDefinition cube_r291 = neck4.addOrReplaceChild("cube_r291", CubeListBuilder.create().texOffs(10, 69).mirror().addBox(-0.5147F, -0.5429F, -0.8084F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.245F)).mirror(false)
				.texOffs(5, 69).mirror().addBox(-0.5147F, -0.0429F, -0.8084F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.245F)).mirror(false), PartPose.offsetAndRotation(-2.3526F, -1.0736F, -0.7617F, 1.1491F, 1.3238F, 0.7625F));

		PartDefinition cube_r292 = neck4.addOrReplaceChild("cube_r292", CubeListBuilder.create().texOffs(46, 0).mirror().addBox(-0.7865F, -0.6433F, -1.2334F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.25F)).mirror(false)
				.texOffs(38, 48).mirror().addBox(-0.1865F, -0.6433F, -1.2334F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.25F)).mirror(false), PartPose.offsetAndRotation(-1.9233F, -1.8997F, 1.1172F, 1.0724F, 0.9362F, 2.8394F));

		PartDefinition cube_r293 = neck4.addOrReplaceChild("cube_r293", CubeListBuilder.create().texOffs(68, 29).mirror().addBox(-0.4865F, 0.0135F, -0.7192F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.245F)).mirror(false)
				.texOffs(68, 26).mirror().addBox(-0.4865F, -0.4865F, -0.7192F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.245F)).mirror(false), PartPose.offsetAndRotation(-1.9233F, -1.8997F, 1.1172F, -3.0292F, 0.9362F, 2.8394F));

		PartDefinition cube_r294 = neck4.addOrReplaceChild("cube_r294", CubeListBuilder.create().texOffs(37, 4).mirror().addBox(-3.2446F, -1.8776F, -0.5238F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.7293F, -0.323F, -0.076F, -0.3836F, -1.3877F));

		PartDefinition cube_r295 = neck4.addOrReplaceChild("cube_r295", CubeListBuilder.create().texOffs(58, 9).mirror().addBox(-2.891F, -0.4534F, -0.5238F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.7293F, -0.323F, -0.2672F, -0.2885F, -0.8224F));

		PartDefinition cube_r296 = neck4.addOrReplaceChild("cube_r296", CubeListBuilder.create().texOffs(14, 49).mirror().addBox(-1.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.7293F, -0.323F, -0.3732F, -0.1614F, -0.3563F));

		PartDefinition cube_r297 = neck4.addOrReplaceChild("cube_r297", CubeListBuilder.create().texOffs(60, 15).mirror().addBox(-0.4865F, -1.5028F, -0.7302F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.249F)).mirror(false), PartPose.offsetAndRotation(-1.9233F, -1.8997F, 1.1172F, 2.3377F, 0.9362F, 2.8394F));

		PartDefinition cube_r298 = neck4.addOrReplaceChild("cube_r298", CubeListBuilder.create().texOffs(46, 22).addBox(-0.1853F, -0.5379F, -1.2284F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.25F))
				.texOffs(52, 48).addBox(-0.7853F, -0.5379F, -1.2284F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.25F)), PartPose.offsetAndRotation(2.3526F, -1.0736F, -0.7617F, -1.0326F, -1.3238F, -0.7625F));

		PartDefinition cube_r299 = neck4.addOrReplaceChild("cube_r299", CubeListBuilder.create().texOffs(5, 69).addBox(-0.4853F, -0.0429F, -0.8084F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.245F))
				.texOffs(10, 69).addBox(-0.4853F, -0.5429F, -0.8084F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.245F)), PartPose.offsetAndRotation(2.3526F, -1.0736F, -0.7617F, 1.1491F, -1.3238F, -0.7625F));

		PartDefinition cube_r300 = neck4.addOrReplaceChild("cube_r300", CubeListBuilder.create().texOffs(19, 60).addBox(-0.4853F, -1.4664F, -0.8292F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.249F)), PartPose.offsetAndRotation(2.3526F, -1.0736F, -0.7617F, 0.2328F, -1.3238F, -0.7625F));

		PartDefinition cube_r301 = neck4.addOrReplaceChild("cube_r301", CubeListBuilder.create().texOffs(68, 29).addBox(-0.5135F, 0.0135F, -0.7192F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.245F))
				.texOffs(68, 26).addBox(-0.5135F, -0.4865F, -0.7192F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.245F)), PartPose.offsetAndRotation(1.9233F, -1.8997F, 1.1172F, -3.0292F, -0.9362F, -2.8394F));

		PartDefinition cube_r302 = neck4.addOrReplaceChild("cube_r302", CubeListBuilder.create().texOffs(60, 15).addBox(-0.5135F, -1.5028F, -0.7302F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.249F)), PartPose.offsetAndRotation(1.9233F, -1.8997F, 1.1172F, 2.3377F, -0.9362F, -2.8394F));

		PartDefinition cube_r303 = neck4.addOrReplaceChild("cube_r303", CubeListBuilder.create().texOffs(37, 4).addBox(2.2446F, -1.8776F, -0.5238F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.7293F, -0.323F, -0.076F, 0.3836F, 1.3877F));

		PartDefinition cube_r304 = neck4.addOrReplaceChild("cube_r304", CubeListBuilder.create().texOffs(58, 9).addBox(0.891F, -0.4534F, -0.5238F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.7293F, -0.323F, -0.2672F, 0.2885F, 0.8224F));

		PartDefinition cube_r305 = neck4.addOrReplaceChild("cube_r305", CubeListBuilder.create().texOffs(14, 49).addBox(0.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.7293F, -0.323F, -0.3732F, 0.1614F, 0.3563F));

		PartDefinition cube_r306 = neck4.addOrReplaceChild("cube_r306", CubeListBuilder.create().texOffs(46, 0).addBox(-0.2135F, -0.6433F, -1.2334F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.25F))
				.texOffs(38, 48).addBox(-0.8135F, -0.6433F, -1.2334F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.25F)), PartPose.offsetAndRotation(1.9233F, -1.8997F, 1.1172F, 1.0724F, -0.9362F, -2.8394F));

		PartDefinition cube_r307 = neck4.addOrReplaceChild("cube_r307", CubeListBuilder.create().texOffs(80, 9).addBox(0.0F, -1.0027F, -0.5372F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.6791F, 0.1316F, -1.2305F, 0.0F, 0.0F));

		PartDefinition cube_r308 = neck4.addOrReplaceChild("cube_r308", CubeListBuilder.create().texOffs(43, 4).addBox(-0.5F, -0.3133F, 1.5278F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.0F, -3.5391F, -0.7008F, -1.3614F, 0.0F, 0.0F));

		PartDefinition neck5 = neck4.addOrReplaceChild("neck5", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -1.7594F, -0.2229F, -0.7968F, 0.2462F, -0.0047F));

		PartDefinition cube_r309 = neck5.addOrReplaceChild("cube_r309", CubeListBuilder.create().texOffs(80, 41).addBox(0.0F, -0.6744F, 1.3207F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(53, 0).addBox(-0.5F, -0.0744F, 0.3207F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.6749F, -1.9219F, -0.672F, 0.0F, 0.0F));

		PartDefinition neck6 = neck5.addOrReplaceChild("neck6", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.9229F, -2.0725F, -0.6488F, 0.3557F, -0.2582F));

		PartDefinition cube_r310 = neck6.addOrReplaceChild("cube_r310", CubeListBuilder.create().texOffs(80, 6).addBox(0.0F, -0.3111F, -2.9757F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(67, 79).addBox(0.0F, -0.6111F, -0.9757F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(0, 33).addBox(-0.5F, -0.1111F, -2.9757F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.6469F, 0.1113F, -0.2356F, 0.0F, 0.0F));

		PartDefinition cube_r311 = neck6.addOrReplaceChild("cube_r311", CubeListBuilder.create().texOffs(0, 69).mirror().addBox(-0.5F, 0.0114F, -0.7143F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.245F)).mirror(false)
				.texOffs(34, 65).mirror().addBox(-0.5F, -0.4886F, -0.7143F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.245F)).mirror(false), PartPose.offsetAndRotation(-1.8371F, 0.2859F, 0.0161F, 1.9906F, 0.0196F, 1.0904F));

		PartDefinition cube_r312 = neck6.addOrReplaceChild("cube_r312", CubeListBuilder.create().texOffs(60, 0).mirror().addBox(-0.5F, -1.5079F, -0.7289F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.249F)).mirror(false), PartPose.offsetAndRotation(-1.8371F, 0.2859F, 0.0161F, 1.0743F, 0.0196F, 1.0904F));

		PartDefinition cube_r313 = neck6.addOrReplaceChild("cube_r313", CubeListBuilder.create().texOffs(12, 45).mirror().addBox(-0.8F, -0.6461F, -1.2379F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.25F)).mirror(false)
				.texOffs(5, 45).mirror().addBox(-0.2F, -0.6461F, -1.2379F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.25F)).mirror(false), PartPose.offsetAndRotation(-1.8371F, 0.2859F, 0.0161F, -0.1911F, 0.0196F, 1.0904F));

		PartDefinition cube_r314 = neck6.addOrReplaceChild("cube_r314", CubeListBuilder.create().texOffs(39, 44).mirror().addBox(-0.2F, -0.6461F, -1.2379F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.25F)).mirror(false)
				.texOffs(32, 44).mirror().addBox(-0.8F, -0.6461F, -1.2379F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.25F)).mirror(false), PartPose.offsetAndRotation(-1.637F, -1.7141F, -0.4839F, 0.0035F, 0.1194F, 2.1948F));

		PartDefinition cube_r315 = neck6.addOrReplaceChild("cube_r315", CubeListBuilder.create().texOffs(59, 47).mirror().addBox(-0.5F, -1.5079F, -0.7289F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.249F)).mirror(false), PartPose.offsetAndRotation(-1.637F, -1.7141F, -0.4839F, 1.2688F, 0.1194F, 2.1948F));

		PartDefinition cube_r316 = neck6.addOrReplaceChild("cube_r316", CubeListBuilder.create().texOffs(65, 23).mirror().addBox(-0.5F, -0.4886F, -0.7143F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.245F)).mirror(false)
				.texOffs(30, 68).mirror().addBox(-0.5F, 0.0114F, -0.7143F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.245F)).mirror(false), PartPose.offsetAndRotation(-1.637F, -1.7141F, -0.4839F, 2.1851F, 0.1194F, 2.1948F));

		PartDefinition cube_r317 = neck6.addOrReplaceChild("cube_r317", CubeListBuilder.create().texOffs(5, 45).addBox(-0.8F, -0.6461F, -1.2379F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.25F))
				.texOffs(12, 45).addBox(-0.2F, -0.6461F, -1.2379F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.25F)), PartPose.offsetAndRotation(1.8371F, 0.2859F, 0.0161F, -0.1911F, -0.0196F, -1.0904F));

		PartDefinition cube_r318 = neck6.addOrReplaceChild("cube_r318", CubeListBuilder.create().texOffs(60, 0).addBox(-0.5F, -1.5079F, -0.7289F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.249F)), PartPose.offsetAndRotation(1.8371F, 0.2859F, 0.0161F, 1.0743F, -0.0196F, -1.0904F));

		PartDefinition cube_r319 = neck6.addOrReplaceChild("cube_r319", CubeListBuilder.create().texOffs(34, 65).addBox(-0.5F, -0.4886F, -0.7143F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.245F))
				.texOffs(0, 69).addBox(-0.5F, 0.0114F, -0.7143F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.245F)), PartPose.offsetAndRotation(1.8371F, 0.2859F, 0.0161F, 1.9906F, -0.0196F, -1.0904F));

		PartDefinition cube_r320 = neck6.addOrReplaceChild("cube_r320", CubeListBuilder.create().texOffs(30, 68).addBox(-0.5F, 0.0114F, -0.7143F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.245F))
				.texOffs(65, 23).addBox(-0.5F, -0.4886F, -0.7143F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.245F)), PartPose.offsetAndRotation(1.637F, -1.7141F, -0.4839F, 2.1851F, -0.1194F, -2.1948F));

		PartDefinition cube_r321 = neck6.addOrReplaceChild("cube_r321", CubeListBuilder.create().texOffs(59, 47).addBox(-0.5F, -1.5079F, -0.7289F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.249F)), PartPose.offsetAndRotation(1.637F, -1.7141F, -0.4839F, 1.2688F, -0.1194F, -2.1948F));

		PartDefinition cube_r322 = neck6.addOrReplaceChild("cube_r322", CubeListBuilder.create().texOffs(39, 44).addBox(-0.8F, -0.6461F, -1.2379F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.25F))
				.texOffs(32, 44).addBox(-0.2F, -0.6461F, -1.2379F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.25F)), PartPose.offsetAndRotation(1.637F, -1.7141F, -0.4839F, 0.0035F, -0.1194F, -2.1948F));

		PartDefinition head = neck6.addOrReplaceChild("head", CubeListBuilder.create(), PartPose.offsetAndRotation(0.1F, -0.8185F, -2.922F, -0.0616F, 0.4205F, 0.1201F));

		PartDefinition cube_r323 = head.addOrReplaceChild("cube_r323", CubeListBuilder.create().texOffs(0, 38).addBox(-1.0F, -0.225F, -1.45F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-0.1F, -0.1516F, 0.3513F, -0.1571F, 0.0F, 0.0F));

		PartDefinition cube_r324 = head.addOrReplaceChild("cube_r324", CubeListBuilder.create().texOffs(33, 27).addBox(-1.5F, -0.816F, -0.8079F, 4.0F, 1.0F, 1.0F, new CubeDeformation(-0.153F)), PartPose.offsetAndRotation(-0.6F, -0.8516F, 0.5512F, 0.6283F, 0.0F, 0.0F));

		PartDefinition cube_r325 = head.addOrReplaceChild("cube_r325", CubeListBuilder.create().texOffs(26, 56).addBox(-1.0F, -0.75F, -0.45F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.153F)), PartPose.offsetAndRotation(-0.1F, -0.1516F, 0.3513F, 0.2356F, 0.0F, 0.0F));

		PartDefinition cube_r326 = head.addOrReplaceChild("cube_r326", CubeListBuilder.create().texOffs(12, 55).addBox(-1.0F, 0.5344F, -0.8632F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.144F))
				.texOffs(36, 35).addBox(-1.5F, -0.4406F, -0.9882F, 3.0F, 2.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-0.1F, -1.5045F, -1.2628F, 0.4712F, 0.0F, 0.0F));

		PartDefinition cube_r327 = head.addOrReplaceChild("cube_r327", CubeListBuilder.create().texOffs(5, 42).addBox(-1.0F, -0.1559F, -0.1381F, 3.0F, 1.0F, 1.0F, new CubeDeformation(-0.148F)), PartPose.offsetAndRotation(-0.6F, -1.7045F, -1.5378F, -0.2138F, 0.0F, 0.0F));

		PartDefinition cube_r328 = head.addOrReplaceChild("cube_r328", CubeListBuilder.create().texOffs(14, 42).addBox(-1.0F, -0.3278F, -0.7763F, 3.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-0.6F, -1.3545F, -0.4628F, -0.096F, 0.0F, 0.0F));

		PartDefinition cube_r329 = head.addOrReplaceChild("cube_r329", CubeListBuilder.create().texOffs(58, 6).addBox(-1.0F, 0.4972F, -0.7763F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.146F)), PartPose.offsetAndRotation(-0.1F, -1.3545F, -0.4628F, -0.1396F, 0.0F, 0.0F));

		PartDefinition cube_r330 = head.addOrReplaceChild("cube_r330", CubeListBuilder.create().texOffs(0, 29).addBox(-1.5F, -0.1649F, -0.8753F, 4.0F, 2.0F, 1.0F, new CubeDeformation(-0.148F)), PartPose.offsetAndRotation(-0.6F, -1.3545F, 0.2622F, -0.2269F, 0.0F, 0.0F));

		PartDefinition cube_r331 = head.addOrReplaceChild("cube_r331", CubeListBuilder.create().texOffs(63, 29).addBox(-0.7F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F)), PartPose.offsetAndRotation(0.1658F, -0.7916F, -3.8438F, 0.5186F, 0.0F, 0.0F));

		PartDefinition cube_r332 = head.addOrReplaceChild("cube_r332", CubeListBuilder.create().texOffs(65, 0).addBox(-0.575F, -0.1589F, -0.1664F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.0457F, -1.4089F, -3.1959F, 0.0255F, 0.0F, 0.0F));

		PartDefinition cube_r333 = head.addOrReplaceChild("cube_r333", CubeListBuilder.create().texOffs(41, 64).addBox(-0.875F, -0.475F, -0.45F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.3457F, -1.0089F, -3.3959F, 0.3222F, 0.0F, 0.0F));

		PartDefinition cube_r334 = head.addOrReplaceChild("cube_r334", CubeListBuilder.create().texOffs(34, 39).addBox(-0.5243F, -1.0F, -1.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.4244F, -0.4959F, -1.0687F, -0.061F, 0.0F, 0.0F));

		PartDefinition cube_r335 = head.addOrReplaceChild("cube_r335", CubeListBuilder.create().texOffs(56, 26).addBox(-1.5F, -0.5F, -0.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.3921F, -0.2027F, -1.1854F, -0.061F, 0.0F, 0.0F));

		PartDefinition cube_r336 = head.addOrReplaceChild("cube_r336", CubeListBuilder.create().texOffs(57, 55).addBox(-1.0F, -0.3F, -0.65F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-0.0992F, 0.0621F, -0.5227F, -0.4973F, 0.0F, 0.0F));

		PartDefinition leftFace = head.addOrReplaceChild("leftFace", CubeListBuilder.create(), PartPose.offset(0.3F, 0.0838F, -2.3755F));

		PartDefinition cube_r337 = leftFace.addOrReplaceChild("cube_r337", CubeListBuilder.create().texOffs(10, 62).addBox(0.0F, -0.7F, -0.6F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.156F)), PartPose.offsetAndRotation(-0.4F, -0.117F, 2.0708F, 0.9425F, 0.0F, 0.0F));

		PartDefinition cube_r338 = leftFace.addOrReplaceChild("cube_r338", CubeListBuilder.create().texOffs(35, 79).addBox(-0.5004F, 0.0096F, -0.6845F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F))
				.texOffs(79, 33).addBox(-0.5004F, -0.4654F, -0.6845F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)), PartPose.offsetAndRotation(1.3415F, -0.1848F, 2.337F, 0.6524F, 0.2173F, -0.0193F));

		PartDefinition cube_r339 = leftFace.addOrReplaceChild("cube_r339", CubeListBuilder.create().texOffs(7, 49).addBox(-0.4996F, 0.0275F, -1.0699F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.25F)), PartPose.offsetAndRotation(1.3415F, -0.1848F, 2.337F, -0.3598F, 0.2173F, -0.0193F));

		PartDefinition cube_r340 = leftFace.addOrReplaceChild("cube_r340", CubeListBuilder.create().texOffs(5, 62).addBox(-0.5004F, -1.4731F, -0.6985F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.247F)), PartPose.offsetAndRotation(1.3415F, -0.1848F, 2.337F, -0.2639F, 0.2173F, -0.0193F));

		PartDefinition cube_r341 = leftFace.addOrReplaceChild("cube_r341", CubeListBuilder.create().texOffs(49, 30).addBox(-1.025F, -0.925F, -0.575F, 2.0F, 2.0F, 1.0F, new CubeDeformation(-0.148F)), PartPose.offsetAndRotation(0.611F, -0.5991F, 1.7551F, 0.0116F, 0.148F, 0.0009F));

		PartDefinition cube_r342 = leftFace.addOrReplaceChild("cube_r342", CubeListBuilder.create().texOffs(78, 27).addBox(1.5F, -0.3278F, -0.6013F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.147F)), PartPose.offsetAndRotation(-0.9F, -1.4384F, 1.9127F, -0.096F, 0.0F, 0.0F));

		PartDefinition cube_r343 = leftFace.addOrReplaceChild("cube_r343", CubeListBuilder.create().texOffs(74, 33).addBox(-0.4971F, -0.6516F, -0.5922F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)), PartPose.offsetAndRotation(1.1107F, -0.6606F, 1.0351F, 0.6894F, 0.3927F, -0.0131F));

		PartDefinition cube_r344 = leftFace.addOrReplaceChild("cube_r344", CubeListBuilder.create().texOffs(75, 68).addBox(-0.4971F, -0.2267F, -0.172F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.252F)), PartPose.offsetAndRotation(1.1107F, -0.6606F, 1.0351F, -1.9722F, 0.3927F, -0.0131F));

		PartDefinition cube_r345 = leftFace.addOrReplaceChild("cube_r345", CubeListBuilder.create().texOffs(5, 75).addBox(-0.4721F, -0.5063F, -0.4731F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F))
				.texOffs(25, 75).addBox(-0.3471F, -0.5063F, -0.4731F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F)), PartPose.offsetAndRotation(1.1107F, -0.6606F, 1.0351F, -1.6668F, 0.3927F, -0.0131F));

		PartDefinition cube_r346 = leftFace.addOrReplaceChild("cube_r346", CubeListBuilder.create().texOffs(0, 63).addBox(-0.4971F, -0.503F, -0.22F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.248F)), PartPose.offsetAndRotation(1.1107F, -0.6606F, 1.0351F, -1.5795F, 0.3927F, -0.0131F));

		PartDefinition cube_r347 = leftFace.addOrReplaceChild("cube_r347", CubeListBuilder.create().texOffs(75, 44).addBox(-0.4995F, -0.5717F, -0.1992F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)), PartPose.offsetAndRotation(1.1107F, -0.6606F, 1.0351F, -0.8378F, 0.2182F, -0.0131F));

		PartDefinition cube_r348 = leftFace.addOrReplaceChild("cube_r348", CubeListBuilder.create().texOffs(65, 6).addBox(-0.4995F, -0.848F, -0.508F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.252F)), PartPose.offsetAndRotation(1.1107F, -0.6606F, 1.0351F, -1.4923F, 0.2182F, -0.0131F));

		PartDefinition cube_r349 = leftFace.addOrReplaceChild("cube_r349", CubeListBuilder.create().texOffs(24, 63).addBox(-0.4995F, -0.687F, -0.243F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.248F)), PartPose.offsetAndRotation(1.1107F, -0.6606F, 1.0351F, 0.3578F, 0.2182F, -0.0131F));

		PartDefinition cube_r350 = leftFace.addOrReplaceChild("cube_r350", CubeListBuilder.create().texOffs(20, 75).addBox(-0.85F, -0.1411F, -0.857F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.154F)), PartPose.offsetAndRotation(1.45F, -1.6503F, 1.5434F, -0.2211F, 0.2557F, -0.0568F));

		PartDefinition cube_r351 = leftFace.addOrReplaceChild("cube_r351", CubeListBuilder.create().texOffs(63, 26).addBox(-0.45F, -0.45F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.8274F, -1.3311F, 0.8544F, 0.44F, 0.3887F, -0.002F));

		PartDefinition cube_r352 = leftFace.addOrReplaceChild("cube_r352", CubeListBuilder.create().texOffs(53, 22).addBox(-0.975F, -0.9F, -1.0F, 2.0F, 2.0F, 1.0F, new CubeDeformation(-0.148F)), PartPose.offsetAndRotation(0.4287F, -0.6935F, 1.2877F, 0.0121F, 0.3225F, 0.003F));

		PartDefinition cube_r353 = leftFace.addOrReplaceChild("cube_r353", CubeListBuilder.create().texOffs(65, 70).addBox(-0.5122F, -0.3203F, -0.274F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(-0.2731F, -0.8373F, -2.1626F, 0.5603F, 0.0928F, -0.0197F));

		PartDefinition cube_r354 = leftFace.addOrReplaceChild("cube_r354", CubeListBuilder.create().texOffs(15, 67).addBox(-0.495F, -0.244F, -0.5191F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(-0.2731F, -0.4373F, -1.8626F, 0.9093F, 0.0928F, -0.0197F));

		PartDefinition cube_r355 = leftFace.addOrReplaceChild("cube_r355", CubeListBuilder.create().texOffs(60, 70).addBox(-0.511F, -0.5833F, -0.8095F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.198F))
				.texOffs(55, 70).addBox(-0.511F, -0.5833F, -0.2095F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.198F))
				.texOffs(45, 70).addBox(-0.511F, 0.0167F, -0.8095F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.198F))
				.texOffs(70, 44).addBox(-0.511F, 0.0167F, -0.2095F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.198F)), PartPose.offsetAndRotation(-0.014F, -0.5866F, -1.2407F, -0.0748F, 0.3991F, -0.0421F));

		PartDefinition cube_r356 = leftFace.addOrReplaceChild("cube_r356", CubeListBuilder.create().texOffs(5, 72).addBox(-0.4886F, -0.5003F, -0.6305F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(-0.2731F, -0.4373F, -1.8626F, 0.616F, 0.0946F, -0.035F));

		PartDefinition cube_r357 = leftFace.addOrReplaceChild("cube_r357", CubeListBuilder.create().texOffs(50, 70).addBox(-0.495F, -0.644F, -0.4191F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.296F)), PartPose.offsetAndRotation(-0.2731F, -0.4373F, -2.0626F, 0.9093F, 0.0928F, -0.0197F));

		PartDefinition cube_r358 = leftFace.addOrReplaceChild("cube_r358", CubeListBuilder.create().texOffs(36, 61).addBox(-0.495F, -1.0627F, -0.9453F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(-0.2731F, -0.4373F, -2.0626F, 2.1791F, 0.0928F, -0.0197F));

		PartDefinition cube_r359 = leftFace.addOrReplaceChild("cube_r359", CubeListBuilder.create().texOffs(58, 60).addBox(-0.495F, -0.815F, -0.9174F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.296F)), PartPose.offsetAndRotation(-0.2731F, -0.4373F, -2.0626F, 1.6162F, 0.0928F, -0.0197F));

		PartDefinition cube_r360 = leftFace.addOrReplaceChild("cube_r360", CubeListBuilder.create().texOffs(37, 12).addBox(-0.9985F, -0.4495F, -1.0997F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.027F, -0.5999F, 0.1903F, -0.0596F, 0.4187F, -0.044F));

		PartDefinition cube_r361 = leftFace.addOrReplaceChild("cube_r361", CubeListBuilder.create().texOffs(37, 0).addBox(-1.0F, -0.45F, -0.5F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0211F, -1.2085F, 0.2336F, -0.0724F, 0.4187F, -0.0433F));

		PartDefinition cube_r362 = leftFace.addOrReplaceChild("cube_r362", CubeListBuilder.create().texOffs(57, 52).addBox(-1.0F, -0.475F, -0.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.154F)), PartPose.offsetAndRotation(-0.2469F, -1.1594F, -0.3729F, 0.0673F, 0.4187F, -0.0433F));

		PartDefinition cube_r363 = leftFace.addOrReplaceChild("cube_r363", CubeListBuilder.create().texOffs(45, 76).addBox(-0.495F, -0.6629F, -0.74F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(-0.2731F, -0.4373F, -2.0626F, 1.1362F, 0.0928F, -0.0197F));

		PartDefinition cube_r364 = leftFace.addOrReplaceChild("cube_r364", CubeListBuilder.create().texOffs(29, 63).addBox(-0.511F, -0.8797F, -0.573F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F)), PartPose.offsetAndRotation(-0.014F, -0.5866F, -1.2407F, 0.5186F, 0.3991F, -0.0421F));

		PartDefinition cube_r365 = leftFace.addOrReplaceChild("cube_r365", CubeListBuilder.create().texOffs(51, 64).addBox(-0.511F, -0.903F, -0.1183F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.014F, -0.5866F, -1.2407F, 0.3222F, 0.3991F, -0.0421F));

		PartDefinition cube_r366 = leftFace.addOrReplaceChild("cube_r366", CubeListBuilder.create().texOffs(5, 53).addBox(-0.6F, -0.5F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.7439F, 0.1352F, 0.6732F, -0.051F, 0.3572F, -0.011F));

		PartDefinition cube_r367 = leftFace.addOrReplaceChild("cube_r367", CubeListBuilder.create().texOffs(5, 57).addBox(-0.999F, 0.1361F, -0.9512F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.027F, -0.5999F, 0.1903F, -0.1334F, 0.4187F, -0.0433F));

		PartDefinition cube_r368 = leftFace.addOrReplaceChild("cube_r368", CubeListBuilder.create().texOffs(37, 16).addBox(-1.8463F, -0.8093F, -0.1091F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.148F)), PartPose.offsetAndRotation(0.7271F, 0.3001F, -0.4097F, -0.0025F, 0.3663F, -0.0431F));

		PartDefinition cube_r369 = leftFace.addOrReplaceChild("cube_r369", CubeListBuilder.create().texOffs(45, 73).addBox(-0.5F, -0.4757F, -0.6716F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)), PartPose.offsetAndRotation(-0.0064F, -0.4322F, -1.3589F, -2.9828F, 0.3952F, -0.136F));

		PartDefinition cube_r370 = leftFace.addOrReplaceChild("cube_r370", CubeListBuilder.create().texOffs(60, 76).addBox(-0.5F, -0.4423F, -0.3366F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.253F)), PartPose.offsetAndRotation(-0.0064F, -0.4322F, -1.3589F, -2.5028F, 0.3952F, -0.136F));

		PartDefinition rightFace = head.addOrReplaceChild("rightFace", CubeListBuilder.create(), PartPose.offset(-0.5F, 0.0838F, -2.3755F));

		PartDefinition cube_r371 = rightFace.addOrReplaceChild("cube_r371", CubeListBuilder.create().texOffs(10, 62).mirror().addBox(-1.0F, -0.7F, -0.6F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.156F)).mirror(false), PartPose.offsetAndRotation(0.4F, -0.117F, 2.0708F, 0.9425F, 0.0F, 0.0F));

		PartDefinition cube_r372 = rightFace.addOrReplaceChild("cube_r372", CubeListBuilder.create().texOffs(35, 79).mirror().addBox(-0.4996F, 0.0096F, -0.6845F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)).mirror(false)
				.texOffs(79, 33).mirror().addBox(-0.4996F, -0.4654F, -0.6845F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)).mirror(false), PartPose.offsetAndRotation(-1.3415F, -0.1848F, 2.337F, 0.6524F, -0.2173F, 0.0193F));

		PartDefinition cube_r373 = rightFace.addOrReplaceChild("cube_r373", CubeListBuilder.create().texOffs(7, 49).mirror().addBox(-0.5004F, 0.0275F, -1.0699F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.25F)).mirror(false), PartPose.offsetAndRotation(-1.3415F, -0.1848F, 2.337F, -0.3598F, -0.2173F, 0.0193F));

		PartDefinition cube_r374 = rightFace.addOrReplaceChild("cube_r374", CubeListBuilder.create().texOffs(5, 62).mirror().addBox(-0.4996F, -1.4731F, -0.6985F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.247F)).mirror(false), PartPose.offsetAndRotation(-1.3415F, -0.1848F, 2.337F, -0.2639F, -0.2173F, 0.0193F));

		PartDefinition cube_r375 = rightFace.addOrReplaceChild("cube_r375", CubeListBuilder.create().texOffs(49, 30).mirror().addBox(-0.975F, -0.925F, -0.575F, 2.0F, 2.0F, 1.0F, new CubeDeformation(-0.148F)).mirror(false), PartPose.offsetAndRotation(-0.611F, -0.5991F, 1.7551F, 0.0116F, -0.148F, -0.0009F));

		PartDefinition cube_r376 = rightFace.addOrReplaceChild("cube_r376", CubeListBuilder.create().texOffs(78, 27).mirror().addBox(-2.5F, -0.3278F, -0.6013F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.147F)).mirror(false), PartPose.offsetAndRotation(0.9F, -1.4384F, 1.9127F, -0.096F, 0.0F, 0.0F));

		PartDefinition cube_r377 = rightFace.addOrReplaceChild("cube_r377", CubeListBuilder.create().texOffs(74, 33).mirror().addBox(-0.5029F, -0.6516F, -0.5922F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)).mirror(false), PartPose.offsetAndRotation(-1.1107F, -0.6606F, 1.0351F, 0.6894F, -0.3927F, 0.0131F));

		PartDefinition cube_r378 = rightFace.addOrReplaceChild("cube_r378", CubeListBuilder.create().texOffs(75, 68).mirror().addBox(-0.5029F, -0.2267F, -0.172F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.252F)).mirror(false), PartPose.offsetAndRotation(-1.1107F, -0.6606F, 1.0351F, -1.9722F, -0.3927F, 0.0131F));

		PartDefinition cube_r379 = rightFace.addOrReplaceChild("cube_r379", CubeListBuilder.create().texOffs(5, 75).mirror().addBox(-0.5279F, -0.5063F, -0.4731F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)).mirror(false)
				.texOffs(25, 75).mirror().addBox(-0.6529F, -0.5063F, -0.4731F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F)).mirror(false), PartPose.offsetAndRotation(-1.1107F, -0.6606F, 1.0351F, -1.6668F, -0.3927F, 0.0131F));

		PartDefinition cube_r380 = rightFace.addOrReplaceChild("cube_r380", CubeListBuilder.create().texOffs(0, 63).mirror().addBox(-0.5029F, -0.503F, -0.22F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.248F)).mirror(false), PartPose.offsetAndRotation(-1.1107F, -0.6606F, 1.0351F, -1.5795F, -0.3927F, 0.0131F));

		PartDefinition cube_r381 = rightFace.addOrReplaceChild("cube_r381", CubeListBuilder.create().texOffs(75, 44).mirror().addBox(-0.5005F, -0.5717F, -0.1992F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)).mirror(false), PartPose.offsetAndRotation(-1.1107F, -0.6606F, 1.0351F, -0.8378F, -0.2182F, 0.0131F));

		PartDefinition cube_r382 = rightFace.addOrReplaceChild("cube_r382", CubeListBuilder.create().texOffs(65, 6).mirror().addBox(-0.5005F, -0.848F, -0.508F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.252F)).mirror(false), PartPose.offsetAndRotation(-1.1107F, -0.6606F, 1.0351F, -1.4923F, -0.2182F, 0.0131F));

		PartDefinition cube_r383 = rightFace.addOrReplaceChild("cube_r383", CubeListBuilder.create().texOffs(24, 63).mirror().addBox(-0.5005F, -0.687F, -0.243F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.248F)).mirror(false), PartPose.offsetAndRotation(-1.1107F, -0.6606F, 1.0351F, 0.3578F, -0.2182F, 0.0131F));

		PartDefinition cube_r384 = rightFace.addOrReplaceChild("cube_r384", CubeListBuilder.create().texOffs(20, 75).mirror().addBox(-0.15F, -0.1411F, -0.857F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.154F)).mirror(false), PartPose.offsetAndRotation(-1.45F, -1.6503F, 1.5434F, -0.2211F, -0.2557F, 0.0568F));

		PartDefinition cube_r385 = rightFace.addOrReplaceChild("cube_r385", CubeListBuilder.create().texOffs(63, 26).mirror().addBox(-0.55F, -0.45F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(-0.8274F, -1.3311F, 0.8544F, 0.44F, -0.3887F, 0.002F));

		PartDefinition cube_r386 = rightFace.addOrReplaceChild("cube_r386", CubeListBuilder.create().texOffs(53, 22).mirror().addBox(-1.025F, -0.9F, -1.0F, 2.0F, 2.0F, 1.0F, new CubeDeformation(-0.148F)).mirror(false), PartPose.offsetAndRotation(-0.4287F, -0.6935F, 1.2877F, 0.0121F, -0.3225F, -0.003F));

		PartDefinition cube_r387 = rightFace.addOrReplaceChild("cube_r387", CubeListBuilder.create().texOffs(65, 70).mirror().addBox(-0.4878F, -0.3203F, -0.274F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(0.2731F, -0.8373F, -2.1626F, 0.5603F, -0.0928F, 0.0197F));

		PartDefinition cube_r388 = rightFace.addOrReplaceChild("cube_r388", CubeListBuilder.create().texOffs(15, 67).mirror().addBox(-0.505F, -0.244F, -0.5191F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(0.2731F, -0.4373F, -1.8626F, 0.9093F, -0.0928F, 0.0197F));

		PartDefinition cube_r389 = rightFace.addOrReplaceChild("cube_r389", CubeListBuilder.create().texOffs(60, 70).mirror().addBox(-0.489F, -0.5833F, -0.8095F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.198F)).mirror(false)
				.texOffs(55, 70).mirror().addBox(-0.489F, -0.5833F, -0.2095F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.198F)).mirror(false)
				.texOffs(45, 70).mirror().addBox(-0.489F, 0.0167F, -0.8095F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.198F)).mirror(false)
				.texOffs(70, 44).mirror().addBox(-0.489F, 0.0167F, -0.2095F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.198F)).mirror(false), PartPose.offsetAndRotation(0.014F, -0.5866F, -1.2407F, -0.0748F, -0.3991F, 0.0421F));

		PartDefinition cube_r390 = rightFace.addOrReplaceChild("cube_r390", CubeListBuilder.create().texOffs(5, 72).mirror().addBox(-0.5114F, -0.5003F, -0.6305F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(0.2731F, -0.4373F, -1.8626F, 0.616F, -0.0946F, 0.035F));

		PartDefinition cube_r391 = rightFace.addOrReplaceChild("cube_r391", CubeListBuilder.create().texOffs(50, 70).mirror().addBox(-0.505F, -0.644F, -0.4191F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.296F)).mirror(false), PartPose.offsetAndRotation(0.2731F, -0.4373F, -2.0626F, 0.9093F, -0.0928F, 0.0197F));

		PartDefinition cube_r392 = rightFace.addOrReplaceChild("cube_r392", CubeListBuilder.create().texOffs(36, 61).mirror().addBox(-0.505F, -1.0627F, -0.9453F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(0.2731F, -0.4373F, -2.0626F, 2.1791F, -0.0928F, 0.0197F));

		PartDefinition cube_r393 = rightFace.addOrReplaceChild("cube_r393", CubeListBuilder.create().texOffs(58, 60).mirror().addBox(-0.505F, -0.815F, -0.9174F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.296F)).mirror(false), PartPose.offsetAndRotation(0.2731F, -0.4373F, -2.0626F, 1.6162F, -0.0928F, 0.0197F));

		PartDefinition cube_r394 = rightFace.addOrReplaceChild("cube_r394", CubeListBuilder.create().texOffs(37, 12).mirror().addBox(-1.0015F, -0.4495F, -1.0997F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(-0.027F, -0.5999F, 0.1903F, -0.0596F, -0.4187F, 0.044F));

		PartDefinition cube_r395 = rightFace.addOrReplaceChild("cube_r395", CubeListBuilder.create().texOffs(37, 0).mirror().addBox(-1.0F, -0.45F, -0.5F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(-0.0211F, -1.2085F, 0.2336F, -0.0724F, -0.4187F, 0.0433F));

		PartDefinition cube_r396 = rightFace.addOrReplaceChild("cube_r396", CubeListBuilder.create().texOffs(57, 52).mirror().addBox(-1.0F, -0.475F, -0.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.154F)).mirror(false), PartPose.offsetAndRotation(0.2469F, -1.1594F, -0.3729F, 0.0673F, -0.4187F, 0.0433F));

		PartDefinition cube_r397 = rightFace.addOrReplaceChild("cube_r397", CubeListBuilder.create().texOffs(45, 76).mirror().addBox(-0.505F, -0.6629F, -0.74F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(0.2731F, -0.4373F, -2.0626F, 1.1362F, -0.0928F, 0.0197F));

		PartDefinition cube_r398 = rightFace.addOrReplaceChild("cube_r398", CubeListBuilder.create().texOffs(29, 63).mirror().addBox(-0.489F, -0.8797F, -0.573F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F)).mirror(false), PartPose.offsetAndRotation(0.014F, -0.5866F, -1.2407F, 0.5186F, -0.3991F, 0.0421F));

		PartDefinition cube_r399 = rightFace.addOrReplaceChild("cube_r399", CubeListBuilder.create().texOffs(51, 64).mirror().addBox(-0.489F, -0.903F, -0.1183F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(0.014F, -0.5866F, -1.2407F, 0.3222F, -0.3991F, 0.0421F));

		PartDefinition cube_r400 = rightFace.addOrReplaceChild("cube_r400", CubeListBuilder.create().texOffs(5, 53).mirror().addBox(-0.4F, -0.5F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(-0.7439F, 0.1352F, 0.6732F, -0.051F, -0.3572F, 0.011F));

		PartDefinition cube_r401 = rightFace.addOrReplaceChild("cube_r401", CubeListBuilder.create().texOffs(5, 57).mirror().addBox(-1.001F, 0.1361F, -0.9512F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(-0.027F, -0.5999F, 0.1903F, -0.1334F, -0.4187F, 0.0433F));

		PartDefinition cube_r402 = rightFace.addOrReplaceChild("cube_r402", CubeListBuilder.create().texOffs(37, 16).mirror().addBox(-0.1537F, -0.8093F, -0.1091F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.148F)).mirror(false), PartPose.offsetAndRotation(-0.7271F, 0.3001F, -0.4097F, -0.0025F, -0.3663F, 0.0431F));

		PartDefinition cube_r403 = rightFace.addOrReplaceChild("cube_r403", CubeListBuilder.create().texOffs(45, 73).mirror().addBox(-0.5F, -0.4757F, -0.6716F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)).mirror(false), PartPose.offsetAndRotation(0.0064F, -0.4322F, -1.3589F, -2.9828F, -0.3952F, 0.136F));

		PartDefinition cube_r404 = rightFace.addOrReplaceChild("cube_r404", CubeListBuilder.create().texOffs(60, 76).mirror().addBox(-0.5F, -0.4423F, -0.3366F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.253F)).mirror(false), PartPose.offsetAndRotation(0.0064F, -0.4322F, -1.3589F, -2.5028F, -0.3952F, 0.136F));

		PartDefinition jaw = head.addOrReplaceChild("jaw", CubeListBuilder.create(), PartPose.offsetAndRotation(0.4F, 0.8071F, 0.2247F, 1.0559F, 0.0F, 0.0F));

		PartDefinition cube_r405 = jaw.addOrReplaceChild("cube_r405", CubeListBuilder.create().texOffs(45, 35).mirror().addBox(-0.305F, -0.2755F, -1.5237F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-2.1F, -0.8878F, -1.3285F, -0.5986F, -0.3558F, 0.1385F));

		PartDefinition cube_r406 = jaw.addOrReplaceChild("cube_r406", CubeListBuilder.create().texOffs(63, 61).mirror().addBox(-0.4F, -1.5651F, -1.6729F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-2.3F, 0.2122F, -0.0285F, 0.0873F, -0.192F, 0.0F));

		PartDefinition cube_r407 = jaw.addOrReplaceChild("cube_r407", CubeListBuilder.create().texOffs(74, 53).mirror().addBox(-0.4F, -0.5441F, -1.8783F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.303F)).mirror(false), PartPose.offsetAndRotation(-2.3F, 0.2122F, -0.0285F, -0.6807F, -0.192F, 0.0F));

		PartDefinition cube_r408 = jaw.addOrReplaceChild("cube_r408", CubeListBuilder.create().texOffs(75, 9).mirror().addBox(-0.4F, -0.3949F, -1.5083F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.306F)).mirror(false), PartPose.offsetAndRotation(-2.3F, 0.2122F, -0.0285F, -0.8116F, -0.192F, 0.0F));

		PartDefinition cube_r409 = jaw.addOrReplaceChild("cube_r409", CubeListBuilder.create().texOffs(79, 30).mirror().addBox(-0.4F, -0.2881F, -1.1328F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.299F)).mirror(false), PartPose.offsetAndRotation(-2.3F, 0.2122F, -0.0285F, -0.9425F, -0.192F, 0.0F));

		PartDefinition cube_r410 = jaw.addOrReplaceChild("cube_r410", CubeListBuilder.create().texOffs(15, 79).mirror().addBox(-0.4F, -0.5301F, -0.9257F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-2.3F, 0.2122F, -0.0285F, -0.3752F, -0.192F, 0.0F));

		PartDefinition cube_r411 = jaw.addOrReplaceChild("cube_r411", CubeListBuilder.create().texOffs(49, 26).mirror().addBox(-0.305F, -0.1052F, -1.6334F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.303F)).mirror(false)
				.texOffs(0, 49).mirror().addBox(-0.305F, 0.2948F, -1.6334F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.303F)).mirror(false), PartPose.offsetAndRotation(-2.1F, -0.8878F, -1.3285F, -0.4502F, -0.3558F, 0.1385F));

		PartDefinition cube_r412 = jaw.addOrReplaceChild("cube_r412", CubeListBuilder.create().texOffs(45, 48).mirror().addBox(-0.2073F, -0.4003F, -1.5409F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-2.1F, -0.8878F, -1.3285F, -0.6247F, -0.3558F, 0.1385F));

		PartDefinition cube_r413 = jaw.addOrReplaceChild("cube_r413", CubeListBuilder.create().texOffs(20, 66).mirror().addBox(-0.286F, -0.6467F, -1.8858F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.298F)).mirror(false)
				.texOffs(75, 6).mirror().addBox(-0.2496F, -0.5911F, -3.3453F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.355F)).mirror(false), PartPose.offsetAndRotation(-2.1F, -0.8878F, -1.3285F, -0.2809F, -0.3903F, 0.1404F));

		PartDefinition cube_r414 = jaw.addOrReplaceChild("cube_r414", CubeListBuilder.create().texOffs(75, 41).mirror().addBox(-0.286F, -1.1258F, -2.5207F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-2.1F, -0.8878F, -1.3285F, -0.0191F, -0.3903F, 0.1404F));

		PartDefinition cube_r415 = jaw.addOrReplaceChild("cube_r415", CubeListBuilder.create().texOffs(76, 62).mirror().addBox(-0.286F, -0.794F, -2.2529F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.303F)).mirror(false), PartPose.offsetAndRotation(-2.1F, -0.8878F, -1.3285F, -0.1936F, -0.3903F, 0.1404F));

		PartDefinition cube_r416 = jaw.addOrReplaceChild("cube_r416", CubeListBuilder.create().texOffs(74, 50).mirror().addBox(-0.2496F, 1.6208F, -2.5964F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.349F)).mirror(false), PartPose.offsetAndRotation(-2.1F, -0.8878F, -1.3285F, -1.0226F, -0.3903F, 0.1404F));

		PartDefinition cube_r417 = jaw.addOrReplaceChild("cube_r417", CubeListBuilder.create().texOffs(73, 27).mirror().addBox(-0.2496F, 2.0562F, -2.3538F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F)).mirror(false), PartPose.offsetAndRotation(-2.1F, -0.8878F, -1.3285F, -1.2408F, -0.3903F, 0.1404F));

		PartDefinition cube_r418 = jaw.addOrReplaceChild("cube_r418", CubeListBuilder.create().texOffs(74, 47).mirror().addBox(-0.2496F, 2.5217F, -1.7249F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.349F)).mirror(false), PartPose.offsetAndRotation(-2.1F, -0.8878F, -1.3285F, -1.5462F, -0.3903F, 0.1404F));

		PartDefinition cube_r419 = jaw.addOrReplaceChild("cube_r419", CubeListBuilder.create().texOffs(64, 53).mirror().addBox(-0.2496F, -0.2069F, -3.6233F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.352F)).mirror(false), PartPose.offsetAndRotation(-2.1F, -0.8878F, -1.3285F, -0.4118F, -0.3903F, 0.1404F));

		PartDefinition cube_r420 = jaw.addOrReplaceChild("cube_r420", CubeListBuilder.create().texOffs(75, 15).mirror().addBox(-0.2496F, -0.4767F, -3.0675F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.355F)).mirror(false), PartPose.offsetAndRotation(-2.1F, -0.8878F, -1.3285F, -0.3245F, -0.3903F, 0.1404F));

		PartDefinition cube_r421 = jaw.addOrReplaceChild("cube_r421", CubeListBuilder.create().texOffs(53, 14).mirror().addBox(-0.286F, 0.02F, -2.7045F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.296F)).mirror(false), PartPose.offsetAndRotation(-2.1F, -0.8878F, -1.3285F, -0.5078F, -0.3903F, 0.1404F));

		PartDefinition cube_r422 = jaw.addOrReplaceChild("cube_r422", CubeListBuilder.create().texOffs(75, 71).mirror().addBox(-0.286F, 0.6097F, -2.5953F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.303F)).mirror(false), PartPose.offsetAndRotation(-2.1F, -0.8878F, -1.3285F, -0.63F, -0.3903F, 0.1404F));

		PartDefinition cube_r423 = jaw.addOrReplaceChild("cube_r423", CubeListBuilder.create().texOffs(76, 3).mirror().addBox(-0.5234F, 0.0628F, -3.0969F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.298F)).mirror(false)
				.texOffs(75, 74).mirror().addBox(-0.5234F, 0.1878F, -3.1469F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-2.1F, -0.8878F, -1.3285F, -0.4774F, -0.4839F, 0.1924F));

		PartDefinition cube_r424 = jaw.addOrReplaceChild("cube_r424", CubeListBuilder.create().texOffs(25, 78).mirror().addBox(-0.286F, 0.2525F, -2.4189F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.298F)).mirror(false), PartPose.offsetAndRotation(-2.1F, -0.8878F, -1.3285F, -0.4554F, -0.3903F, 0.1404F));

		PartDefinition cube_r425 = jaw.addOrReplaceChild("cube_r425", CubeListBuilder.create().texOffs(0, 78).mirror().addBox(-0.286F, 0.4071F, -1.9509F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-2.1F, -0.8878F, -1.3285F, -0.5427F, -0.3903F, 0.1404F));

		PartDefinition cube_r426 = jaw.addOrReplaceChild("cube_r426", CubeListBuilder.create().texOffs(75, 77).mirror().addBox(-0.4F, 0.0781F, -2.0492F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.303F)).mirror(false)
				.texOffs(24, 49).mirror().addBox(-0.4F, -0.4479F, -2.0409F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.307F)).mirror(false)
				.texOffs(48, 39).mirror().addBox(-0.4F, -0.2479F, -2.0409F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-2.3F, 0.2122F, -0.0285F, -0.5498F, -0.192F, 0.0F));

		PartDefinition cube_r427 = jaw.addOrReplaceChild("cube_r427", CubeListBuilder.create().texOffs(69, 35).mirror().addBox(-0.4F, -0.0432F, -1.7429F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.29F)).mirror(false), PartPose.offsetAndRotation(-2.3F, 0.2122F, -0.0285F, -0.4625F, -0.192F, 0.0F));

		PartDefinition cube_r428 = jaw.addOrReplaceChild("cube_r428", CubeListBuilder.create().texOffs(69, 32).mirror().addBox(-0.4F, -0.2755F, -1.4537F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.297F)).mirror(false), PartPose.offsetAndRotation(-2.3F, 0.2122F, -0.0285F, -0.2574F, -0.192F, 0.0F));

		PartDefinition cube_r429 = jaw.addOrReplaceChild("cube_r429", CubeListBuilder.create().texOffs(73, 24).mirror().addBox(-0.4F, -0.493F, -1.1342F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.293F)).mirror(false), PartPose.offsetAndRotation(-2.3F, 0.2122F, -0.0285F, 0.0175F, -0.192F, 0.0F));

		PartDefinition cube_r430 = jaw.addOrReplaceChild("cube_r430", CubeListBuilder.create().texOffs(78, 59).mirror().addBox(-0.4F, -0.4441F, -0.7292F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.306F)).mirror(false), PartPose.offsetAndRotation(-2.3F, 0.2122F, -0.0285F, -0.0698F, -0.192F, 0.0F));

		PartDefinition cube_r431 = jaw.addOrReplaceChild("cube_r431", CubeListBuilder.create().texOffs(78, 56).mirror().addBox(-0.4F, -0.4412F, -0.5809F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.299F)).mirror(false), PartPose.offsetAndRotation(-2.3F, 0.2122F, -0.0285F, -0.6283F, -0.192F, 0.0F));

		PartDefinition cube_r432 = jaw.addOrReplaceChild("cube_r432", CubeListBuilder.create().texOffs(45, 35).addBox(-0.695F, -0.2755F, -1.5237F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(1.1F, -0.8878F, -1.3285F, -0.5986F, 0.3558F, -0.1385F));

		PartDefinition cube_r433 = jaw.addOrReplaceChild("cube_r433", CubeListBuilder.create().texOffs(63, 61).addBox(-0.6F, -1.5651F, -1.6729F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(1.3F, 0.2122F, -0.0285F, 0.0873F, 0.192F, 0.0F));

		PartDefinition cube_r434 = jaw.addOrReplaceChild("cube_r434", CubeListBuilder.create().texOffs(74, 53).addBox(-0.6F, -0.5441F, -1.8783F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.303F)), PartPose.offsetAndRotation(1.3F, 0.2122F, -0.0285F, -0.6807F, 0.192F, 0.0F));

		PartDefinition cube_r435 = jaw.addOrReplaceChild("cube_r435", CubeListBuilder.create().texOffs(75, 9).addBox(-0.6F, -0.3949F, -1.5083F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.306F)), PartPose.offsetAndRotation(1.3F, 0.2122F, -0.0285F, -0.8116F, 0.192F, 0.0F));

		PartDefinition cube_r436 = jaw.addOrReplaceChild("cube_r436", CubeListBuilder.create().texOffs(79, 30).addBox(-0.6F, -0.2881F, -1.1328F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.299F)), PartPose.offsetAndRotation(1.3F, 0.2122F, -0.0285F, -0.9425F, 0.192F, 0.0F));

		PartDefinition cube_r437 = jaw.addOrReplaceChild("cube_r437", CubeListBuilder.create().texOffs(15, 79).addBox(-0.6F, -0.5301F, -0.9257F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(1.3F, 0.2122F, -0.0285F, -0.3752F, 0.192F, 0.0F));

		PartDefinition cube_r438 = jaw.addOrReplaceChild("cube_r438", CubeListBuilder.create().texOffs(49, 26).addBox(-0.695F, -0.1052F, -1.6334F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.303F))
				.texOffs(0, 49).addBox(-0.695F, 0.2948F, -1.6334F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.303F)), PartPose.offsetAndRotation(1.1F, -0.8878F, -1.3285F, -0.4502F, 0.3558F, -0.1385F));

		PartDefinition cube_r439 = jaw.addOrReplaceChild("cube_r439", CubeListBuilder.create().texOffs(45, 48).addBox(-0.7927F, -0.4003F, -1.5409F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(1.1F, -0.8878F, -1.3285F, -0.6247F, 0.3558F, -0.1385F));

		PartDefinition cube_r440 = jaw.addOrReplaceChild("cube_r440", CubeListBuilder.create().texOffs(20, 66).addBox(-0.714F, -0.6467F, -1.8858F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.298F))
				.texOffs(75, 6).addBox(-0.7504F, -0.5911F, -3.3453F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.355F)), PartPose.offsetAndRotation(1.1F, -0.8878F, -1.3285F, -0.2809F, 0.3903F, -0.1404F));

		PartDefinition cube_r441 = jaw.addOrReplaceChild("cube_r441", CubeListBuilder.create().texOffs(75, 41).addBox(-0.714F, -1.1258F, -2.5207F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(1.1F, -0.8878F, -1.3285F, -0.0191F, 0.3903F, -0.1404F));

		PartDefinition cube_r442 = jaw.addOrReplaceChild("cube_r442", CubeListBuilder.create().texOffs(76, 62).addBox(-0.714F, -0.794F, -2.2529F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.303F)), PartPose.offsetAndRotation(1.1F, -0.8878F, -1.3285F, -0.1936F, 0.3903F, -0.1404F));

		PartDefinition cube_r443 = jaw.addOrReplaceChild("cube_r443", CubeListBuilder.create().texOffs(74, 50).addBox(-0.7504F, 1.6208F, -2.5964F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.349F)), PartPose.offsetAndRotation(1.1F, -0.8878F, -1.3285F, -1.0226F, 0.3903F, -0.1404F));

		PartDefinition cube_r444 = jaw.addOrReplaceChild("cube_r444", CubeListBuilder.create().texOffs(73, 27).addBox(-0.7504F, 2.0562F, -2.3538F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F)), PartPose.offsetAndRotation(1.1F, -0.8878F, -1.3285F, -1.2408F, 0.3903F, -0.1404F));

		PartDefinition cube_r445 = jaw.addOrReplaceChild("cube_r445", CubeListBuilder.create().texOffs(74, 47).addBox(-0.7504F, 2.5217F, -1.7249F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.349F)), PartPose.offsetAndRotation(1.1F, -0.8878F, -1.3285F, -1.5462F, 0.3903F, -0.1404F));

		PartDefinition cube_r446 = jaw.addOrReplaceChild("cube_r446", CubeListBuilder.create().texOffs(64, 53).addBox(-0.7504F, -0.2069F, -3.6233F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.352F)), PartPose.offsetAndRotation(1.1F, -0.8878F, -1.3285F, -0.4118F, 0.3903F, -0.1404F));

		PartDefinition cube_r447 = jaw.addOrReplaceChild("cube_r447", CubeListBuilder.create().texOffs(75, 15).addBox(-0.7504F, -0.4767F, -3.0675F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.355F)), PartPose.offsetAndRotation(1.1F, -0.8878F, -1.3285F, -0.3245F, 0.3903F, -0.1404F));

		PartDefinition cube_r448 = jaw.addOrReplaceChild("cube_r448", CubeListBuilder.create().texOffs(53, 14).addBox(-0.714F, 0.02F, -2.7045F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.296F)), PartPose.offsetAndRotation(1.1F, -0.8878F, -1.3285F, -0.5078F, 0.3903F, -0.1404F));

		PartDefinition cube_r449 = jaw.addOrReplaceChild("cube_r449", CubeListBuilder.create().texOffs(75, 71).addBox(-0.714F, 0.6097F, -2.5953F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.303F)), PartPose.offsetAndRotation(1.1F, -0.8878F, -1.3285F, -0.63F, 0.3903F, -0.1404F));

		PartDefinition cube_r450 = jaw.addOrReplaceChild("cube_r450", CubeListBuilder.create().texOffs(76, 3).addBox(-0.4766F, 0.0628F, -3.0969F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.298F))
				.texOffs(75, 74).addBox(-0.4766F, 0.1878F, -3.1469F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(1.1F, -0.8878F, -1.3285F, -0.4774F, 0.4839F, -0.1924F));

		PartDefinition cube_r451 = jaw.addOrReplaceChild("cube_r451", CubeListBuilder.create().texOffs(25, 78).addBox(-0.714F, 0.2525F, -2.4189F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.298F)), PartPose.offsetAndRotation(1.1F, -0.8878F, -1.3285F, -0.4554F, 0.3903F, -0.1404F));

		PartDefinition cube_r452 = jaw.addOrReplaceChild("cube_r452", CubeListBuilder.create().texOffs(0, 78).addBox(-0.714F, 0.4071F, -1.9509F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(1.1F, -0.8878F, -1.3285F, -0.5427F, 0.3903F, -0.1404F));

		PartDefinition cube_r453 = jaw.addOrReplaceChild("cube_r453", CubeListBuilder.create().texOffs(75, 77).addBox(-0.6F, 0.0781F, -2.0492F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.303F))
				.texOffs(24, 49).addBox(-0.6F, -0.4479F, -2.0409F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.307F))
				.texOffs(48, 39).addBox(-0.6F, -0.2479F, -2.0409F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(1.3F, 0.2122F, -0.0285F, -0.5498F, 0.192F, 0.0F));

		PartDefinition cube_r454 = jaw.addOrReplaceChild("cube_r454", CubeListBuilder.create().texOffs(69, 35).addBox(-0.6F, -0.0432F, -1.7429F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.29F)), PartPose.offsetAndRotation(1.3F, 0.2122F, -0.0285F, -0.4625F, 0.192F, 0.0F));

		PartDefinition cube_r455 = jaw.addOrReplaceChild("cube_r455", CubeListBuilder.create().texOffs(69, 32).addBox(-0.6F, -0.2755F, -1.4537F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.297F)), PartPose.offsetAndRotation(1.3F, 0.2122F, -0.0285F, -0.2574F, 0.192F, 0.0F));

		PartDefinition cube_r456 = jaw.addOrReplaceChild("cube_r456", CubeListBuilder.create().texOffs(73, 24).addBox(-0.6F, -0.493F, -1.1342F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.293F)), PartPose.offsetAndRotation(1.3F, 0.2122F, -0.0285F, 0.0175F, 0.192F, 0.0F));

		PartDefinition cube_r457 = jaw.addOrReplaceChild("cube_r457", CubeListBuilder.create().texOffs(78, 59).addBox(-0.6F, -0.4441F, -0.7292F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.306F)), PartPose.offsetAndRotation(1.3F, 0.2122F, -0.0285F, -0.0698F, 0.192F, 0.0F));

		PartDefinition cube_r458 = jaw.addOrReplaceChild("cube_r458", CubeListBuilder.create().texOffs(78, 56).addBox(-0.6F, -0.4412F, -0.5809F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.299F)), PartPose.offsetAndRotation(1.3F, 0.2122F, -0.0285F, -0.6283F, 0.192F, 0.0F));

		PartDefinition leftleg = hips.addOrReplaceChild("leftleg", CubeListBuilder.create(), PartPose.offsetAndRotation(3.5F, -0.0005F, 1.1644F, 0.2443F, 0.0F, 0.0F));

		PartDefinition cube_r459 = leftleg.addOrReplaceChild("cube_r459", CubeListBuilder.create().texOffs(70, 41).addBox(0.5F, -1.028F, -0.0471F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(-0.9F, 4.0671F, -1.9253F, 0.2182F, 0.0F, 0.0F));

		PartDefinition cube_r460 = leftleg.addOrReplaceChild("cube_r460", CubeListBuilder.create().texOffs(52, 52).addBox(1.0F, -3.7F, 0.0F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(-1.4F, 2.7747F, -1.8925F, -0.4363F, 0.0F, 0.0F));

		PartDefinition leftleg2 = leftleg.addOrReplaceChild("leftleg2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.1F, 4.3439F, -2.0633F, 0.0436F, 0.0F, 0.0F));

		PartDefinition cube_r461 = leftleg2.addOrReplaceChild("cube_r461", CubeListBuilder.create().texOffs(0, 42).addBox(-0.5F, -3.0F, -0.3F, 1.0F, 5.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.6F, 2.5307F, 1.8473F, 0.4363F, 0.0F, 0.0F));

		PartDefinition cube_r462 = leftleg2.addOrReplaceChild("cube_r462", CubeListBuilder.create().texOffs(53, 18).addBox(-0.5F, -0.5F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.6F, 0.4388F, 0.8705F, 0.2182F, 0.0F, 0.0F));

		PartDefinition cube_r463 = leftleg2.addOrReplaceChild("cube_r463", CubeListBuilder.create().texOffs(0, 53).addBox(-0.601F, -1.5F, -0.5F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.499F, 2.0977F, 1.5973F, 0.5236F, 0.0F, 0.0F));

		PartDefinition leftleg3 = leftleg2.addOrReplaceChild("leftleg3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 4.3397F, 2.5677F, 0.1309F, 0.0F, 0.0F));

		PartDefinition cube_r464 = leftleg3.addOrReplaceChild("cube_r464", CubeListBuilder.create().texOffs(53, 43).addBox(-0.602F, -0.5F, 0.0F, 2.0F, 2.0F, 1.0F, new CubeDeformation(-0.002F)), PartPose.offsetAndRotation(-0.499F, 0.2307F, -0.7197F, -0.3491F, 0.0F, 0.0F));

		PartDefinition leftfoot = leftleg3.addOrReplaceChild("leftfoot", CubeListBuilder.create().texOffs(13, 22).addBox(-1.499F, -0.5693F, -2.2197F, 3.0F, 1.0F, 3.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.0F, 1.6F, -1.2F, -0.3491F, 0.0F, 0.0F));

		PartDefinition rightleg = hips.addOrReplaceChild("rightleg", CubeListBuilder.create(), PartPose.offsetAndRotation(-3.5F, -0.0005F, 1.1644F, -0.2356F, 0.0F, 0.0F));

		PartDefinition cube_r465 = rightleg.addOrReplaceChild("cube_r465", CubeListBuilder.create().texOffs(70, 41).mirror().addBox(-1.5F, -1.028F, -0.0471F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.001F)).mirror(false), PartPose.offsetAndRotation(0.9F, 4.0671F, -1.9253F, 0.2182F, 0.0F, 0.0F));

		PartDefinition cube_r466 = rightleg.addOrReplaceChild("cube_r466", CubeListBuilder.create().texOffs(52, 52).mirror().addBox(-2.0F, -3.7F, 0.0F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.001F)).mirror(false), PartPose.offsetAndRotation(1.4F, 2.7747F, -1.8925F, -0.4363F, 0.0F, 0.0F));

		PartDefinition rightleg2 = rightleg.addOrReplaceChild("rightleg2", CubeListBuilder.create(), PartPose.offset(-0.1F, 4.3439F, -2.0633F));

		PartDefinition cube_r467 = rightleg2.addOrReplaceChild("cube_r467", CubeListBuilder.create().texOffs(0, 42).mirror().addBox(-0.5F, -3.0F, -0.3F, 1.0F, 5.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.6F, 2.5307F, 1.8473F, 0.4363F, 0.0F, 0.0F));

		PartDefinition cube_r468 = rightleg2.addOrReplaceChild("cube_r468", CubeListBuilder.create().texOffs(53, 18).mirror().addBox(-0.5F, -0.5F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.6F, 0.4388F, 0.8705F, 0.2182F, 0.0F, 0.0F));

		PartDefinition cube_r469 = rightleg2.addOrReplaceChild("cube_r469", CubeListBuilder.create().texOffs(0, 53).mirror().addBox(-0.399F, -1.5F, -0.5F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.499F, 2.0977F, 1.5973F, 0.5236F, 0.0F, 0.0F));

		PartDefinition rightleg3 = rightleg2.addOrReplaceChild("rightleg3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 4.3397F, 2.5677F, 0.5672F, 0.0F, 0.0F));

		PartDefinition cube_r470 = rightleg3.addOrReplaceChild("cube_r470", CubeListBuilder.create().texOffs(53, 43).mirror().addBox(-1.398F, -0.5F, 0.0F, 2.0F, 2.0F, 1.0F, new CubeDeformation(-0.002F)).mirror(false), PartPose.offsetAndRotation(0.499F, 0.2307F, -0.7197F, -0.3491F, 0.0F, 0.0F));

		PartDefinition rightfoot = rightleg3.addOrReplaceChild("rightfoot", CubeListBuilder.create().texOffs(13, 22).mirror().addBox(-1.501F, -0.5693F, -2.2197F, 3.0F, 1.0F, 3.0F, new CubeDeformation(0.001F)).mirror(false), PartPose.offsetAndRotation(0.0F, 1.6F, -1.2F, -0.2182F, 0.0F, 0.0F));

		return LayerDefinition.create(meshdefinition, 84, 84);
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