package fossils.fossils.client.blockentity.model.megaraptor;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.SkullModelBase;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;

@SuppressWarnings("unused")
public class MegaraptorFossilModel extends SkullModelBase {
	private final ModelPart fossil;
	private final ModelPart hips;
	private final ModelPart bone;
	private final ModelPart bone5;
	private final ModelPart Leftleg1;
	private final ModelPart Leftleg2;
	private final ModelPart Leftleg3;
	private final ModelPart Leftleg4;
	private final ModelPart Leftleg5;
	private final ModelPart Rightleg1;
	private final ModelPart Rightleg2;
	private final ModelPart Rightleg3;
	private final ModelPart Rightleg4;
	private final ModelPart Rightleg5;
	private final ModelPart body;
	private final ModelPart bone2;
	private final ModelPart bone3;
	private final ModelPart chest;
	private final ModelPart neck4;
	private final ModelPart neck3;
	private final ModelPart neck2;
	private final ModelPart neck;
	private final ModelPart head;
	private final ModelPart leftFace;
	private final ModelPart rightFace;
	private final ModelPart jaw;
	private final ModelPart Leftarm1;
	private final ModelPart Leftarm2;
	private final ModelPart Leftarm3;
	private final ModelPart Leftarm4;
	private final ModelPart Rightarm1;
	private final ModelPart Rightarm2;
	private final ModelPart Rightarm3;
	private final ModelPart Rightarm4;
	private final ModelPart bone4;
	private final ModelPart bone6;
	private final ModelPart tail;
	private final ModelPart tail2;
	private final ModelPart tail3;
	private final ModelPart tail4;
	private final ModelPart tail5;
	private final ModelPart tail6;
	private final ModelPart tail7;
	private final ModelPart tail8;

	public MegaraptorFossilModel(ModelPart root) {
		this.fossil = root.getChild("fossil");
		this.hips = this.fossil.getChild("hips");
		this.bone = this.hips.getChild("bone");
		this.bone5 = this.hips.getChild("bone5");
		this.Leftleg1 = this.hips.getChild("Leftleg1");
		this.Leftleg2 = this.Leftleg1.getChild("Leftleg2");
		this.Leftleg3 = this.Leftleg2.getChild("Leftleg3");
		this.Leftleg4 = this.Leftleg3.getChild("Leftleg4");
		this.Leftleg5 = this.Leftleg4.getChild("Leftleg5");
		this.Rightleg1 = this.hips.getChild("Rightleg1");
		this.Rightleg2 = this.Rightleg1.getChild("Rightleg2");
		this.Rightleg3 = this.Rightleg2.getChild("Rightleg3");
		this.Rightleg4 = this.Rightleg3.getChild("Rightleg4");
		this.Rightleg5 = this.Rightleg4.getChild("Rightleg5");
		this.body = this.hips.getChild("body");
		this.bone2 = this.body.getChild("bone2");
		this.bone3 = this.bone2.getChild("bone3");
		this.chest = this.bone3.getChild("chest");
		this.neck4 = this.chest.getChild("neck4");
		this.neck3 = this.neck4.getChild("neck3");
		this.neck2 = this.neck3.getChild("neck2");
		this.neck = this.neck2.getChild("neck");
		this.head = this.neck.getChild("head");
		this.leftFace = this.head.getChild("leftFace");
		this.rightFace = this.head.getChild("rightFace");
		this.jaw = this.head.getChild("jaw");
		this.Leftarm1 = this.chest.getChild("Leftarm1");
		this.Leftarm2 = this.Leftarm1.getChild("Leftarm2");
		this.Leftarm3 = this.Leftarm2.getChild("Leftarm3");
		this.Leftarm4 = this.Leftarm3.getChild("Leftarm4");
		this.Rightarm1 = this.chest.getChild("Rightarm1");
		this.Rightarm2 = this.Rightarm1.getChild("Rightarm2");
		this.Rightarm3 = this.Rightarm2.getChild("Rightarm3");
		this.Rightarm4 = this.Rightarm3.getChild("Rightarm4");
		this.bone4 = this.chest.getChild("bone4");
		this.bone6 = this.chest.getChild("bone6");
		this.tail = this.hips.getChild("tail");
		this.tail2 = this.tail.getChild("tail2");
		this.tail3 = this.tail2.getChild("tail3");
		this.tail4 = this.tail3.getChild("tail4");
		this.tail5 = this.tail4.getChild("tail5");
		this.tail6 = this.tail5.getChild("tail6");
		this.tail7 = this.tail6.getChild("tail7");
		this.tail8 = this.tail7.getChild("tail8");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition fossil = partdefinition.addOrReplaceChild("fossil", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition hips = fossil.addOrReplaceChild("hips", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -32.7282F, 0.4995F, -0.0436F, 0.0F, 0.0F));

		PartDefinition cube_r1 = hips.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(75, 89).addBox(0.01F, -5.5738F, -2.0004F, 0.0F, 6.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.8F, -1.1F, 0.0698F, 0.0F, 0.0F));

		PartDefinition cube_r2 = hips.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(0, 51).addBox(0.0F, -0.0977F, -0.1132F, 0.0F, 6.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -6.2F, -1.4F, -0.1396F, 0.0F, 0.0F));

		PartDefinition cube_r3 = hips.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(27, 23).addBox(-1.0F, -0.1F, -0.1F, 2.0F, 2.0F, 9.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.0F, -0.9F, -4.2F, -0.0524F, 0.0F, 0.0F));

		PartDefinition bone = hips.addOrReplaceChild("bone", CubeListBuilder.create(), PartPose.offsetAndRotation(0.7113F, 2.5637F, 0.88F, 0.0F, 0.0F, -0.1745F));

		PartDefinition cube_r4 = bone.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(47, 53).addBox(0.0042F, -3.7082F, -4.3333F, 1.0F, 3.0F, 6.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.1045F, -0.0525F, 0.1359F));

		PartDefinition cube_r5 = bone.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(52, 77).addBox(-0.4158F, 0.9122F, 0.1876F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.7883F, -1.2399F, -2.4796F, 0.1282F, -0.0436F, 0.0611F));

		PartDefinition cube_r6 = bone.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(92, 96).addBox(-0.4158F, 2.5995F, 1.2028F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(0.7883F, -1.2399F, -2.4796F, 0.4337F, -0.0436F, 0.0611F));

		PartDefinition cube_r7 = bone.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(0, 113).addBox(-0.7051F, 0.2771F, 1.3872F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F))
				.texOffs(41, 105).addBox(-0.7051F, 0.6771F, 1.5872F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.5883F, 1.9601F, 1.3204F, -0.5644F, -0.0554F, 0.3742F));

		PartDefinition cube_r8 = bone.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(100, 21).addBox(-0.7051F, 0.5291F, -0.5792F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.5883F, 1.9601F, 1.3204F, -0.0844F, -0.0554F, 0.3742F));

		PartDefinition cube_r9 = bone.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(41, 95).addBox(-0.7051F, -0.0671F, -0.8954F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.15F))
				.texOffs(48, 105).addBox(-0.7051F, 0.9329F, 0.1046F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.5883F, 1.9601F, 1.3204F, 0.5264F, -0.0554F, 0.3742F));

		PartDefinition cube_r10 = bone.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(87, 94).addBox(-0.7051F, 1.7972F, -1.2214F, 1.0F, 6.0F, 1.0F, new CubeDeformation(-0.151F)), PartPose.offsetAndRotation(0.5883F, 1.9601F, 1.3204F, 0.893F, -0.0554F, 0.3742F));

		PartDefinition cube_r11 = bone.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(0, 64).addBox(-0.3381F, -0.7936F, -2.0788F, 1.0F, 5.0F, 4.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.7883F, -1.2399F, -2.4796F, 0.3008F, -0.0672F, 0.0696F));

		PartDefinition cube_r12 = bone.addOrReplaceChild("cube_r12", CubeListBuilder.create().texOffs(101, 64).addBox(-0.7087F, -0.0195F, -0.6508F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.7883F, 3.0601F, -2.4796F, -0.3092F, -0.1377F, 0.4366F));

		PartDefinition cube_r13 = bone.addOrReplaceChild("cube_r13", CubeListBuilder.create().texOffs(105, 43).addBox(-0.7087F, 3.7645F, -1.3246F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.7883F, 3.0601F, -2.4796F, -0.1346F, -0.1377F, 0.4366F));

		PartDefinition cube_r14 = bone.addOrReplaceChild("cube_r14", CubeListBuilder.create().texOffs(12, 109).addBox(-1.5778F, 5.0323F, 5.2479F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(0.7883F, 3.0601F, -2.4796F, -1.2631F, -0.0436F, 0.2706F));

		PartDefinition cube_r15 = bone.addOrReplaceChild("cube_r15", CubeListBuilder.create().texOffs(99, 105).addBox(-1.5778F, 4.1439F, 3.2737F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(0.7883F, 3.0601F, -2.4796F, -0.9576F, -0.0436F, 0.2706F));

		PartDefinition cube_r16 = bone.addOrReplaceChild("cube_r16", CubeListBuilder.create().texOffs(12, 103).addBox(-1.5778F, -2.619F, 5.6224F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.7883F, 3.0601F, -2.4796F, -1.6558F, -0.0436F, 0.2706F));

		PartDefinition cube_r17 = bone.addOrReplaceChild("cube_r17", CubeListBuilder.create().texOffs(79, 109).addBox(-1.5778F, -0.7052F, 6.1863F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.7883F, 3.0601F, -2.4796F, -1.2282F, -0.0436F, 0.2706F));

		PartDefinition cube_r18 = bone.addOrReplaceChild("cube_r18", CubeListBuilder.create().texOffs(13, 113).addBox(-1.5778F, 3.6215F, 7.0781F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.7883F, 3.0601F, -2.4796F, -1.5772F, -0.0436F, 0.2706F));

		PartDefinition cube_r19 = bone.addOrReplaceChild("cube_r19", CubeListBuilder.create().texOffs(106, 93).addBox(-1.5778F, 1.496F, 5.7155F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.003F))
				.texOffs(100, 26).addBox(-1.5778F, -0.004F, 6.3155F, 1.0F, 5.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.7883F, 3.0601F, -2.4796F, -1.4027F, -0.0436F, 0.2706F));

		PartDefinition cube_r20 = bone.addOrReplaceChild("cube_r20", CubeListBuilder.create().texOffs(41, 100).addBox(-0.5F, 0.15F, -1.25F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(1.7127F, -5.8299F, -6.1739F, 0.6981F, -0.1309F, 0.0F));

		PartDefinition cube_r21 = bone.addOrReplaceChild("cube_r21", CubeListBuilder.create().texOffs(98, 89).addBox(-0.5F, -1.125F, -0.175F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.6736F, -3.1049F, -5.8765F, 1.5708F, -0.1309F, 0.0F));

		PartDefinition cube_r22 = bone.addOrReplaceChild("cube_r22", CubeListBuilder.create().texOffs(71, 10).addBox(0.3689F, -6.6793F, -5.2315F, 1.0F, 3.0F, 4.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0698F, -0.1309F, 0.0F));

		PartDefinition cube_r23 = bone.addOrReplaceChild("cube_r23", CubeListBuilder.create().texOffs(73, 70).addBox(0.3689F, -6.6052F, -2.3115F, 1.0F, 2.0F, 4.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.3F, 1.8F, -2.1F, 0.4712F, -0.1309F, 0.0F));

		PartDefinition cube_r24 = bone.addOrReplaceChild("cube_r24", CubeListBuilder.create().texOffs(32, 62).addBox(-0.5F, -0.1F, -5.9F, 1.0F, 2.0F, 6.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.9799F, -5.4111F, 4.2482F, -0.192F, -0.0175F, 0.0F));

		PartDefinition cube_r25 = bone.addOrReplaceChild("cube_r25", CubeListBuilder.create().texOffs(84, 30).addBox(-0.5F, -2.0F, -2.8F, 1.0F, 3.0F, 3.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.9799F, -3.0776F, 3.5081F, 0.3927F, 0.0F, 0.0F));

		PartDefinition cube_r26 = bone.addOrReplaceChild("cube_r26", CubeListBuilder.create().texOffs(47, 63).addBox(-0.5F, -0.5F, -3.7F, 1.0F, 2.0F, 5.0F, new CubeDeformation(-0.008F)), PartPose.offsetAndRotation(0.9799F, -3.4167F, 4.7631F, -0.1309F, 0.0F, 0.0F));

		PartDefinition cube_r27 = bone.addOrReplaceChild("cube_r27", CubeListBuilder.create().texOffs(0, 87).addBox(-0.5F, -1.3F, -1.0F, 1.0F, 2.0F, 3.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.9799F, -3.854F, 4.4489F, -0.5672F, 0.0F, 0.0F));

		PartDefinition cube_r28 = bone.addOrReplaceChild("cube_r28", CubeListBuilder.create().texOffs(62, 53).addBox(-0.5F, 0.3579F, -6.3673F, 1.0F, 2.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.9799F, -5.4111F, 4.2482F, -0.1047F, -0.0175F, 0.0F));

		PartDefinition bone5 = hips.addOrReplaceChild("bone5", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.7113F, 2.5637F, 0.88F, 0.0F, 0.0F, 0.1745F));

		PartDefinition cube_r29 = bone5.addOrReplaceChild("cube_r29", CubeListBuilder.create().texOffs(47, 53).mirror().addBox(-1.0042F, -3.7082F, -4.3333F, 1.0F, 3.0F, 6.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.1045F, 0.0525F, -0.1359F));

		PartDefinition cube_r30 = bone5.addOrReplaceChild("cube_r30", CubeListBuilder.create().texOffs(52, 77).mirror().addBox(-0.5842F, 0.9122F, 0.1876F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.7883F, -1.2399F, -2.4796F, 0.1282F, 0.0436F, -0.0611F));

		PartDefinition cube_r31 = bone5.addOrReplaceChild("cube_r31", CubeListBuilder.create().texOffs(92, 96).mirror().addBox(-0.5842F, 2.5995F, 1.2028F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(-0.7883F, -1.2399F, -2.4796F, 0.4337F, 0.0436F, -0.0611F));

		PartDefinition cube_r32 = bone5.addOrReplaceChild("cube_r32", CubeListBuilder.create().texOffs(0, 113).mirror().addBox(-0.2949F, 0.2771F, 1.3872F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false)
				.texOffs(41, 105).mirror().addBox(-0.2949F, 0.6771F, 1.5872F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(-0.5883F, 1.9601F, 1.3204F, -0.5644F, 0.0554F, -0.3742F));

		PartDefinition cube_r33 = bone5.addOrReplaceChild("cube_r33", CubeListBuilder.create().texOffs(100, 21).mirror().addBox(-0.2949F, 0.5291F, -0.5792F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(-0.5883F, 1.9601F, 1.3204F, -0.0844F, 0.0554F, -0.3742F));

		PartDefinition cube_r34 = bone5.addOrReplaceChild("cube_r34", CubeListBuilder.create().texOffs(41, 95).mirror().addBox(-0.2949F, -0.0671F, -0.8954F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.15F)).mirror(false)
				.texOffs(48, 105).mirror().addBox(-0.2949F, 0.9329F, 0.1046F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(-0.5883F, 1.9601F, 1.3204F, 0.5264F, 0.0554F, -0.3742F));

		PartDefinition cube_r35 = bone5.addOrReplaceChild("cube_r35", CubeListBuilder.create().texOffs(87, 94).mirror().addBox(-0.2949F, 1.7972F, -1.2214F, 1.0F, 6.0F, 1.0F, new CubeDeformation(-0.151F)).mirror(false), PartPose.offsetAndRotation(-0.5883F, 1.9601F, 1.3204F, 0.893F, 0.0554F, -0.3742F));

		PartDefinition cube_r36 = bone5.addOrReplaceChild("cube_r36", CubeListBuilder.create().texOffs(0, 64).mirror().addBox(-0.6619F, -0.7936F, -2.0788F, 1.0F, 5.0F, 4.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(-0.7883F, -1.2399F, -2.4796F, 0.3008F, 0.0672F, -0.0696F));

		PartDefinition cube_r37 = bone5.addOrReplaceChild("cube_r37", CubeListBuilder.create().texOffs(101, 64).mirror().addBox(-0.2913F, -0.0195F, -0.6508F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.7883F, 3.0601F, -2.4796F, -0.3092F, 0.1377F, -0.4366F));

		PartDefinition cube_r38 = bone5.addOrReplaceChild("cube_r38", CubeListBuilder.create().texOffs(105, 43).mirror().addBox(-0.2913F, 3.7645F, -1.3246F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.7883F, 3.0601F, -2.4796F, -0.1346F, 0.1377F, -0.4366F));

		PartDefinition cube_r39 = bone5.addOrReplaceChild("cube_r39", CubeListBuilder.create().texOffs(12, 109).mirror().addBox(0.5778F, 5.0323F, 5.2479F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(-0.7883F, 3.0601F, -2.4796F, -1.2631F, 0.0436F, -0.2706F));

		PartDefinition cube_r40 = bone5.addOrReplaceChild("cube_r40", CubeListBuilder.create().texOffs(99, 105).mirror().addBox(0.5778F, 4.1439F, 3.2737F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(-0.7883F, 3.0601F, -2.4796F, -0.9576F, 0.0436F, -0.2706F));

		PartDefinition cube_r41 = bone5.addOrReplaceChild("cube_r41", CubeListBuilder.create().texOffs(12, 103).mirror().addBox(0.5778F, -2.619F, 5.6224F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-0.7883F, 3.0601F, -2.4796F, -1.6558F, 0.0436F, -0.2706F));

		PartDefinition cube_r42 = bone5.addOrReplaceChild("cube_r42", CubeListBuilder.create().texOffs(79, 109).mirror().addBox(0.5778F, -0.7052F, 6.1863F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(-0.7883F, 3.0601F, -2.4796F, -1.2282F, 0.0436F, -0.2706F));

		PartDefinition cube_r43 = bone5.addOrReplaceChild("cube_r43", CubeListBuilder.create().texOffs(13, 113).mirror().addBox(0.5778F, 3.6215F, 7.0781F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(-0.7883F, 3.0601F, -2.4796F, -1.5772F, 0.0436F, -0.2706F));

		PartDefinition cube_r44 = bone5.addOrReplaceChild("cube_r44", CubeListBuilder.create().texOffs(106, 93).mirror().addBox(0.5778F, 1.496F, 5.7155F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.003F)).mirror(false)
				.texOffs(100, 26).mirror().addBox(0.5778F, -0.004F, 6.3155F, 1.0F, 5.0F, 1.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(-0.7883F, 3.0601F, -2.4796F, -1.4027F, 0.0436F, -0.2706F));

		PartDefinition cube_r45 = bone5.addOrReplaceChild("cube_r45", CubeListBuilder.create().texOffs(41, 100).mirror().addBox(-0.5F, 0.15F, -1.25F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.007F)).mirror(false), PartPose.offsetAndRotation(-1.7127F, -5.8299F, -6.1739F, 0.6981F, 0.1309F, 0.0F));

		PartDefinition cube_r46 = bone5.addOrReplaceChild("cube_r46", CubeListBuilder.create().texOffs(98, 89).mirror().addBox(-0.5F, -1.125F, -0.175F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.6736F, -3.1049F, -5.8765F, 1.5708F, 0.1309F, 0.0F));

		PartDefinition cube_r47 = bone5.addOrReplaceChild("cube_r47", CubeListBuilder.create().texOffs(71, 10).mirror().addBox(-1.3689F, -6.6793F, -5.2315F, 1.0F, 3.0F, 4.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0698F, 0.1309F, 0.0F));

		PartDefinition cube_r48 = bone5.addOrReplaceChild("cube_r48", CubeListBuilder.create().texOffs(73, 70).mirror().addBox(-1.3689F, -6.6052F, -2.3115F, 1.0F, 2.0F, 4.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(-0.3F, 1.8F, -2.1F, 0.4712F, 0.1309F, 0.0F));

		PartDefinition cube_r49 = bone5.addOrReplaceChild("cube_r49", CubeListBuilder.create().texOffs(32, 62).mirror().addBox(-0.5F, -0.1F, -5.9F, 1.0F, 2.0F, 6.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(-0.9799F, -5.4111F, 4.2482F, -0.192F, 0.0175F, 0.0F));

		PartDefinition cube_r50 = bone5.addOrReplaceChild("cube_r50", CubeListBuilder.create().texOffs(84, 30).mirror().addBox(-0.5F, -2.0F, -2.8F, 1.0F, 3.0F, 3.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(-0.9799F, -3.0776F, 3.5081F, 0.3927F, 0.0F, 0.0F));

		PartDefinition cube_r51 = bone5.addOrReplaceChild("cube_r51", CubeListBuilder.create().texOffs(47, 63).mirror().addBox(-0.5F, -0.5F, -3.7F, 1.0F, 2.0F, 5.0F, new CubeDeformation(-0.008F)).mirror(false), PartPose.offsetAndRotation(-0.9799F, -3.4167F, 4.7631F, -0.1309F, 0.0F, 0.0F));

		PartDefinition cube_r52 = bone5.addOrReplaceChild("cube_r52", CubeListBuilder.create().texOffs(0, 87).mirror().addBox(-0.5F, -1.3F, -1.0F, 1.0F, 2.0F, 3.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(-0.9799F, -3.854F, 4.4489F, -0.5672F, 0.0F, 0.0F));

		PartDefinition cube_r53 = bone5.addOrReplaceChild("cube_r53", CubeListBuilder.create().texOffs(62, 53).mirror().addBox(-0.5F, 0.3579F, -6.3673F, 1.0F, 2.0F, 6.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.9799F, -5.4111F, 4.2482F, -0.1047F, 0.0175F, 0.0F));

		PartDefinition Leftleg1 = hips.addOrReplaceChild("Leftleg1", CubeListBuilder.create().texOffs(66, 89).addBox(-1.4F, -0.8224F, -0.9899F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.4F, 1.8423F, -0.0847F, -0.5236F, 0.0F, 0.0F));

		PartDefinition Leftthigh_r1 = Leftleg1.addOrReplaceChild("Leftthigh_r1", CubeListBuilder.create().texOffs(98, 39).addBox(-1.0F, -2.6F, -0.3F, 2.0F, 3.0F, 1.0F, new CubeDeformation(-0.006F))
				.texOffs(97, 59).addBox(-1.0F, -2.6F, -0.8F, 2.0F, 3.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-0.4F, 4.9067F, -0.3971F, -0.192F, 0.0F, 0.0F));

		PartDefinition Leftthigh_r2 = Leftleg1.addOrReplaceChild("Leftthigh_r2", CubeListBuilder.create().texOffs(17, 97).addBox(-1.0F, 1.0511F, -0.9059F, 2.0F, 3.0F, 1.0F, new CubeDeformation(0.013F)), PartPose.offsetAndRotation(-0.4F, -0.8282F, 1.016F, -0.1047F, 0.0F, 0.0F));

		PartDefinition Leftthigh_r3 = Leftleg1.addOrReplaceChild("Leftthigh_r3", CubeListBuilder.create().texOffs(101, 83).addBox(-1.0F, 0.0197F, -0.1064F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(-0.4F, 1.1579F, -0.8835F, 0.2443F, 0.0F, 0.0F));

		PartDefinition Leftthigh_r4 = Leftleg1.addOrReplaceChild("Leftthigh_r4", CubeListBuilder.create().texOffs(89, 44).addBox(-1.0F, -0.9883F, -0.0359F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-0.4F, 11.7579F, -0.3835F, 0.4363F, 0.0F, 0.0F));

		PartDefinition Leftthigh_r5 = Leftleg1.addOrReplaceChild("Leftthigh_r5", CubeListBuilder.create().texOffs(94, 77).addBox(-1.0F, -0.9438F, 0.3015F, 2.0F, 4.0F, 1.0F, new CubeDeformation(0.003F))
				.texOffs(93, 27).addBox(-1.0F, -0.9438F, -0.1985F, 2.0F, 4.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(-0.4F, 7.7579F, -0.9835F, 0.1396F, 0.0F, 0.0F));

		PartDefinition Leftthigh_r6 = Leftleg1.addOrReplaceChild("Leftthigh_r6", CubeListBuilder.create().texOffs(105, 26).addBox(-1.0F, -1.8438F, 0.5015F, 2.0F, 2.0F, 1.0F, new CubeDeformation(-0.003F))
				.texOffs(105, 15).addBox(-1.0F, -1.8438F, 0.0015F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-0.4F, 6.8945F, -1.3068F, -0.0349F, 0.0F, 0.0F));

		PartDefinition Leftleg2 = Leftleg1.addOrReplaceChild("Leftleg2", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.3F, 12.4868F, 0.6846F, 1.1399F, -0.1191F, 0.0545F));

		PartDefinition Leftshin_r1 = Leftleg2.addOrReplaceChild("Leftshin_r1", CubeListBuilder.create().texOffs(77, 62).addBox(-1.0F, 2.754F, 3.6608F, 2.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.7F, -4.1915F, -3.2512F, -0.3491F, 0.0F, 0.0F));

		PartDefinition Leftshin_r2 = Leftleg2.addOrReplaceChild("Leftshin_r2", CubeListBuilder.create().texOffs(27, 92).addBox(-2.8F, -1.0F, -0.9F, 2.0F, 2.0F, 2.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.1F, 1.0377F, 1.4087F, 0.0087F, 0.0F, 0.0F));

		PartDefinition Leftshin_r3 = Leftleg2.addOrReplaceChild("Leftshin_r3", CubeListBuilder.create().texOffs(42, 71).addBox(0.2F, -6.5F, -0.5F, 1.0F, 12.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.4F, 7.2542F, 0.3432F, -0.1222F, 0.0F, 0.0F));

		PartDefinition Leftshin_r4 = Leftleg2.addOrReplaceChild("Leftshin_r4", CubeListBuilder.create().texOffs(55, 95).addBox(-1.0F, -2.0F, -0.9F, 2.0F, 3.0F, 1.0F, new CubeDeformation(-0.002F)), PartPose.offsetAndRotation(-0.7F, 3.2907F, 0.7773F, 0.2618F, 0.0F, 0.0F));

		PartDefinition Leftshin_r5 = Leftleg2.addOrReplaceChild("Leftshin_r5", CubeListBuilder.create().texOffs(86, 51).addBox(-1.0F, -0.2F, -1.2F, 2.0F, 7.0F, 1.0F, new CubeDeformation(-0.002F)), PartPose.offsetAndRotation(-0.7F, 1.9626F, 2.1762F, -0.1745F, 0.0F, 0.0F));

		PartDefinition Leftshin_r6 = Leftleg2.addOrReplaceChild("Leftshin_r6", CubeListBuilder.create().texOffs(52, 71).addBox(-1.0F, 0.0F, -1.0F, 2.0F, 4.0F, 1.0F, new CubeDeformation(-0.002F)), PartPose.offsetAndRotation(-0.7F, 9.3114F, 0.7525F, -0.2269F, 0.0F, 0.0F));

		PartDefinition Leftshin_r7 = Leftleg2.addOrReplaceChild("Leftshin_r7", CubeListBuilder.create().texOffs(78, 100).addBox(-1.0F, -1.075F, -0.4F, 2.0F, 2.0F, 1.0F, new CubeDeformation(-0.007F)), PartPose.offsetAndRotation(-0.7F, 12.1895F, -0.1172F, 0.0785F, 0.0F, 0.0F));

		PartDefinition Leftshin_r8 = Leftleg2.addOrReplaceChild("Leftshin_r8", CubeListBuilder.create().texOffs(34, 82).addBox(-1.0F, -4.4F, -0.7F, 2.0F, 7.0F, 1.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(-0.7F, 6.6951F, 0.6802F, -0.0873F, 0.0F, 0.0F));

		PartDefinition Leftleg3 = Leftleg2.addOrReplaceChild("Leftleg3", CubeListBuilder.create().texOffs(77, 53).addBox(-1.2F, 0.0504F, -0.4511F, 3.0F, 7.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.4F, 13.0295F, -1.1778F, -0.5672F, 0.0F, 0.0F));

		PartDefinition Leftleg4 = Leftleg3.addOrReplaceChild("Leftleg4", CubeListBuilder.create().texOffs(54, 0).addBox(-3.0F, -0.4127F, -3.3508F, 5.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.9F, 7.4032F, -0.3727F, 0.1734F, 0.0262F, -0.0832F));

		PartDefinition Leftleg5 = Leftleg4.addOrReplaceChild("Leftleg5", CubeListBuilder.create().texOffs(21, 46).addBox(-3.0F, -0.3879F, -4.8236F, 5.0F, 1.0F, 5.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(0.0F, -0.0248F, -3.0271F, -0.2182F, 0.0F, 0.0F));

		PartDefinition Rightleg1 = hips.addOrReplaceChild("Rightleg1", CubeListBuilder.create().texOffs(18, 92).addBox(-0.6F, -0.8224F, -0.9899F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-3.4F, 1.8423F, -0.0847F, -1.0529F, 0.2324F, 0.0332F));

		PartDefinition Rightthigh_r1 = Rightleg1.addOrReplaceChild("Rightthigh_r1", CubeListBuilder.create().texOffs(71, 98).addBox(-1.0F, -2.6F, -0.3F, 2.0F, 3.0F, 1.0F, new CubeDeformation(-0.006F))
				.texOffs(98, 49).addBox(-1.0F, -2.6F, -0.8F, 2.0F, 3.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.4F, 4.9067F, -0.3971F, -0.192F, 0.0F, 0.0F));

		PartDefinition Rightthigh_r2 = Rightleg1.addOrReplaceChild("Rightthigh_r2", CubeListBuilder.create().texOffs(98, 44).addBox(-1.0F, 1.0511F, -0.9059F, 2.0F, 3.0F, 1.0F, new CubeDeformation(0.013F)), PartPose.offsetAndRotation(0.4F, -0.8282F, 1.016F, -0.1047F, 0.0F, 0.0F));

		PartDefinition Rightthigh_r3 = Rightleg1.addOrReplaceChild("Rightthigh_r3", CubeListBuilder.create().texOffs(92, 101).addBox(-1.0F, 0.0197F, -0.1064F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(0.4F, 1.1579F, -0.8835F, 0.2443F, 0.0F, 0.0F));

		PartDefinition Rightthigh_r4 = Rightleg1.addOrReplaceChild("Rightthigh_r4", CubeListBuilder.create().texOffs(91, 22).addBox(-1.0F, -0.9883F, -0.0359F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.4F, 11.7579F, -0.3835F, 0.4363F, 0.0F, 0.0F));

		PartDefinition Rightthigh_r5 = Rightleg1.addOrReplaceChild("Rightthigh_r5", CubeListBuilder.create().texOffs(94, 83).addBox(-1.0F, -0.9438F, 0.3015F, 2.0F, 4.0F, 1.0F, new CubeDeformation(0.003F))
				.texOffs(80, 94).addBox(-1.0F, -0.9438F, -0.1985F, 2.0F, 4.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.4F, 7.7579F, -0.9835F, 0.1396F, 0.0F, 0.0F));

		PartDefinition Rightthigh_r6 = Rightleg1.addOrReplaceChild("Rightthigh_r6", CubeListBuilder.create().texOffs(105, 39).addBox(-1.0F, -1.8438F, 0.5015F, 2.0F, 2.0F, 1.0F, new CubeDeformation(-0.003F))
				.texOffs(105, 30).addBox(-1.0F, -1.8438F, 0.0015F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.4F, 6.8945F, -1.3068F, -0.0349F, 0.0F, 0.0F));

		PartDefinition Rightleg2 = Rightleg1.addOrReplaceChild("Rightleg2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.3F, 12.4868F, 0.6846F, 1.612F, 0.1348F, -0.0811F));

		PartDefinition Rightshin_r1 = Rightleg2.addOrReplaceChild("Rightshin_r1", CubeListBuilder.create().texOffs(72, 77).addBox(-1.0F, 2.754F, 3.6608F, 2.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.7F, -4.1915F, -3.2512F, -0.3491F, 0.0F, 0.0F));

		PartDefinition Rightshin_r2 = Rightleg2.addOrReplaceChild("Rightshin_r2", CubeListBuilder.create().texOffs(92, 65).addBox(0.8F, -1.0F, -0.9F, 2.0F, 2.0F, 2.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-1.1F, 1.0377F, 1.4087F, 0.0087F, 0.0F, 0.0F));

		PartDefinition Rightshin_r3 = Rightleg2.addOrReplaceChild("Rightshin_r3", CubeListBuilder.create().texOffs(47, 71).addBox(-1.2F, -6.5F, -0.5F, 1.0F, 12.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.4F, 7.2542F, 0.3432F, -0.1222F, 0.0F, 0.0F));

		PartDefinition Rightshin_r4 = Rightleg2.addOrReplaceChild("Rightshin_r4", CubeListBuilder.create().texOffs(95, 70).addBox(-1.0F, -2.0F, -0.9F, 2.0F, 3.0F, 1.0F, new CubeDeformation(-0.002F)), PartPose.offsetAndRotation(0.7F, 3.2907F, 0.7773F, 0.2618F, 0.0F, 0.0F));

		PartDefinition Rightshin_r5 = Rightleg2.addOrReplaceChild("Rightshin_r5", CubeListBuilder.create().texOffs(59, 86).addBox(-1.0F, -0.2F, -1.2F, 2.0F, 7.0F, 1.0F, new CubeDeformation(-0.002F)), PartPose.offsetAndRotation(0.7F, 1.9626F, 2.1762F, -0.1745F, 0.0F, 0.0F));

		PartDefinition Rightshin_r6 = Rightleg2.addOrReplaceChild("Rightshin_r6", CubeListBuilder.create().texOffs(0, 93).addBox(-1.0F, 0.0F, -1.0F, 2.0F, 4.0F, 1.0F, new CubeDeformation(-0.002F)), PartPose.offsetAndRotation(0.7F, 9.3114F, 0.7525F, -0.2269F, 0.0F, 0.0F));

		PartDefinition Rightshin_r7 = Rightleg2.addOrReplaceChild("Rightshin_r7", CubeListBuilder.create().texOffs(48, 101).addBox(-1.0F, -1.075F, -0.4F, 2.0F, 2.0F, 1.0F, new CubeDeformation(-0.007F)), PartPose.offsetAndRotation(0.7F, 12.1895F, -0.1172F, 0.0785F, 0.0F, 0.0F));

		PartDefinition Rightshin_r8 = Rightleg2.addOrReplaceChild("Rightshin_r8", CubeListBuilder.create().texOffs(52, 84).addBox(-1.0F, -4.4F, -0.7F, 2.0F, 7.0F, 1.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(0.7F, 6.6951F, 0.6802F, -0.0873F, 0.0F, 0.0F));

		PartDefinition Rightleg3 = Rightleg2.addOrReplaceChild("Rightleg3", CubeListBuilder.create().texOffs(63, 77).addBox(-1.8F, 0.0504F, -0.4511F, 3.0F, 7.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4F, 13.0295F, -1.1778F, -1.2334F, -0.1262F, 0.094F));

		PartDefinition Rightleg4 = Rightleg3.addOrReplaceChild("Rightleg4", CubeListBuilder.create().texOffs(13, 62).addBox(-2.0F, -0.4127F, -3.3508F, 5.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.9F, 7.4032F, -0.3727F, 1.0105F, 0.0934F, 0.1476F));

		PartDefinition Rightleg5 = Rightleg4.addOrReplaceChild("Rightleg5", CubeListBuilder.create().texOffs(50, 11).addBox(-2.0F, -0.3879F, -4.8236F, 5.0F, 1.0F, 5.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(0.0F, -0.0248F, -3.0271F, 0.829F, 0.0F, 0.0F));

		PartDefinition body = hips.addOrReplaceChild("body", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.0F, -4.2F, 0.0349F, 0.0F, 0.0F));

		PartDefinition cube_r54 = body.addOrReplaceChild("cube_r54", CubeListBuilder.create().texOffs(93, 49).addBox(0.0F, -5.1862F, -1.9859F, 0.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.8F, 0.0F, 0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r55 = body.addOrReplaceChild("cube_r55", CubeListBuilder.create().texOffs(36, 91).addBox(0.0F, -4.4368F, -2.0811F, 0.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.1F, -2.9F, 0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r56 = body.addOrReplaceChild("cube_r56", CubeListBuilder.create().texOffs(0, 110).addBox(-0.8F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.6889F, -1.1705F, -0.8187F, -0.0149F, -0.2541F, -0.5897F));

		PartDefinition cube_r57 = body.addOrReplaceChild("cube_r57", CubeListBuilder.create().texOffs(24, 68).mirror().addBox(-2.3F, -0.4F, -0.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, -0.6692F, -4.2898F, 0.0239F, 0.2709F, 0.7344F));

		PartDefinition cube_r58 = body.addOrReplaceChild("cube_r58", CubeListBuilder.create().texOffs(106, 101).mirror().addBox(-2.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -1.0089F, -0.8844F, -0.1342F, -0.0845F, -0.9195F));

		PartDefinition cube_r59 = body.addOrReplaceChild("cube_r59", CubeListBuilder.create().texOffs(98, 54).mirror().addBox(-4.7321F, -0.9998F, -0.4825F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -1.0089F, -0.8844F, -0.0718F, -0.1489F, -1.4429F));

		PartDefinition cube_r60 = body.addOrReplaceChild("cube_r60", CubeListBuilder.create().texOffs(106, 68).mirror().addBox(-2.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -1.2089F, -4.0844F, -0.0287F, -0.0249F, -0.5405F));

		PartDefinition cube_r61 = body.addOrReplaceChild("cube_r61", CubeListBuilder.create().texOffs(106, 0).mirror().addBox(-3.7321F, -0.9999F, -0.4826F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -1.2089F, -4.0844F, -0.01F, -0.0446F, -1.0641F));

		PartDefinition cube_r62 = body.addOrReplaceChild("cube_r62", CubeListBuilder.create().texOffs(84, 75).mirror().addBox(-6.4836F, -2.9597F, -0.4826F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -1.2089F, -4.0844F, 0.0174F, -0.0423F, -1.6755F));

		PartDefinition cube_r63 = body.addOrReplaceChild("cube_r63", CubeListBuilder.create().texOffs(24, 68).addBox(0.3F, -0.4F, -0.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.6692F, -4.2898F, 0.0239F, -0.2709F, -0.7344F));

		PartDefinition cube_r64 = body.addOrReplaceChild("cube_r64", CubeListBuilder.create().texOffs(106, 101).addBox(0.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -1.0089F, -0.8844F, -0.1342F, 0.0845F, 0.9195F));

		PartDefinition cube_r65 = body.addOrReplaceChild("cube_r65", CubeListBuilder.create().texOffs(98, 54).addBox(1.7321F, -0.9998F, -0.4825F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -1.0089F, -0.8844F, -0.0718F, 0.1489F, 1.4429F));

		PartDefinition cube_r66 = body.addOrReplaceChild("cube_r66", CubeListBuilder.create().texOffs(106, 68).addBox(0.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -1.2089F, -4.0844F, -0.0287F, 0.0249F, 0.5405F));

		PartDefinition cube_r67 = body.addOrReplaceChild("cube_r67", CubeListBuilder.create().texOffs(106, 0).addBox(1.7321F, -0.9999F, -0.4826F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -1.2089F, -4.0844F, -0.01F, 0.0446F, 1.0641F));

		PartDefinition cube_r68 = body.addOrReplaceChild("cube_r68", CubeListBuilder.create().texOffs(84, 75).addBox(2.4836F, -2.9597F, -0.4826F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -1.2089F, -4.0844F, 0.0174F, 0.0423F, 1.6755F));

		PartDefinition cube_r69 = body.addOrReplaceChild("cube_r69", CubeListBuilder.create().texOffs(44, 35).addBox(-2.5F, -0.9037F, -11.8448F, 5.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 12.7F, -3.1F, -0.1484F, 0.0F, 0.0F));

		PartDefinition cube_r70 = body.addOrReplaceChild("cube_r70", CubeListBuilder.create().texOffs(27, 0).addBox(-3.0F, -2.9969F, -6.9536F, 6.0F, 3.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 12.7F, -3.1F, 0.0087F, 0.0F, 0.0F));

		PartDefinition cube_r71 = body.addOrReplaceChild("cube_r71", CubeListBuilder.create().texOffs(13, 53).addBox(-1.0F, -1.0F, -5.2F, 2.0F, 2.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, -0.8F, -0.0175F, 0.0F, 0.0F));

		PartDefinition bone2 = body.addOrReplaceChild("bone2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.0087F, -5.9004F, 0.0872F, -0.0038F, 0.0435F));

		PartDefinition cube_r72 = bone2.addOrReplaceChild("cube_r72", CubeListBuilder.create().texOffs(30, 53).addBox(-1.0F, -1.0F, -11.2F, 2.0F, 2.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 5.2F, -0.0175F, 0.0F, 0.0F));

		PartDefinition cube_r73 = bone2.addOrReplaceChild("cube_r73", CubeListBuilder.create().texOffs(0, 99).addBox(0.0F, -3.9909F, -1.9833F, 0.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.0F, 0.0F, 0.0698F, 0.0F, 0.0F));

		PartDefinition cube_r74 = bone2.addOrReplaceChild("cube_r74", CubeListBuilder.create().texOffs(105, 51).mirror().addBox(-2.0F, -0.5F, -0.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, -0.6605F, -1.0894F, -0.015F, 0.2715F, 0.5895F));

		PartDefinition cube_r75 = bone2.addOrReplaceChild("cube_r75", CubeListBuilder.create().texOffs(105, 48).mirror().addBox(-2.0F, -0.5F, -0.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, -0.9605F, -4.0894F, -0.044F, 0.2684F, 0.4808F));

		PartDefinition cube_r76 = bone2.addOrReplaceChild("cube_r76", CubeListBuilder.create().texOffs(63, 51).mirror().addBox(-10.4836F, -2.9596F, -0.4825F, 8.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -1.5001F, -3.884F, 0.0281F, 0.1665F, -1.4473F));

		PartDefinition cube_r77 = bone2.addOrReplaceChild("cube_r77", CubeListBuilder.create().texOffs(107, 23).mirror().addBox(-3.7321F, -0.9998F, -0.4825F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -1.5001F, -3.884F, 0.1189F, 0.1201F, -0.8317F));

		PartDefinition cube_r78 = bone2.addOrReplaceChild("cube_r78", CubeListBuilder.create().texOffs(107, 21).mirror().addBox(-2.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -1.5001F, -3.884F, 0.1652F, 0.0535F, -0.3102F));

		PartDefinition cube_r79 = bone2.addOrReplaceChild("cube_r79", CubeListBuilder.create().texOffs(77, 68).mirror().addBox(-8.4836F, -2.9597F, -0.4825F, 6.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -1.2001F, -0.884F, 0.0207F, 0.0271F, -1.5179F));

		PartDefinition cube_r80 = bone2.addOrReplaceChild("cube_r80", CubeListBuilder.create().texOffs(5, 107).mirror().addBox(-3.7321F, -0.9999F, -0.4825F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -1.2001F, -0.884F, 0.0324F, 0.0103F, -0.9071F));

		PartDefinition cube_r81 = bone2.addOrReplaceChild("cube_r81", CubeListBuilder.create().texOffs(106, 103).mirror().addBox(-2.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -1.2001F, -0.884F, 0.0356F, 0.0014F, -0.3836F));

		PartDefinition cube_r82 = bone2.addOrReplaceChild("cube_r82", CubeListBuilder.create().texOffs(106, 103).addBox(0.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -1.2001F, -0.884F, 0.0356F, -0.0014F, 0.3836F));

		PartDefinition cube_r83 = bone2.addOrReplaceChild("cube_r83", CubeListBuilder.create().texOffs(5, 107).addBox(1.7321F, -0.9999F, -0.4825F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -1.2001F, -0.884F, 0.0324F, -0.0103F, 0.9071F));

		PartDefinition cube_r84 = bone2.addOrReplaceChild("cube_r84", CubeListBuilder.create().texOffs(77, 68).addBox(2.4836F, -2.9597F, -0.4825F, 6.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -1.2001F, -0.884F, 0.0207F, -0.0271F, 1.5179F));

		PartDefinition cube_r85 = bone2.addOrReplaceChild("cube_r85", CubeListBuilder.create().texOffs(107, 21).addBox(0.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -1.5001F, -3.884F, 0.1652F, -0.0535F, 0.3102F));

		PartDefinition cube_r86 = bone2.addOrReplaceChild("cube_r86", CubeListBuilder.create().texOffs(107, 23).addBox(1.7321F, -0.9998F, -0.4825F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -1.5001F, -3.884F, 0.1189F, -0.1201F, 0.8317F));

		PartDefinition cube_r87 = bone2.addOrReplaceChild("cube_r87", CubeListBuilder.create().texOffs(63, 51).addBox(2.4836F, -2.9596F, -0.4825F, 8.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -1.5001F, -3.884F, 0.0281F, -0.1665F, 1.4473F));

		PartDefinition cube_r88 = bone2.addOrReplaceChild("cube_r88", CubeListBuilder.create().texOffs(105, 48).addBox(0.0F, -0.5F, -0.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.9605F, -4.0894F, -0.044F, -0.2684F, -0.4808F));

		PartDefinition cube_r89 = bone2.addOrReplaceChild("cube_r89", CubeListBuilder.create().texOffs(105, 51).addBox(0.0F, -0.5F, -0.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.6605F, -1.0894F, -0.015F, -0.2715F, -0.5895F));

		PartDefinition cube_r90 = bone2.addOrReplaceChild("cube_r90", CubeListBuilder.create().texOffs(31, 97).addBox(0.0F, -3.5433F, -1.982F, 0.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.1F, -3.0F, 0.1134F, 0.0F, 0.0F));

		PartDefinition bone3 = bone2.addOrReplaceChild("bone3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.0835F, -5.9298F, 0.0875F, 0.0831F, 0.0511F));

		PartDefinition cube_r91 = bone3.addOrReplaceChild("cube_r91", CubeListBuilder.create().texOffs(50, 18).addBox(-1.0F, -1.0F, -11.2F, 2.0F, 2.0F, 6.0F, new CubeDeformation(0.0F))
				.texOffs(10, 113).addBox(0.0F, -3.8F, -6.2F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(112, 16).addBox(0.0F, -3.5F, -8.2F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(112, 11).addBox(0.0F, -3.2F, -10.2F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 5.2F, -0.0175F, 0.0F, 0.0F));

		PartDefinition cube_r92 = bone3.addOrReplaceChild("cube_r92", CubeListBuilder.create().texOffs(65, 35).mirror().addBox(-10.4836F, -2.9597F, -0.4825F, 8.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -1.1166F, -4.3541F, 0.0325F, 0.2011F, -1.4465F));

		PartDefinition cube_r93 = bone3.addOrReplaceChild("cube_r93", CubeListBuilder.create().texOffs(41, 109).mirror().addBox(-3.7321F, -0.9999F, -0.4825F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -1.1166F, -4.3541F, 0.1427F, 0.1459F, -0.8285F));

		PartDefinition cube_r94 = bone3.addOrReplaceChild("cube_r94", CubeListBuilder.create().texOffs(109, 36).mirror().addBox(-2.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -1.1166F, -4.3541F, 0.1985F, 0.0642F, -0.3082F));

		PartDefinition cube_r95 = bone3.addOrReplaceChild("cube_r95", CubeListBuilder.create().texOffs(92, 105).mirror().addBox(-1.9F, -0.4F, -0.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, -0.977F, -4.5596F, -0.0147F, 0.1843F, 0.5908F));

		PartDefinition cube_r96 = bone3.addOrReplaceChild("cube_r96", CubeListBuilder.create().texOffs(105, 90).mirror().addBox(-1.9F, -0.4F, -0.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, -1.077F, -2.5596F, -0.0147F, 0.1843F, 0.5908F));

		PartDefinition cube_r97 = bone3.addOrReplaceChild("cube_r97", CubeListBuilder.create().texOffs(109, 34).mirror().addBox(-2.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -1.2167F, -2.3541F, 0.1319F, 0.0428F, -0.3118F));

		PartDefinition cube_r98 = bone3.addOrReplaceChild("cube_r98", CubeListBuilder.create().texOffs(27, 109).mirror().addBox(-3.7321F, -0.9999F, -0.4825F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -1.2167F, -2.3541F, 0.0953F, 0.0943F, -0.8342F));

		PartDefinition cube_r99 = bone3.addOrReplaceChild("cube_r99", CubeListBuilder.create().texOffs(54, 8).mirror().addBox(-11.4836F, -2.9596F, -0.4825F, 9.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -1.2167F, -2.3541F, 0.0238F, 0.1318F, -1.448F));

		PartDefinition cube_r100 = bone3.addOrReplaceChild("cube_r100", CubeListBuilder.create().texOffs(105, 6).mirror().addBox(-1.9F, -0.4F, -0.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, -1.077F, -0.6596F, -0.0147F, 0.1843F, 0.5908F));

		PartDefinition cube_r101 = bone3.addOrReplaceChild("cube_r101", CubeListBuilder.create().texOffs(54, 6).mirror().addBox(-11.4836F, -2.9596F, -0.4826F, 9.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -1.2167F, -0.4541F, 0.026F, 0.1492F, -1.4477F));

		PartDefinition cube_r102 = bone3.addOrReplaceChild("cube_r102", CubeListBuilder.create().texOffs(107, 54).mirror().addBox(-3.7321F, -0.9999F, -0.4826F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -1.2167F, -0.4541F, 0.1071F, 0.1072F, -0.833F));

		PartDefinition cube_r103 = bone3.addOrReplaceChild("cube_r103", CubeListBuilder.create().texOffs(53, 107).mirror().addBox(-2.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -1.2167F, -0.4541F, 0.1486F, 0.0482F, -0.311F));

		PartDefinition cube_r104 = bone3.addOrReplaceChild("cube_r104", CubeListBuilder.create().texOffs(92, 105).addBox(-0.1F, -0.4F, -0.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.977F, -4.5596F, -0.0147F, -0.1843F, -0.5908F));

		PartDefinition cube_r105 = bone3.addOrReplaceChild("cube_r105", CubeListBuilder.create().texOffs(109, 36).addBox(0.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -1.1166F, -4.3541F, 0.1985F, -0.0642F, 0.3082F));

		PartDefinition cube_r106 = bone3.addOrReplaceChild("cube_r106", CubeListBuilder.create().texOffs(41, 109).addBox(1.7321F, -0.9999F, -0.4825F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -1.1166F, -4.3541F, 0.1427F, -0.1459F, 0.8285F));

		PartDefinition cube_r107 = bone3.addOrReplaceChild("cube_r107", CubeListBuilder.create().texOffs(65, 35).addBox(2.4836F, -2.9597F, -0.4825F, 8.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -1.1166F, -4.3541F, 0.0325F, -0.2011F, 1.4465F));

		PartDefinition cube_r108 = bone3.addOrReplaceChild("cube_r108", CubeListBuilder.create().texOffs(54, 8).addBox(2.4836F, -2.9596F, -0.4825F, 9.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -1.2167F, -2.3541F, 0.0238F, -0.1318F, 1.448F));

		PartDefinition cube_r109 = bone3.addOrReplaceChild("cube_r109", CubeListBuilder.create().texOffs(27, 109).addBox(1.7321F, -0.9999F, -0.4825F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -1.2167F, -2.3541F, 0.0953F, -0.0943F, 0.8342F));

		PartDefinition cube_r110 = bone3.addOrReplaceChild("cube_r110", CubeListBuilder.create().texOffs(109, 34).addBox(0.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -1.2167F, -2.3541F, 0.1319F, -0.0428F, 0.3118F));

		PartDefinition cube_r111 = bone3.addOrReplaceChild("cube_r111", CubeListBuilder.create().texOffs(105, 90).addBox(-0.1F, -0.4F, -0.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.077F, -2.5596F, -0.0147F, -0.1843F, -0.5908F));

		PartDefinition cube_r112 = bone3.addOrReplaceChild("cube_r112", CubeListBuilder.create().texOffs(53, 107).addBox(0.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -1.2167F, -0.4541F, 0.1486F, -0.0482F, 0.311F));

		PartDefinition cube_r113 = bone3.addOrReplaceChild("cube_r113", CubeListBuilder.create().texOffs(107, 54).addBox(1.7321F, -0.9999F, -0.4826F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -1.2167F, -0.4541F, 0.1071F, -0.1072F, 0.833F));

		PartDefinition cube_r114 = bone3.addOrReplaceChild("cube_r114", CubeListBuilder.create().texOffs(54, 6).addBox(2.4836F, -2.9596F, -0.4826F, 9.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -1.2167F, -0.4541F, 0.026F, -0.1492F, 1.4477F));

		PartDefinition cube_r115 = bone3.addOrReplaceChild("cube_r115", CubeListBuilder.create().texOffs(105, 6).addBox(-0.1F, -0.4F, -0.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.077F, -0.6596F, -0.0147F, -0.1843F, -0.5908F));

		PartDefinition chest = bone3.addOrReplaceChild("chest", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.2078F, -5.9698F, -0.131F, 0.0433F, -0.0057F));

		PartDefinition cube_r116 = chest.addOrReplaceChild("cube_r116", CubeListBuilder.create().texOffs(69, 113).addBox(0.0F, -2.0978F, -1.2394F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(66, 113).addBox(0.0F, -1.8978F, -3.2394F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(67, 18).addBox(-1.0F, -0.0978F, -4.2394F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.0F, -0.9F, 0.2F, 0.1396F, 0.0F, 0.0F));

		PartDefinition cube_r117 = chest.addOrReplaceChild("cube_r117", CubeListBuilder.create().texOffs(78, 37).mirror().addBox(-8.4836F, -2.9596F, -0.4826F, 6.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -0.0089F, -2.4844F, 0.0722F, 0.4257F, -1.5902F));

		PartDefinition cube_r118 = chest.addOrReplaceChild("cube_r118", CubeListBuilder.create().texOffs(67, 108).mirror().addBox(-3.7321F, -0.9999F, -0.4826F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -0.0089F, -2.4844F, 0.3097F, 0.3053F, -0.9469F));

		PartDefinition cube_r119 = chest.addOrReplaceChild("cube_r119", CubeListBuilder.create().texOffs(60, 107).mirror().addBox(-2.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -0.0089F, -2.4844F, 0.4194F, 0.1233F, -0.4434F));

		PartDefinition cube_r120 = chest.addOrReplaceChild("cube_r120", CubeListBuilder.create().texOffs(109, 70).mirror().addBox(-2.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -0.4089F, -0.4844F, 0.3827F, 0.121F, -0.3435F));

		PartDefinition cube_r121 = chest.addOrReplaceChild("cube_r121", CubeListBuilder.create().texOffs(60, 109).mirror().addBox(-3.7321F, -0.9999F, -0.4826F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -0.4089F, -0.4844F, 0.2775F, 0.2857F, -0.8519F));

		PartDefinition cube_r122 = chest.addOrReplaceChild("cube_r122", CubeListBuilder.create().texOffs(67, 32).mirror().addBox(-9.4836F, -2.9597F, -0.4826F, 7.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -0.4089F, -0.4844F, 0.0581F, 0.3916F, -1.4914F));

		PartDefinition cube_r123 = chest.addOrReplaceChild("cube_r123", CubeListBuilder.create().texOffs(50, 27).mirror().addBox(-0.5F, 0.0F, -0.6F, 1.0F, 0.0F, 7.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0287F, 10.0052F, -0.2098F, 0.0318F, -0.9706F, 0.3455F));

		PartDefinition cube_r124 = chest.addOrReplaceChild("cube_r124", CubeListBuilder.create().texOffs(65, 37).mirror().addBox(-0.9F, -0.1F, -0.8F, 1.0F, 0.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.3269F, 9.9462F, 0.1187F, -0.3941F, -1.2669F, 0.9105F));

		PartDefinition cube_r125 = chest.addOrReplaceChild("cube_r125", CubeListBuilder.create().texOffs(84, 70).mirror().addBox(-0.5F, 0.0F, 0.2F, 1.0F, 0.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.1943F, 9.9051F, -1.0843F, 1.6291F, -1.5604F, -0.9701F));

		PartDefinition cube_r126 = chest.addOrReplaceChild("cube_r126", CubeListBuilder.create().texOffs(78, 37).addBox(2.4836F, -2.9596F, -0.4826F, 6.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.0089F, -2.4844F, 0.0722F, -0.4257F, 1.5902F));

		PartDefinition cube_r127 = chest.addOrReplaceChild("cube_r127", CubeListBuilder.create().texOffs(67, 108).addBox(1.7321F, -0.9999F, -0.4826F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.0089F, -2.4844F, 0.3097F, -0.3053F, 0.9469F));

		PartDefinition cube_r128 = chest.addOrReplaceChild("cube_r128", CubeListBuilder.create().texOffs(60, 107).addBox(0.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.0089F, -2.4844F, 0.4194F, -0.1233F, 0.4434F));

		PartDefinition cube_r129 = chest.addOrReplaceChild("cube_r129", CubeListBuilder.create().texOffs(109, 70).addBox(0.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.4089F, -0.4844F, 0.3827F, -0.121F, 0.3435F));

		PartDefinition cube_r130 = chest.addOrReplaceChild("cube_r130", CubeListBuilder.create().texOffs(60, 109).addBox(1.7321F, -0.9999F, -0.4826F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.4089F, -0.4844F, 0.2775F, -0.2857F, 0.8519F));

		PartDefinition cube_r131 = chest.addOrReplaceChild("cube_r131", CubeListBuilder.create().texOffs(67, 32).addBox(2.4836F, -2.9597F, -0.4826F, 7.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.4089F, -0.4844F, 0.0581F, -0.3916F, 1.4914F));

		PartDefinition cube_r132 = chest.addOrReplaceChild("cube_r132", CubeListBuilder.create().texOffs(89, 39).addBox(-0.5F, -1.0181F, -2.975F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 10.469F, -0.4264F, -0.3142F, 0.0F, 0.0F));

		PartDefinition cube_r133 = chest.addOrReplaceChild("cube_r133", CubeListBuilder.create().texOffs(50, 27).addBox(-0.5F, 0.0F, -0.6F, 1.0F, 0.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.0287F, 10.0052F, -0.2098F, 0.0318F, 0.9706F, -0.3455F));

		PartDefinition cube_r134 = chest.addOrReplaceChild("cube_r134", CubeListBuilder.create().texOffs(65, 37).addBox(-0.1F, -0.1F, -0.8F, 1.0F, 0.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.3269F, 9.9462F, 0.1187F, -0.3941F, 1.2669F, -0.9105F));

		PartDefinition cube_r135 = chest.addOrReplaceChild("cube_r135", CubeListBuilder.create().texOffs(84, 70).addBox(-0.5F, 0.0F, 0.2F, 1.0F, 0.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.1943F, 9.9051F, -1.0843F, 1.6291F, 1.5604F, 0.9701F));

		PartDefinition neck4 = chest.addOrReplaceChild("neck4", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.0F, -3.8F, -0.2182F, 0.0F, 0.0F));

		PartDefinition cube_r136 = neck4.addOrReplaceChild("cube_r136", CubeListBuilder.create().texOffs(114, 21).addBox(0.0F, -1.7153F, -0.4608F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.3607F, -0.543F, 0.3578F, 0.0F, 0.0F));

		PartDefinition cube_r137 = neck4.addOrReplaceChild("cube_r137", CubeListBuilder.create().texOffs(113, 0).addBox(-0.0858F, 0.072F, -0.5241F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.6F, 0.3774F, -2.3123F, 0.5179F, -0.4477F, 0.5771F));

		PartDefinition cube_r138 = neck4.addOrReplaceChild("cube_r138", CubeListBuilder.create().texOffs(95, 0).mirror().addBox(-4.8279F, -0.3947F, -0.516F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.6F, 0.3774F, -2.3123F, 0.2148F, 0.6325F, -1.1522F));

		PartDefinition cube_r139 = neck4.addOrReplaceChild("cube_r139", CubeListBuilder.create().texOffs(108, 76).mirror().addBox(-3.3977F, -0.6281F, -0.4863F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.0911F, -0.6844F, 0.5257F, 0.4799F, -0.79F));

		PartDefinition cube_r140 = neck4.addOrReplaceChild("cube_r140", CubeListBuilder.create().texOffs(75, 7).mirror().addBox(-8.4229F, -2.4634F, -0.4863F, 6.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.0911F, -0.6844F, 0.1293F, 0.686F, -1.4861F));

		PartDefinition cube_r141 = neck4.addOrReplaceChild("cube_r141", CubeListBuilder.create().texOffs(108, 74).mirror().addBox(-1.5246F, 0.1547F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.0911F, -0.6844F, 0.68F, 0.185F, -0.3295F));

		PartDefinition cube_r142 = neck4.addOrReplaceChild("cube_r142", CubeListBuilder.create().texOffs(95, 0).addBox(0.8279F, -0.3947F, -0.516F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.6F, 0.3774F, -2.3123F, 0.2148F, -0.6325F, 1.1522F));

		PartDefinition cube_r143 = neck4.addOrReplaceChild("cube_r143", CubeListBuilder.create().texOffs(9, 90).addBox(-1.0F, -0.0978F, -6.2394F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.006F))
				.texOffs(26, 114).addBox(0.0F, -1.4978F, -7.2394F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(65, 103).addBox(-0.5F, -0.0978F, -8.2394F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.0F, -0.9332F, 4.303F, 0.1396F, 0.0F, 0.0F));

		PartDefinition cube_r144 = neck4.addOrReplaceChild("cube_r144", CubeListBuilder.create().texOffs(108, 76).addBox(1.3977F, -0.6281F, -0.4863F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.0911F, -0.6844F, 0.5257F, -0.4799F, 0.79F));

		PartDefinition cube_r145 = neck4.addOrReplaceChild("cube_r145", CubeListBuilder.create().texOffs(75, 7).addBox(2.4229F, -2.4634F, -0.4863F, 6.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.0911F, -0.6844F, 0.1293F, -0.686F, 1.4861F));

		PartDefinition cube_r146 = neck4.addOrReplaceChild("cube_r146", CubeListBuilder.create().texOffs(108, 74).addBox(-0.4754F, 0.1547F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.0911F, -0.6844F, 0.68F, -0.185F, 0.3295F));

		PartDefinition neck3 = neck4.addOrReplaceChild("neck3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.4319F, -3.2769F, 0.2356F, 0.0F, 0.0F));

		PartDefinition cube_r147 = neck3.addOrReplaceChild("cube_r147", CubeListBuilder.create().texOffs(41, 114).addBox(0.5F, -1.6F, -0.8F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, -0.277F, -0.3221F, -0.0436F, 0.0F, 0.0F));

		PartDefinition cube_r148 = neck3.addOrReplaceChild("cube_r148", CubeListBuilder.create().texOffs(53, 114).addBox(0.5F, -2.3F, 1.3F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(83, 83).addBox(0.0F, -1.2F, 0.3F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-0.5F, -0.6456F, -4.5511F, -0.3491F, 0.0F, 0.0F));

		PartDefinition cube_r149 = neck3.addOrReplaceChild("cube_r149", CubeListBuilder.create().texOffs(92, 94).mirror().addBox(-4.8279F, -0.3947F, -0.516F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.6F, -0.0545F, -1.0355F, 0.0717F, 0.7321F, -1.2463F));

		PartDefinition cube_r150 = neck3.addOrReplaceChild("cube_r150", CubeListBuilder.create().texOffs(93, 57).mirror().addBox(-4.8279F, -0.3947F, -0.516F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.6F, -0.3545F, -3.0355F, -0.0159F, 0.7606F, -1.3073F));

		PartDefinition cube_r151 = neck3.addOrReplaceChild("cube_r151", CubeListBuilder.create().texOffs(92, 94).addBox(0.8279F, -0.3947F, -0.516F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.6F, -0.0545F, -1.0355F, 0.0717F, -0.7321F, 1.2463F));

		PartDefinition cube_r152 = neck3.addOrReplaceChild("cube_r152", CubeListBuilder.create().texOffs(112, 52).addBox(-0.0858F, 0.072F, -0.5241F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.6F, -0.0545F, -1.0355F, 0.4787F, -0.5928F, 0.6003F));

		PartDefinition cube_r153 = neck3.addOrReplaceChild("cube_r153", CubeListBuilder.create().texOffs(93, 57).addBox(0.8279F, -0.3947F, -0.516F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.6F, -0.3545F, -3.0355F, -0.0159F, -0.7606F, 1.3073F));

		PartDefinition cube_r154 = neck3.addOrReplaceChild("cube_r154", CubeListBuilder.create().texOffs(112, 41).addBox(-0.0858F, 0.072F, -0.5241F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.6F, -0.3545F, -3.0355F, 0.4379F, -0.6549F, 0.6257F));

		PartDefinition neck2 = neck3.addOrReplaceChild("neck2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -1.2259F, -4.0524F, -0.0521F, 0.0129F, 0.1158F));

		PartDefinition cube_r155 = neck2.addOrReplaceChild("cube_r155", CubeListBuilder.create().texOffs(56, 114).addBox(0.5F, -1.4F, 5.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(63, 43).addBox(0.0F, 0.0F, 0.0F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, -3.6F, -4.7F, -0.576F, 0.0F, 0.0F));

		PartDefinition cube_r156 = neck2.addOrReplaceChild("cube_r156", CubeListBuilder.create().texOffs(113, 78).addBox(0.5F, -1.7F, -1.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, -1.4215F, -1.3453F, -0.7069F, 0.0F, 0.0F));

		PartDefinition cube_r157 = neck2.addOrReplaceChild("cube_r157", CubeListBuilder.create().texOffs(77, 113).addBox(0.5F, -2.2058F, 0.0317F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, -2.9F, -4.0F, -0.6632F, 0.0F, 0.0F));

		PartDefinition cube_r158 = neck2.addOrReplaceChild("cube_r158", CubeListBuilder.create().texOffs(93, 33).mirror().addBox(-3.9141F, 0.072F, -0.5242F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.6F, -2.4089F, -4.2844F, 0.2345F, 0.6463F, -1.3375F));

		PartDefinition cube_r159 = neck2.addOrReplaceChild("cube_r159", CubeListBuilder.create().texOffs(93, 12).mirror().addBox(-3.9141F, 0.0721F, -0.5242F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.6F, -1.2089F, -2.5844F, 0.2761F, 0.6469F, -1.3182F));

		PartDefinition cube_r160 = neck2.addOrReplaceChild("cube_r160", CubeListBuilder.create().texOffs(82, 15).mirror().addBox(-4.9142F, 0.0721F, -0.5242F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.6F, -0.2089F, -0.6844F, 0.2969F, 0.5883F, -1.2714F));

		PartDefinition cube_r161 = neck2.addOrReplaceChild("cube_r161", CubeListBuilder.create().texOffs(93, 33).addBox(-0.0858F, 0.072F, -0.5242F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.6F, -2.4089F, -4.2844F, 0.2345F, -0.6463F, 1.3375F));

		PartDefinition cube_r162 = neck2.addOrReplaceChild("cube_r162", CubeListBuilder.create().texOffs(93, 12).addBox(-0.0858F, 0.0721F, -0.5242F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.6F, -1.2089F, -2.5844F, 0.2761F, -0.6469F, 1.3182F));

		PartDefinition cube_r163 = neck2.addOrReplaceChild("cube_r163", CubeListBuilder.create().texOffs(82, 15).addBox(-0.0858F, 0.0721F, -0.5242F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.6F, -0.2089F, -0.6844F, 0.2969F, -0.5883F, 1.2714F));

		PartDefinition neck = neck2.addOrReplaceChild("neck", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -3.1F, -4.6F, -0.394F, 0.0806F, -0.0335F));

		PartDefinition cube_r164 = neck.addOrReplaceChild("cube_r164", CubeListBuilder.create().texOffs(113, 82).addBox(0.5F, -1.8705F, -0.0372F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, -0.5F, -1.0F, -0.3578F, 0.0F, 0.0F));

		PartDefinition cube_r165 = neck.addOrReplaceChild("cube_r165", CubeListBuilder.create().texOffs(53, 109).mirror().addBox(-2.0398F, -0.1998F, -0.6323F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.3278F, 0.2151F, -2.3254F, 0.3707F, 0.9462F, -1.2266F));

		PartDefinition cube_r166 = neck.addOrReplaceChild("cube_r166", CubeListBuilder.create().texOffs(100, 9).mirror().addBox(-2.9141F, 0.0721F, -0.5242F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.6F, 0.2911F, -1.0844F, 0.2801F, 0.6978F, -1.3493F));

		PartDefinition cube_r167 = neck.addOrReplaceChild("cube_r167", CubeListBuilder.create().texOffs(53, 109).addBox(0.0398F, -0.1998F, -0.6323F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.3278F, 0.2151F, -2.3254F, 0.3707F, -0.9462F, 1.2266F));

		PartDefinition cube_r168 = neck.addOrReplaceChild("cube_r168", CubeListBuilder.create().texOffs(100, 9).addBox(-0.0858F, 0.0721F, -0.5242F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.6F, 0.2911F, -1.0844F, 0.2801F, -0.6978F, 1.3493F));

		PartDefinition cube_r169 = neck.addOrReplaceChild("cube_r169", CubeListBuilder.create().texOffs(80, 113).addBox(0.5F, -2.1006F, -0.0349F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, -0.4F, -3.0F, -0.3578F, 0.0F, 0.0F));

		PartDefinition cube_r170 = neck.addOrReplaceChild("cube_r170", CubeListBuilder.create().texOffs(78, 39).addBox(0.0F, -1.0F, -1.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-0.5F, 0.6F, -3.0F, 0.0349F, 0.0F, 0.0F));

		PartDefinition head = neck.addOrReplaceChild("head", CubeListBuilder.create(), PartPose.offset(0.0F, 0.2F, -3.3F));

		PartDefinition cube_r171 = head.addOrReplaceChild("cube_r171", CubeListBuilder.create().texOffs(84, 110).addBox(-0.5F, -0.5F, -3.1F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 2.8434F, -8.5828F, 0.3665F, 0.0F, 0.0F));

		PartDefinition cube_r172 = head.addOrReplaceChild("cube_r172", CubeListBuilder.create().texOffs(67, 110).addBox(-0.5F, -0.3844F, -2.1183F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.0F, 3.6434F, -8.7828F, 0.1571F, 0.0F, 0.0F));

		PartDefinition cube_r173 = head.addOrReplaceChild("cube_r173", CubeListBuilder.create().texOffs(91, 17).addBox(-0.5F, -0.2F, -1.5F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.009F)), PartPose.offsetAndRotation(0.0F, 2.4884F, -9.3686F, 0.4451F, 0.0F, 0.0F));

		PartDefinition cube_r174 = head.addOrReplaceChild("cube_r174", CubeListBuilder.create().texOffs(80, 89).addBox(-0.5F, -0.4F, -2.5F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(0.0F, 3.0928F, -8.2395F, 0.1833F, 0.0F, 0.0F));

		PartDefinition cube_r175 = head.addOrReplaceChild("cube_r175", CubeListBuilder.create().texOffs(24, 102).addBox(-0.5F, -0.375F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.0F, 3.8896F, -8.428F, 0.2618F, 0.0F, 0.0F));

		PartDefinition cube_r176 = head.addOrReplaceChild("cube_r176", CubeListBuilder.create().texOffs(17, 102).addBox(-1.0F, -0.8991F, -2.0808F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 2.7F, -5.8F, 0.3927F, 0.0F, 0.0F));

		PartDefinition cube_r177 = head.addOrReplaceChild("cube_r177", CubeListBuilder.create().texOffs(48, 110).addBox(0.0F, 0.1986F, -1.0113F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(-0.5F, -2.4F, -1.0F, 0.8203F, 0.0F, 0.0F));

		PartDefinition cube_r178 = head.addOrReplaceChild("cube_r178", CubeListBuilder.create().texOffs(110, 43).addBox(0.0F, -0.001F, 0.0591F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.004F))
				.texOffs(34, 110).addBox(0.0F, -0.001F, 0.1591F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, -2.0F, -2.1F, 0.1571F, 0.0F, 0.0F));

		PartDefinition cube_r179 = head.addOrReplaceChild("cube_r179", CubeListBuilder.create().texOffs(22, 110).addBox(0.0F, -0.012F, -0.1599F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, -1.5F, -2.7F, 0.6807F, 0.0F, 0.0F));

		PartDefinition cube_r180 = head.addOrReplaceChild("cube_r180", CubeListBuilder.create().texOffs(41, 85).addBox(-1.0F, 0.038F, -3.0099F, 2.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.7254F, -0.0639F, 0.1134F, 0.0F, 0.0F));

		PartDefinition cube_r181 = head.addOrReplaceChild("cube_r181", CubeListBuilder.create().texOffs(112, 30).addBox(-0.5F, 0.025F, 0.05F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.3319F, -3.5891F, 0.1396F, 0.0F, 0.0F));

		PartDefinition cube_r182 = head.addOrReplaceChild("cube_r182", CubeListBuilder.create().texOffs(17, 110).addBox(-0.5F, -0.475F, -0.95F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.8683F, -3.4018F, 0.384F, 0.0F, 0.0F));

		PartDefinition cube_r183 = head.addOrReplaceChild("cube_r183", CubeListBuilder.create().texOffs(99, 101).addBox(-0.5F, -0.0578F, 0.0235F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.1532F, -5.9113F, 0.4625F, 0.0F, 0.0F));

		PartDefinition cube_r184 = head.addOrReplaceChild("cube_r184", CubeListBuilder.create().texOffs(41, 90).addBox(-1.0F, -0.0094F, -3.0372F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.5F, 1.7145F, -9.3894F, 0.5934F, 0.0F, 0.0F));

		PartDefinition cube_r185 = head.addOrReplaceChild("cube_r185", CubeListBuilder.create().texOffs(78, 45).addBox(-1.0F, -0.6094F, -4.0372F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.5F, 0.3F, -5.6F, 0.5061F, 0.0F, 0.0F));

		PartDefinition leftFace = head.addOrReplaceChild("leftFace", CubeListBuilder.create(), PartPose.offset(1.0F, -0.7F, -3.2F));

		PartDefinition cube_r186 = leftFace.addOrReplaceChild("cube_r186", CubeListBuilder.create().texOffs(99, 96).addBox(-0.5F, -1.4279F, -0.1347F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(-0.4035F, 0.35F, -0.4045F, -0.0792F, -0.1223F, 0.4991F));

		PartDefinition cube_r187 = leftFace.addOrReplaceChild("cube_r187", CubeListBuilder.create().texOffs(11, 75).addBox(-0.5F, -1.1458F, -2.9543F, 1.0F, 2.0F, 4.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(-0.4035F, 0.35F, -0.4045F, 0.5317F, -0.1223F, 0.4991F));

		PartDefinition cube_r188 = leftFace.addOrReplaceChild("cube_r188", CubeListBuilder.create().texOffs(111, 59).addBox(0.63F, -1.0F, -0.3F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F))
				.texOffs(58, 111).addBox(0.46F, -1.0F, -0.3F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-1.0F, 0.9F, 0.9F, 0.4189F, 0.0F, 0.0F));

		PartDefinition cube_r189 = leftFace.addOrReplaceChild("cube_r189", CubeListBuilder.create().texOffs(102, 70).addBox(-1.0F, -1.2F, -0.4F, 2.0F, 2.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(-0.7F, 1.0716F, 0.6187F, 0.6981F, 0.0F, 0.0F));

		PartDefinition cube_r190 = leftFace.addOrReplaceChild("cube_r190", CubeListBuilder.create().texOffs(0, 81).addBox(-0.5F, -0.5F, -1.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.68F, 3.7431F, -7.2959F, 0.5498F, 0.0F, 0.0F));

		PartDefinition cube_r191 = leftFace.addOrReplaceChild("cube_r191", CubeListBuilder.create().texOffs(111, 56).addBox(-0.5F, 0.0789F, 0.6687F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.099F)), PartPose.offsetAndRotation(-0.48F, 1.6954F, -1.5566F, 0.8901F, 0.0524F, 0.0F));

		PartDefinition cube_r192 = leftFace.addOrReplaceChild("cube_r192", CubeListBuilder.create().texOffs(89, 108).addBox(-0.5F, -1.4822F, 0.4139F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.103F)), PartPose.offsetAndRotation(-0.48F, 1.6954F, -1.5566F, 0.1571F, 0.0524F, 0.0F));

		PartDefinition cube_r193 = leftFace.addOrReplaceChild("cube_r193", CubeListBuilder.create().texOffs(108, 82).addBox(-0.5F, -1.195F, 0.0751F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-0.48F, 1.6954F, -1.5566F, 0.5236F, 0.0524F, 0.0F));

		PartDefinition cube_r194 = leftFace.addOrReplaceChild("cube_r194", CubeListBuilder.create().texOffs(89, 112).addBox(-0.5F, -1.0156F, -0.7604F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.106F))
				.texOffs(112, 86).addBox(-0.5F, -1.3156F, -1.0604F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.094F)), PartPose.offsetAndRotation(-0.48F, 1.6954F, -1.5566F, 1.6406F, 0.0524F, 0.0F));

		PartDefinition cube_r195 = leftFace.addOrReplaceChild("cube_r195", CubeListBuilder.create().texOffs(72, 112).addBox(-0.5F, -1.5781F, -1.5037F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.105F)), PartPose.offsetAndRotation(-0.48F, 1.6954F, -1.5566F, 1.1868F, 0.0524F, 0.0F));

		PartDefinition cube_r196 = leftFace.addOrReplaceChild("cube_r196", CubeListBuilder.create().texOffs(112, 49).addBox(-0.5F, -1.1908F, -1.2791F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.099F)), PartPose.offsetAndRotation(-0.48F, 1.6954F, -1.5566F, 0.7505F, 0.0524F, 0.0F));

		PartDefinition cube_r197 = leftFace.addOrReplaceChild("cube_r197", CubeListBuilder.create().texOffs(108, 78).addBox(-0.5F, -1.1551F, -0.574F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.095F)), PartPose.offsetAndRotation(-0.48F, 1.6954F, -1.5566F, 0.6632F, 0.0524F, 0.0F));

		PartDefinition cube_r198 = leftFace.addOrReplaceChild("cube_r198", CubeListBuilder.create().texOffs(102, 35).addBox(-0.5F, -0.0025F, -0.7997F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.103F)), PartPose.offsetAndRotation(-0.48F, 1.6954F, -1.5566F, 0.1614F, 0.0524F, 0.0F));

		PartDefinition cube_r199 = leftFace.addOrReplaceChild("cube_r199", CubeListBuilder.create().texOffs(112, 46).addBox(-0.5F, 0.4312F, 0.3655F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.104F)), PartPose.offsetAndRotation(-0.48F, 1.6954F, -1.5566F, 0.6981F, 0.0524F, 0.0F));

		PartDefinition cube_r200 = leftFace.addOrReplaceChild("cube_r200", CubeListBuilder.create().texOffs(53, 111).addBox(-0.5F, -0.5484F, 0.9069F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-0.48F, 1.6954F, -1.5566F, 0.0873F, 0.0524F, 0.0F));

		PartDefinition cube_r201 = leftFace.addOrReplaceChild("cube_r201", CubeListBuilder.create().texOffs(112, 38).addBox(-0.5F, 0.8F, -0.525F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.096F))
				.texOffs(94, 108).addBox(-0.5F, -0.8F, -0.525F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-0.06F, 1.1161F, 2.1818F, -3.1154F, 0.0F, 0.0F));

		PartDefinition cube_r202 = leftFace.addOrReplaceChild("cube_r202", CubeListBuilder.create().texOffs(74, 108).addBox(-0.5F, -1.2439F, -0.619F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.103F)), PartPose.offsetAndRotation(-0.06F, 0.0885F, 2.4002F, 2.8187F, 0.0F, 0.0F));

		PartDefinition cube_r203 = leftFace.addOrReplaceChild("cube_r203", CubeListBuilder.create().texOffs(39, 111).addBox(-0.5F, -0.425F, -0.425F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.104F)), PartPose.offsetAndRotation(-0.06F, 0.9166F, 1.1346F, -0.1134F, 0.0F, 0.0F));

		PartDefinition cube_r204 = leftFace.addOrReplaceChild("cube_r204", CubeListBuilder.create().texOffs(27, 111).addBox(0.44F, -1.0321F, -0.8449F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.099F)), PartPose.offsetAndRotation(-1.0F, -0.1F, 1.5F, 1.9199F, 0.0F, 0.0F));

		PartDefinition cube_r205 = leftFace.addOrReplaceChild("cube_r205", CubeListBuilder.create().texOffs(5, 111).addBox(0.44F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-1.0F, 0.9F, 0.9F, 0.7679F, 0.0F, 0.0F));

		PartDefinition cube_r206 = leftFace.addOrReplaceChild("cube_r206", CubeListBuilder.create().texOffs(112, 89).addBox(0.44F, -0.95F, -0.075F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.104F)), PartPose.offsetAndRotation(-1.0F, 0.1731F, 0.2133F, -0.5323F, 0.0F, 0.0F));

		PartDefinition cube_r207 = leftFace.addOrReplaceChild("cube_r207", CubeListBuilder.create().texOffs(99, 110).addBox(0.44F, -0.95F, -0.675F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.104F)), PartPose.offsetAndRotation(-1.0F, 0.9F, 0.9F, 0.1134F, 0.0F, 0.0F));

		PartDefinition cube_r208 = leftFace.addOrReplaceChild("cube_r208", CubeListBuilder.create().texOffs(94, 112).addBox(-0.5F, -0.325F, 0.225F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.7F, 0.1416F, -0.9085F, 0.3229F, 0.0F, 0.0F));

		PartDefinition cube_r209 = leftFace.addOrReplaceChild("cube_r209", CubeListBuilder.create().texOffs(11, 68).addBox(-0.5F, -1.075F, -4.2F, 1.0F, 1.0F, 5.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(-0.7F, 1.0805F, -0.9987F, 0.4974F, 0.0F, 0.0F));

		PartDefinition cube_r210 = leftFace.addOrReplaceChild("cube_r210", CubeListBuilder.create().texOffs(75, 0).addBox(-0.5F, -0.975F, -2.525F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.7F, 2.4104F, -2.5309F, 0.3229F, 0.0F, 0.0F));

		PartDefinition cube_r211 = leftFace.addOrReplaceChild("cube_r211", CubeListBuilder.create().texOffs(80, 24).addBox(-0.475F, 0.3033F, -1.7958F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-0.7F, 2.9781F, -2.7774F, 0.3581F, 0.0409F, 0.0153F));

		PartDefinition cube_r212 = leftFace.addOrReplaceChild("cube_r212", CubeListBuilder.create().texOffs(80, 18).addBox(-0.5F, -0.097F, -1.8344F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.55F, 1.9109F, -0.3419F, 0.2688F, 0.043F, -0.003F));

		PartDefinition cube_r213 = leftFace.addOrReplaceChild("cube_r213", CubeListBuilder.create().texOffs(86, 0).addBox(-0.5F, -1.4181F, -1.6225F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(-0.55F, 1.9109F, -0.3419F, 0.3735F, 0.043F, -0.003F));

		PartDefinition cube_r214 = leftFace.addOrReplaceChild("cube_r214", CubeListBuilder.create().texOffs(106, 97).addBox(-0.5F, -0.9F, -0.4F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.0F, 1.6894F, 3.4785F, 0.4363F, 0.0F, 0.0F));

		PartDefinition cube_r215 = leftFace.addOrReplaceChild("cube_r215", CubeListBuilder.create().texOffs(107, 109).addBox(0.0F, -0.3242F, -0.7256F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.102F))
				.texOffs(109, 105).addBox(0.0F, -0.3242F, 0.0744F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.102F)), PartPose.offsetAndRotation(-0.6F, -0.4F, 3.4F, -0.6981F, 0.0F, 0.0F));

		PartDefinition cube_r216 = leftFace.addOrReplaceChild("cube_r216", CubeListBuilder.create().texOffs(105, 87).addBox(-1.0F, -0.915F, -1.2907F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.007F)), PartPose.offsetAndRotation(-0.7F, 2.4F, 2.0F, 0.0349F, 0.0F, 0.0F));

		PartDefinition cube_r217 = leftFace.addOrReplaceChild("cube_r217", CubeListBuilder.create().texOffs(93, 35).addBox(-1.0F, -1.0F, -0.3F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(-0.7F, 2.4384F, 2.0012F, 0.1571F, 0.0F, 0.0F));

		PartDefinition cube_r218 = leftFace.addOrReplaceChild("cube_r218", CubeListBuilder.create().texOffs(0, 74).addBox(-1.0F, -1.2F, -1.5F, 2.0F, 3.0F, 3.0F, new CubeDeformation(0.012F)), PartPose.offsetAndRotation(-0.7F, 0.5F, 1.8F, 0.0873F, 0.0F, 0.0F));

		PartDefinition rightFace = head.addOrReplaceChild("rightFace", CubeListBuilder.create(), PartPose.offset(-1.0F, -0.7F, -3.2F));

		PartDefinition cube_r219 = rightFace.addOrReplaceChild("cube_r219", CubeListBuilder.create().texOffs(99, 96).mirror().addBox(-0.5F, -1.4279F, -0.1347F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(0.4035F, 0.35F, -0.4045F, -0.0792F, 0.1223F, -0.4991F));

		PartDefinition cube_r220 = rightFace.addOrReplaceChild("cube_r220", CubeListBuilder.create().texOffs(11, 75).mirror().addBox(-0.5F, -1.1458F, -2.9543F, 1.0F, 2.0F, 4.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(0.4035F, 0.35F, -0.4045F, 0.5317F, 0.1223F, -0.4991F));

		PartDefinition cube_r221 = rightFace.addOrReplaceChild("cube_r221", CubeListBuilder.create().texOffs(111, 59).mirror().addBox(-1.63F, -1.0F, -0.3F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)).mirror(false)
				.texOffs(58, 111).mirror().addBox(-1.46F, -1.0F, -0.3F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(1.0F, 0.9F, 0.9F, 0.4189F, 0.0F, 0.0F));

		PartDefinition cube_r222 = rightFace.addOrReplaceChild("cube_r222", CubeListBuilder.create().texOffs(102, 70).mirror().addBox(-1.0F, -1.2F, -0.4F, 2.0F, 2.0F, 1.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(0.7F, 1.0716F, 0.6187F, 0.6981F, 0.0F, 0.0F));

		PartDefinition cube_r223 = rightFace.addOrReplaceChild("cube_r223", CubeListBuilder.create().texOffs(0, 81).mirror().addBox(-0.5F, -0.5F, -1.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(0.68F, 3.7431F, -7.2959F, 0.5498F, 0.0F, 0.0F));

		PartDefinition cube_r224 = rightFace.addOrReplaceChild("cube_r224", CubeListBuilder.create().texOffs(111, 56).mirror().addBox(-0.5F, 0.0789F, 0.6687F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.099F)).mirror(false), PartPose.offsetAndRotation(0.48F, 1.6954F, -1.5566F, 0.8901F, -0.0524F, 0.0F));

		PartDefinition cube_r225 = rightFace.addOrReplaceChild("cube_r225", CubeListBuilder.create().texOffs(89, 108).mirror().addBox(-0.5F, -1.4822F, 0.4139F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.103F)).mirror(false), PartPose.offsetAndRotation(0.48F, 1.6954F, -1.5566F, 0.1571F, -0.0524F, 0.0F));

		PartDefinition cube_r226 = rightFace.addOrReplaceChild("cube_r226", CubeListBuilder.create().texOffs(108, 82).mirror().addBox(-0.5F, -1.195F, 0.0751F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(0.48F, 1.6954F, -1.5566F, 0.5236F, -0.0524F, 0.0F));

		PartDefinition cube_r227 = rightFace.addOrReplaceChild("cube_r227", CubeListBuilder.create().texOffs(89, 112).mirror().addBox(-0.5F, -1.0156F, -0.7604F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.106F)).mirror(false)
				.texOffs(112, 86).mirror().addBox(-0.5F, -1.3156F, -1.0604F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.094F)).mirror(false), PartPose.offsetAndRotation(0.48F, 1.6954F, -1.5566F, 1.6406F, -0.0524F, 0.0F));

		PartDefinition cube_r228 = rightFace.addOrReplaceChild("cube_r228", CubeListBuilder.create().texOffs(72, 112).mirror().addBox(-0.5F, -1.5781F, -1.5037F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.105F)).mirror(false), PartPose.offsetAndRotation(0.48F, 1.6954F, -1.5566F, 1.1868F, -0.0524F, 0.0F));

		PartDefinition cube_r229 = rightFace.addOrReplaceChild("cube_r229", CubeListBuilder.create().texOffs(112, 49).mirror().addBox(-0.5F, -1.1908F, -1.2791F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.099F)).mirror(false), PartPose.offsetAndRotation(0.48F, 1.6954F, -1.5566F, 0.7505F, -0.0524F, 0.0F));

		PartDefinition cube_r230 = rightFace.addOrReplaceChild("cube_r230", CubeListBuilder.create().texOffs(108, 78).mirror().addBox(-0.5F, -1.1551F, -0.574F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.095F)).mirror(false), PartPose.offsetAndRotation(0.48F, 1.6954F, -1.5566F, 0.6632F, -0.0524F, 0.0F));

		PartDefinition cube_r231 = rightFace.addOrReplaceChild("cube_r231", CubeListBuilder.create().texOffs(102, 35).mirror().addBox(-0.5F, -0.0025F, -0.7997F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.103F)).mirror(false), PartPose.offsetAndRotation(0.48F, 1.6954F, -1.5566F, 0.1614F, -0.0524F, 0.0F));

		PartDefinition cube_r232 = rightFace.addOrReplaceChild("cube_r232", CubeListBuilder.create().texOffs(112, 46).mirror().addBox(-0.5F, 0.4312F, 0.3655F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.104F)).mirror(false), PartPose.offsetAndRotation(0.48F, 1.6954F, -1.5566F, 0.6981F, -0.0524F, 0.0F));

		PartDefinition cube_r233 = rightFace.addOrReplaceChild("cube_r233", CubeListBuilder.create().texOffs(53, 111).mirror().addBox(-0.5F, -0.5484F, 0.9069F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(0.48F, 1.6954F, -1.5566F, 0.0873F, -0.0524F, 0.0F));

		PartDefinition cube_r234 = rightFace.addOrReplaceChild("cube_r234", CubeListBuilder.create().texOffs(112, 38).mirror().addBox(-0.5F, 0.8F, -0.525F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.096F)).mirror(false)
				.texOffs(94, 108).mirror().addBox(-0.5F, -0.8F, -0.525F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(0.06F, 1.1161F, 2.1818F, -3.1154F, 0.0F, 0.0F));

		PartDefinition cube_r235 = rightFace.addOrReplaceChild("cube_r235", CubeListBuilder.create().texOffs(74, 108).mirror().addBox(-0.5F, -1.2439F, -0.619F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.103F)).mirror(false), PartPose.offsetAndRotation(0.06F, 0.0885F, 2.4002F, 2.8187F, 0.0F, 0.0F));

		PartDefinition cube_r236 = rightFace.addOrReplaceChild("cube_r236", CubeListBuilder.create().texOffs(39, 111).mirror().addBox(-0.5F, -0.425F, -0.425F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.104F)).mirror(false), PartPose.offsetAndRotation(0.06F, 0.9166F, 1.1346F, -0.1134F, 0.0F, 0.0F));

		PartDefinition cube_r237 = rightFace.addOrReplaceChild("cube_r237", CubeListBuilder.create().texOffs(27, 111).mirror().addBox(-1.44F, -1.0321F, -0.8449F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.099F)).mirror(false), PartPose.offsetAndRotation(1.0F, -0.1F, 1.5F, 1.9199F, 0.0F, 0.0F));

		PartDefinition cube_r238 = rightFace.addOrReplaceChild("cube_r238", CubeListBuilder.create().texOffs(5, 111).mirror().addBox(-1.44F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(1.0F, 0.9F, 0.9F, 0.7679F, 0.0F, 0.0F));

		PartDefinition cube_r239 = rightFace.addOrReplaceChild("cube_r239", CubeListBuilder.create().texOffs(112, 89).mirror().addBox(-1.44F, -0.95F, -0.075F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.104F)).mirror(false), PartPose.offsetAndRotation(1.0F, 0.1731F, 0.2133F, -0.5323F, 0.0F, 0.0F));

		PartDefinition cube_r240 = rightFace.addOrReplaceChild("cube_r240", CubeListBuilder.create().texOffs(99, 110).mirror().addBox(-1.44F, -0.95F, -0.675F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.104F)).mirror(false), PartPose.offsetAndRotation(1.0F, 0.9F, 0.9F, 0.1134F, 0.0F, 0.0F));

		PartDefinition cube_r241 = rightFace.addOrReplaceChild("cube_r241", CubeListBuilder.create().texOffs(94, 112).mirror().addBox(-0.5F, -0.325F, 0.225F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.7F, 0.1416F, -0.9085F, 0.3229F, 0.0F, 0.0F));

		PartDefinition cube_r242 = rightFace.addOrReplaceChild("cube_r242", CubeListBuilder.create().texOffs(11, 68).mirror().addBox(-0.5F, -1.075F, -4.2F, 1.0F, 1.0F, 5.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(0.7F, 1.0805F, -0.9987F, 0.4974F, 0.0F, 0.0F));

		PartDefinition cube_r243 = rightFace.addOrReplaceChild("cube_r243", CubeListBuilder.create().texOffs(75, 0).mirror().addBox(-0.5F, -0.975F, -2.525F, 1.0F, 2.0F, 4.0F, new CubeDeformation(-0.007F)).mirror(false), PartPose.offsetAndRotation(0.7F, 2.4104F, -2.5309F, 0.3229F, 0.0F, 0.0F));

		PartDefinition cube_r244 = rightFace.addOrReplaceChild("cube_r244", CubeListBuilder.create().texOffs(80, 24).mirror().addBox(-0.525F, 0.3033F, -1.7958F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(0.7F, 2.9781F, -2.7774F, 0.3581F, -0.0409F, -0.0153F));

		PartDefinition cube_r245 = rightFace.addOrReplaceChild("cube_r245", CubeListBuilder.create().texOffs(80, 18).mirror().addBox(-0.5F, -0.097F, -1.8344F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.55F, 1.9109F, -0.3419F, 0.2688F, -0.043F, 0.003F));

		PartDefinition cube_r246 = rightFace.addOrReplaceChild("cube_r246", CubeListBuilder.create().texOffs(86, 0).mirror().addBox(-0.5F, -1.4181F, -1.6225F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.007F)).mirror(false), PartPose.offsetAndRotation(0.55F, 1.9109F, -0.3419F, 0.3735F, -0.043F, 0.003F));

		PartDefinition cube_r247 = rightFace.addOrReplaceChild("cube_r247", CubeListBuilder.create().texOffs(106, 97).mirror().addBox(-0.5F, -0.9F, -0.4F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(0.0F, 1.6894F, 3.4785F, 0.4363F, 0.0F, 0.0F));

		PartDefinition cube_r248 = rightFace.addOrReplaceChild("cube_r248", CubeListBuilder.create().texOffs(107, 109).mirror().addBox(-1.0F, -0.3242F, -0.7256F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.102F)).mirror(false)
				.texOffs(109, 105).mirror().addBox(-1.0F, -0.3242F, 0.0744F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.102F)).mirror(false), PartPose.offsetAndRotation(0.6F, -0.4F, 3.4F, -0.6981F, 0.0F, 0.0F));

		PartDefinition cube_r249 = rightFace.addOrReplaceChild("cube_r249", CubeListBuilder.create().texOffs(105, 87).mirror().addBox(-1.0F, -0.915F, -1.2907F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.7F, 2.4F, 2.0F, 0.0349F, 0.0F, 0.0F));

		PartDefinition cube_r250 = rightFace.addOrReplaceChild("cube_r250", CubeListBuilder.create().texOffs(93, 35).mirror().addBox(-1.0F, -1.0F, -0.3F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(0.7F, 2.4384F, 2.0012F, 0.1571F, 0.0F, 0.0F));

		PartDefinition cube_r251 = rightFace.addOrReplaceChild("cube_r251", CubeListBuilder.create().texOffs(0, 74).mirror().addBox(-1.0F, -1.2F, -1.5F, 2.0F, 3.0F, 3.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(0.7F, 0.5F, 1.8F, 0.0873F, 0.0F, 0.0F));

		PartDefinition jaw = head.addOrReplaceChild("jaw", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 1.5096F, 1.1868F, 1.0036F, 0.0F, 0.0F));

		PartDefinition cube_r252 = jaw.addOrReplaceChild("cube_r252", CubeListBuilder.create().texOffs(105, 2).mirror().addBox(-0.775F, -0.5F, 1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.008F)).mirror(false)
				.texOffs(72, 104).mirror().addBox(-0.375F, -0.5F, -0.8F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.008F)).mirror(false)
				.texOffs(105, 2).addBox(0.775F, -0.5F, 1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.008F))
				.texOffs(72, 104).addBox(0.375F, -0.5F, -0.8F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.008F)), PartPose.offsetAndRotation(-0.5F, 1.1611F, -4.8766F, 0.0262F, 0.0F, 0.0F));

		PartDefinition cube_r253 = jaw.addOrReplaceChild("cube_r253", CubeListBuilder.create().texOffs(95, 14).mirror().addBox(-1.0F, -0.7463F, -2.2228F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.009F)).mirror(false)
				.texOffs(101, 79).mirror().addBox(-1.0F, -0.2463F, -2.2228F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.006F)).mirror(false)
				.texOffs(95, 14).addBox(-0.25F, -0.7463F, -2.2228F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.009F))
				.texOffs(101, 79).addBox(-0.25F, -0.2463F, -2.2228F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.125F, 1.7344F, -3.7424F, -0.192F, 0.0F, 0.0F));

		PartDefinition cube_r254 = jaw.addOrReplaceChild("cube_r254", CubeListBuilder.create().texOffs(112, 111).mirror().addBox(-1.0F, -0.6F, -0.05F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)).mirror(false)
				.texOffs(112, 111).addBox(0.6F, -0.6F, -0.05F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-0.3F, 0.9344F, -0.9424F, 0.7156F, 0.0F, 0.0F));

		PartDefinition cube_r255 = jaw.addOrReplaceChild("cube_r255", CubeListBuilder.create().texOffs(112, 108).mirror().addBox(-0.5F, -0.425F, 0.45F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.007F)).mirror(false)
				.texOffs(112, 108).addBox(0.1F, -0.425F, 0.45F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.3F, 1.0974F, -7.1642F, 0.3491F, 0.0F, 0.0F));

		PartDefinition cube_r256 = jaw.addOrReplaceChild("cube_r256", CubeListBuilder.create().texOffs(104, 60).mirror().addBox(-0.5F, -0.3F, -1.375F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.006F)).mirror(false)
				.texOffs(104, 60).addBox(0.1F, -0.3F, -1.375F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-0.3F, 1.3969F, -6.1483F, -0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r257 = jaw.addOrReplaceChild("cube_r257", CubeListBuilder.create().texOffs(104, 56).mirror().addBox(-0.5F, -0.5F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.013F)).mirror(false)
				.texOffs(104, 56).addBox(0.1F, -0.5F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.007F)), PartPose.offsetAndRotation(-0.3F, 1.1627F, -7.66F, 0.1309F, 0.0F, 0.0F));

		PartDefinition cube_r258 = jaw.addOrReplaceChild("cube_r258", CubeListBuilder.create().texOffs(66, 86).mirror().addBox(-0.5F, -1.025F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.007F)).mirror(false)
				.texOffs(66, 86).addBox(0.3F, -1.025F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.4F, 2.4177F, -3.4907F, 0.0175F, 0.0F, 0.0F));

		PartDefinition cube_r259 = jaw.addOrReplaceChild("cube_r259", CubeListBuilder.create().texOffs(5, 103).mirror().addBox(-1.0F, -0.5401F, -1.871F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.009F)).mirror(false)
				.texOffs(5, 103).addBox(0.6F, -0.5401F, -1.871F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.009F)), PartPose.offsetAndRotation(-0.3F, 1.4344F, -1.8424F, 0.2967F, 0.0F, 0.0F));

		PartDefinition cube_r260 = jaw.addOrReplaceChild("cube_r260", CubeListBuilder.create().texOffs(111, 96).mirror().addBox(-1.0F, -1.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(111, 96).addBox(0.6F, -1.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.3F, 1.2773F, -0.7364F, 0.5934F, 0.0F, 0.0F));

		PartDefinition cube_r261 = jaw.addOrReplaceChild("cube_r261", CubeListBuilder.create().texOffs(111, 65).mirror().addBox(-0.65F, -1.0221F, 1.5257F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false)
				.texOffs(85, 102).mirror().addBox(-0.65F, -0.3221F, 1.0257F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.012F)).mirror(false)
				.texOffs(111, 65).addBox(-0.05F, -1.0221F, 1.5257F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F))
				.texOffs(85, 102).addBox(-0.05F, -0.3221F, 1.0257F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.012F)), PartPose.offsetAndRotation(-0.15F, 1.373F, -9.6784F, 0.0436F, 0.0F, 0.0F));

		PartDefinition cube_r262 = jaw.addOrReplaceChild("cube_r262", CubeListBuilder.create().texOffs(101, 75).mirror().addBox(-1.0F, -0.0239F, -2.0028F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.007F)).mirror(false)
				.texOffs(101, 75).addBox(-0.25F, -0.0239F, -2.0028F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(0.125F, -0.0656F, -3.9424F, 0.1396F, 0.0F, 0.0F));

		PartDefinition cube_r263 = jaw.addOrReplaceChild("cube_r263", CubeListBuilder.create().texOffs(111, 62).mirror().addBox(-1.0F, -0.0936F, -1.0004F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.009F)).mirror(false)
				.texOffs(111, 62).addBox(0.6F, -0.0936F, -1.0004F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.009F)), PartPose.offsetAndRotation(-0.3F, -0.0656F, -2.9424F, 0.0698F, 0.0F, 0.0F));

		PartDefinition cube_r264 = jaw.addOrReplaceChild("cube_r264", CubeListBuilder.create().texOffs(88, 60).mirror().addBox(-1.0F, -0.05F, -2.55F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.005F)).mirror(false)
				.texOffs(88, 60).addBox(0.6F, -0.05F, -2.55F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(-0.3F, -0.0656F, -0.4424F, -0.0175F, 0.0F, 0.0F));

		PartDefinition cube_r265 = jaw.addOrReplaceChild("cube_r265", CubeListBuilder.create().texOffs(82, 9).addBox(-0.65F, -1.0928F, -2.7712F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.1F))
				.texOffs(111, 93).addBox(-0.65F, -0.3928F, -2.8462F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F))
				.texOffs(89, 89).addBox(-0.65F, -0.3928F, -1.8712F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.15F, 1.373F, -9.6784F, -0.0262F, 0.0F, 0.0F));

		PartDefinition cube_r266 = jaw.addOrReplaceChild("cube_r266", CubeListBuilder.create().texOffs(107, 112).addBox(-0.5F, -0.625F, -0.525F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(0.0F, 1.4967F, -9.0526F, 0.1484F, 0.0F, 0.0F));

		PartDefinition Leftarm1 = chest.addOrReplaceChild("Leftarm1", CubeListBuilder.create(), PartPose.offsetAndRotation(3.7F, 7.877F, -1.8967F, 0.8276F, -0.0074F, -0.4302F));

		PartDefinition Leftupperarm_r1 = Leftarm1.addOrReplaceChild("Leftupperarm_r1", CubeListBuilder.create().texOffs(31, 104).addBox(-0.5049F, 0.0458F, -1.0266F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.1092F, 2.7533F, 0.8346F, -0.075F, -0.022F, -0.0102F));

		PartDefinition Leftupperarm_r2 = Leftarm1.addOrReplaceChild("Leftupperarm_r2", CubeListBuilder.create().texOffs(106, 64).addBox(-0.5F, -1.6014F, -0.7196F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.002F)), PartPose.offsetAndRotation(0.5045F, 0.6566F, -0.1437F, -0.63F, -0.3536F, -0.0108F));

		PartDefinition Leftupperarm_r3 = Leftarm1.addOrReplaceChild("Leftupperarm_r3", CubeListBuilder.create().texOffs(22, 106).addBox(-0.481F, -1.9465F, 0.0137F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0942F, 0.8807F, -0.4331F, -0.4939F, -0.022F, -0.0102F));

		PartDefinition Leftupperarm_r4 = Leftarm1.addOrReplaceChild("Leftupperarm_r4", CubeListBuilder.create().texOffs(95, 2).addBox(-0.5F, -0.6142F, -1.011F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5045F, 0.6566F, -0.1437F, 0.6441F, -0.3536F, -0.0108F));

		PartDefinition Leftupperarm_r5 = Leftarm1.addOrReplaceChild("Leftupperarm_r5", CubeListBuilder.create().texOffs(0, 106).addBox(-0.5F, -1.3F, -0.6F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.002F)), PartPose.offsetAndRotation(0.1092F, 2.1533F, 0.3346F, 0.117F, -0.022F, -0.0102F));

		PartDefinition Leftarm2 = Leftarm1.addOrReplaceChild("Leftarm2", CubeListBuilder.create().texOffs(7, 95).addBox(-0.6158F, -0.8649F, 0.3558F, 1.0F, 6.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(55, 100).addBox(-0.6158F, 0.1351F, -1.0442F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.2789F, 5.588F, -0.3941F, -1.5118F, -0.2723F, 0.6709F));

		PartDefinition Leftarm3 = Leftarm2.addOrReplaceChild("Leftarm3", CubeListBuilder.create().texOffs(24, 71).addBox(-2.2864F, -0.2951F, 0.237F, 2.0F, 8.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.3836F, 5.5615F, -0.6812F, 0.0F, 0.0F, -0.3927F));

		PartDefinition Leftarm4 = Leftarm3.addOrReplaceChild("Leftarm4", CubeListBuilder.create().texOffs(20, 82).addBox(-1.0F, -2.0F, -0.5F, 2.0F, 8.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.2864F, -0.2951F, -0.263F, -0.6109F, 0.0F, 0.0F));

		PartDefinition Rightarm1 = chest.addOrReplaceChild("Rightarm1", CubeListBuilder.create(), PartPose.offsetAndRotation(-3.7F, 7.877F, -1.8967F, 0.1143F, 0.2071F, 0.2183F));

		PartDefinition Rightupperarm_r1 = Rightarm1.addOrReplaceChild("Rightupperarm_r1", CubeListBuilder.create().texOffs(79, 104).addBox(-0.4951F, 0.0458F, -1.0266F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.1092F, 2.7533F, 0.8346F, -0.075F, 0.022F, 0.0102F));

		PartDefinition Rightupperarm_r2 = Rightarm1.addOrReplaceChild("Rightupperarm_r2", CubeListBuilder.create().texOffs(84, 106).addBox(-0.5F, -1.6014F, -0.7196F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.002F)), PartPose.offsetAndRotation(-0.5045F, 0.6566F, -0.1437F, -0.63F, 0.3536F, 0.0108F));

		PartDefinition Rightupperarm_r3 = Rightarm1.addOrReplaceChild("Rightupperarm_r3", CubeListBuilder.create().texOffs(36, 106).addBox(-0.519F, -1.9465F, 0.0137F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.0942F, 0.8807F, -0.4331F, -0.4939F, 0.022F, 0.0102F));

		PartDefinition Rightupperarm_r4 = Rightarm1.addOrReplaceChild("Rightupperarm_r4", CubeListBuilder.create().texOffs(104, 105).addBox(-0.5F, -0.6142F, -1.011F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5045F, 0.6566F, -0.1437F, 0.6441F, 0.3536F, 0.0108F));

		PartDefinition Rightupperarm_r5 = Rightarm1.addOrReplaceChild("Rightupperarm_r5", CubeListBuilder.create().texOffs(17, 106).addBox(-0.5F, -1.3F, -0.6F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.002F)), PartPose.offsetAndRotation(-0.1092F, 2.1533F, 0.3346F, 0.117F, 0.022F, 0.0102F));

		PartDefinition Rightarm2 = Rightarm1.addOrReplaceChild("Rightarm2", CubeListBuilder.create().texOffs(12, 95).addBox(-0.3842F, -0.8649F, 0.3558F, 1.0F, 6.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(60, 100).addBox(-0.3842F, 0.1351F, -1.0442F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.2789F, 5.588F, -0.3941F, -1.127F, 0.2555F, 0.0579F));

		PartDefinition Rightarm3 = Rightarm2.addOrReplaceChild("Rightarm3", CubeListBuilder.create().texOffs(33, 71).addBox(0.2864F, -0.2951F, 0.237F, 2.0F, 8.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.3836F, 5.5615F, -0.6812F, 0.0F, 0.0F, 0.1745F));

		PartDefinition Rightarm4 = Rightarm3.addOrReplaceChild("Rightarm4", CubeListBuilder.create().texOffs(27, 82).addBox(-1.0F, -2.0F, -0.5F, 2.0F, 8.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.2864F, -0.2951F, -0.263F, -0.48F, 0.0F, 0.0F));

		PartDefinition bone4 = chest.addOrReplaceChild("bone4", CubeListBuilder.create(), PartPose.offset(3.8F, -1.3449F, -0.392F));

		PartDefinition cube_r267 = bone4.addOrReplaceChild("cube_r267", CubeListBuilder.create().texOffs(105, 11).addBox(-0.5F, -0.9F, -1.2F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.637F, 0.0F, 0.0F));

		PartDefinition cube_r268 = bone4.addOrReplaceChild("cube_r268", CubeListBuilder.create().texOffs(67, 25).addBox(-0.5F, -0.3268F, -0.0144F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F))
				.texOffs(60, 70).addBox(-0.5F, -0.6268F, -0.0144F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.013F)), PartPose.offsetAndRotation(0.0F, 4.3369F, -1.1524F, 1.2828F, 0.0F, 0.0F));

		PartDefinition cube_r269 = bone4.addOrReplaceChild("cube_r269", CubeListBuilder.create().texOffs(21, 113).addBox(-0.5F, -0.6804F, -3.9321F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.007F)), PartPose.offsetAndRotation(0.0F, 4.212F, -0.773F, 0.9338F, 0.0F, 0.0F));

		PartDefinition cube_r270 = bone4.addOrReplaceChild("cube_r270", CubeListBuilder.create().texOffs(72, 83).addBox(-0.5F, -0.8804F, -3.9321F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 4.212F, -0.773F, 0.8814F, 0.0F, 0.0F));

		PartDefinition cube_r271 = bone4.addOrReplaceChild("cube_r271", CubeListBuilder.create().texOffs(83, 77).addBox(-0.5F, -0.6804F, -3.9321F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(0.0F, 4.212F, -0.773F, 1.1432F, 0.0F, 0.0F));

		PartDefinition cube_r272 = bone4.addOrReplaceChild("cube_r272", CubeListBuilder.create().texOffs(11, 82).addBox(0.7452F, -1.9786F, -3.7081F, 1.0F, 4.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.6F, 7.3481F, -2.8439F, 1.1816F, 0.7856F, 1.0013F));

		PartDefinition cube_r273 = bone4.addOrReplaceChild("cube_r273", CubeListBuilder.create().texOffs(24, 97).addBox(-0.5F, -1.75F, -2.4F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.007F)), PartPose.offsetAndRotation(-0.6002F, 9.8232F, -1.6405F, -0.0756F, 0.4137F, 0.4632F));

		PartDefinition cube_r274 = bone4.addOrReplaceChild("cube_r274", CubeListBuilder.create().texOffs(93, 6).addBox(0.4458F, -0.0939F, -2.0081F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.4506F, 5.5349F, -3.347F, 0.7534F, 0.4137F, 0.4632F));

		PartDefinition bone6 = chest.addOrReplaceChild("bone6", CubeListBuilder.create(), PartPose.offset(-3.8F, -1.3449F, -0.392F));

		PartDefinition cube_r275 = bone6.addOrReplaceChild("cube_r275", CubeListBuilder.create().texOffs(105, 11).mirror().addBox(-0.5F, -0.9F, -1.2F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.637F, 0.0F, 0.0F));

		PartDefinition cube_r276 = bone6.addOrReplaceChild("cube_r276", CubeListBuilder.create().texOffs(67, 25).mirror().addBox(-0.5F, -0.3268F, -0.0144F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(60, 70).mirror().addBox(-0.5F, -0.6268F, -0.0144F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.013F)).mirror(false), PartPose.offsetAndRotation(0.0F, 4.3369F, -1.1524F, 1.2828F, 0.0F, 0.0F));

		PartDefinition cube_r277 = bone6.addOrReplaceChild("cube_r277", CubeListBuilder.create().texOffs(21, 113).mirror().addBox(-0.5F, -0.6804F, -3.9321F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.007F)).mirror(false), PartPose.offsetAndRotation(0.0F, 4.212F, -0.773F, 0.9338F, 0.0F, 0.0F));

		PartDefinition cube_r278 = bone6.addOrReplaceChild("cube_r278", CubeListBuilder.create().texOffs(72, 83).mirror().addBox(-0.5F, -0.8804F, -3.9321F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 4.212F, -0.773F, 0.8814F, 0.0F, 0.0F));

		PartDefinition cube_r279 = bone6.addOrReplaceChild("cube_r279", CubeListBuilder.create().texOffs(83, 77).mirror().addBox(-0.5F, -0.6804F, -3.9321F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.007F)).mirror(false), PartPose.offsetAndRotation(0.0F, 4.212F, -0.773F, 1.1432F, 0.0F, 0.0F));

		PartDefinition cube_r280 = bone6.addOrReplaceChild("cube_r280", CubeListBuilder.create().texOffs(11, 82).mirror().addBox(-1.7452F, -1.9786F, -3.7081F, 1.0F, 4.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.6F, 7.3481F, -2.8439F, 1.1816F, -0.7856F, -1.0013F));

		PartDefinition cube_r281 = bone6.addOrReplaceChild("cube_r281", CubeListBuilder.create().texOffs(24, 97).mirror().addBox(-0.5F, -1.75F, -2.4F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.007F)).mirror(false), PartPose.offsetAndRotation(0.6002F, 9.8232F, -1.6405F, -0.0756F, -0.4137F, -0.4632F));

		PartDefinition cube_r282 = bone6.addOrReplaceChild("cube_r282", CubeListBuilder.create().texOffs(93, 6).mirror().addBox(-1.4458F, -0.0939F, -2.0081F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.4506F, 5.5349F, -3.347F, 0.7534F, -0.4137F, -0.4632F));

		PartDefinition tail = hips.addOrReplaceChild("tail", CubeListBuilder.create().texOffs(0, 14).addBox(-1.0F, -1.1F, -0.9F, 2.0F, 2.0F, 11.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.6094F, 5.4978F, -0.0809F, -0.1776F, -0.0288F));

		PartDefinition cube_r283 = tail.addOrReplaceChild("cube_r283", CubeListBuilder.create().texOffs(100, 14).addBox(0.0F, -3.9F, 3.0F, 0.0F, 4.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(36, 99).addBox(0.0F, -4.0F, 0.0F, 0.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.9983F, 5.1349F, -0.096F, 0.0F, 0.0F));

		PartDefinition cube_r284 = tail.addOrReplaceChild("cube_r284", CubeListBuilder.create().texOffs(66, 94).addBox(0.0F, -4.6F, 2.0F, 0.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.1F, 0.1F, -0.1396F, 0.0F, 0.0F));

		PartDefinition cube_r285 = tail.addOrReplaceChild("cube_r285", CubeListBuilder.create().texOffs(104, 109).addBox(0.0F, 3.7792F, 5.0777F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(62, 95).addBox(0.0F, 2.3792F, 2.5777F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(23, 28).addBox(0.0F, 0.6792F, 0.0777F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.8404F, 2.1776F, 0.576F, 0.0F, 0.0F));

		PartDefinition cube_r286 = tail.addOrReplaceChild("cube_r286", CubeListBuilder.create().texOffs(50, 93).addBox(0.0F, -4.5F, -1.0F, 0.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.1F, 0.1F, -0.096F, 0.0F, 0.0F));

		PartDefinition cube_r287 = tail.addOrReplaceChild("cube_r287", CubeListBuilder.create().texOffs(109, 9).mirror().addBox(-2.0F, 1.0F, 8.45F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(13, 51).mirror().addBox(-2.0F, 1.0F, 5.7F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(5, 109).mirror().addBox(-2.0F, 1.0F, 2.6F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(105, 19).mirror().addBox(-2.0F, 1.0F, 0.0F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -1.1F, 0.1F, 0.0F, 0.1047F, 0.0F));

		PartDefinition cube_r288 = tail.addOrReplaceChild("cube_r288", CubeListBuilder.create().texOffs(109, 9).addBox(0.0F, 1.0F, 8.45F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(13, 51).addBox(0.0F, 1.0F, 5.7F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(5, 109).addBox(0.0F, 1.0F, 2.6F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(105, 19).addBox(0.0F, 1.0F, 0.0F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -1.1F, 0.1F, 0.0F, -0.1047F, 0.0F));

		PartDefinition tail2 = tail.addOrReplaceChild("tail2", CubeListBuilder.create().texOffs(0, 0).addBox(-1.0F, -0.4F, 0.0F, 2.0F, 2.0F, 11.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.0F, -0.6939F, 9.8768F, 0.0859F, -0.1673F, -0.1006F));

		PartDefinition cube_r289 = tail2.addOrReplaceChild("cube_r289", CubeListBuilder.create().texOffs(112, 2).addBox(0.0F, -2.7F, 5.0F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(112, 25).addBox(0.0F, -2.7F, 9.0F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(63, 111).addBox(0.0F, -2.7F, 7.0F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.4F, 1.0F, -0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r290 = tail2.addOrReplaceChild("cube_r290", CubeListBuilder.create().texOffs(44, 111).addBox(0.0F, -2.9F, 0.0F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.1385F, 3.9886F, -0.1309F, 0.0F, 0.0F));

		PartDefinition cube_r291 = tail2.addOrReplaceChild("cube_r291", CubeListBuilder.create().texOffs(100, 2).addBox(0.0F, -3.2F, 0.0F, 0.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.4F, 1.0F, -0.1745F, 0.0F, 0.0F));

		PartDefinition cube_r292 = tail2.addOrReplaceChild("cube_r292", CubeListBuilder.create().texOffs(29, 114).addBox(0.0F, 8.0792F, 11.3777F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(83, 113).addBox(0.0F, 6.9792F, 9.3777F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(32, 113).addBox(0.0F, 5.1792F, 7.3777F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(18, 113).addBox(0.0F, 3.8792F, 5.0777F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.5404F, -4.8224F, 0.576F, 0.0F, 0.0F));

		PartDefinition cube_r293 = tail2.addOrReplaceChild("cube_r293", CubeListBuilder.create().texOffs(112, 7).mirror().addBox(-1.0F, -0.1F, 7.2F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(111, 99).mirror().addBox(-1.0F, -0.1F, 5.2F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(109, 72).mirror().addBox(-1.0F, -0.1F, 3.1F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(95, 75).mirror().addBox(-1.0F, -0.1F, 0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.7F, 1.0F, 0.0F, 0.0698F, 0.0F));

		PartDefinition cube_r294 = tail2.addOrReplaceChild("cube_r294", CubeListBuilder.create().texOffs(112, 7).addBox(0.0F, -0.1F, 7.2F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(111, 99).addBox(0.0F, -0.1F, 5.2F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(109, 72).addBox(0.0F, -0.1F, 3.1F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(95, 75).addBox(0.0F, -0.1F, 0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.7F, 1.0F, 0.0F, -0.0698F, 0.0F));

		PartDefinition tail3 = tail2.addOrReplaceChild("tail3", CubeListBuilder.create().texOffs(0, 28).addBox(-0.5F, -0.3F, 0.0F, 1.0F, 1.0F, 10.0F, new CubeDeformation(0.0F))
				.texOffs(72, 115).addBox(0.0F, -1.3F, 9.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.0098F, 10.9066F, 0.1063F, 0.1736F, 0.0184F));

		PartDefinition cube_r295 = tail3.addOrReplaceChild("cube_r295", CubeListBuilder.create().texOffs(5, 114).addBox(0.0F, -2.1F, 0.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.7F, 7.0F, -0.0436F, 0.0F, 0.0F));

		PartDefinition cube_r296 = tail3.addOrReplaceChild("cube_r296", CubeListBuilder.create().texOffs(38, 114).addBox(0.0F, -1.3F, 0.1F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.3F, 4.9F, -0.0698F, 0.0F, 0.0F));

		PartDefinition cube_r297 = tail3.addOrReplaceChild("cube_r297", CubeListBuilder.create().texOffs(113, 101).addBox(0.0F, -1.5F, 0.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.3F, 3.0F, -0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r298 = tail3.addOrReplaceChild("cube_r298", CubeListBuilder.create().texOffs(99, 113).addBox(0.0F, -1.8F, 0.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.3F, 1.0F, -0.1309F, 0.0F, 0.0F));

		PartDefinition cube_r299 = tail3.addOrReplaceChild("cube_r299", CubeListBuilder.create().texOffs(50, 113).addBox(0.0F, 0.4F, 3.5F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(47, 113).addBox(0.0F, 0.1F, 1.5F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(71, 94).addBox(0.0F, -0.4F, -0.5F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.0981F, 5.4663F, 0.3665F, 0.0F, 0.0F));

		PartDefinition cube_r300 = tail3.addOrReplaceChild("cube_r300", CubeListBuilder.create().texOffs(86, 113).addBox(0.0F, 1.6411F, 1.0662F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(35, 113).addBox(0.0F, 0.9411F, -0.9338F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.4404F, 1.0776F, 0.4887F, 0.0F, 0.0F));

		PartDefinition tail4 = tail3.addOrReplaceChild("tail4", CubeListBuilder.create().texOffs(44, 43).addBox(-0.5F, -0.3F, 0.0F, 1.0F, 1.0F, 8.0F, new CubeDeformation(0.006F))
				.texOffs(115, 72).addBox(0.0F, -1.2F, 1.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(115, 75).addBox(0.0F, -1.2F, 3.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(89, 115).addBox(0.0F, -1.1F, 5.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0052F, 9.9503F, 0.1063F, 0.1736F, 0.0184F));

		PartDefinition cube_r301 = tail4.addOrReplaceChild("cube_r301", CubeListBuilder.create().texOffs(92, 115).addBox(0.0F, -1.0F, -0.2F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 7.2F, -0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r302 = tail4.addOrReplaceChild("cube_r302", CubeListBuilder.create().texOffs(102, 114).addBox(0.0F, 0.0F, 1.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(90, 6).addBox(0.0F, -0.3F, -0.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.8482F, 5.8591F, 0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r303 = tail4.addOrReplaceChild("cube_r303", CubeListBuilder.create().texOffs(88, 65).addBox(0.0F, -0.3F, -0.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.9084F, 3.8204F, 0.2269F, 0.0F, 0.0F));

		PartDefinition cube_r304 = tail4.addOrReplaceChild("cube_r304", CubeListBuilder.create().texOffs(95, 115).addBox(0.0F, 1.1F, 3.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.0981F, -2.5337F, 0.3665F, 0.0F, 0.0F));

		PartDefinition tail5 = tail4.addOrReplaceChild("tail5", CubeListBuilder.create().texOffs(27, 11).addBox(-0.5F, -0.3F, 0.0F, 1.0F, 1.0F, 10.0F, new CubeDeformation(0.0F))
				.texOffs(115, 11).addBox(0.0F, -0.9F, 1.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(115, 14).addBox(0.0F, -0.9F, 3.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.0087F, 7.9508F, -0.1787F, 0.2148F, -0.0385F));

		PartDefinition cube_r305 = tail5.addOrReplaceChild("cube_r305", CubeListBuilder.create().texOffs(115, 2).addBox(0.0F, 0.3F, 12.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(112, 114).addBox(0.0F, 0.2F, 10.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(114, 105).addBox(0.0F, 0.0F, 8.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(59, 114).addBox(0.0F, 0.0F, 6.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(27, 106).addBox(0.0F, 0.0F, 4.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.8482F, -3.1409F, 0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r306 = tail5.addOrReplaceChild("cube_r306", CubeListBuilder.create().texOffs(115, 43).addBox(0.0F, -0.9F, 4.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(115, 25).addBox(0.0F, -0.9F, 2.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(115, 17).addBox(0.0F, -0.9F, 0.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 5.0F, -0.0524F, 0.0F, 0.0F));

		PartDefinition tail6 = tail5.addOrReplaceChild("tail6", CubeListBuilder.create().texOffs(0, 40).addBox(-0.5F, -0.3F, 0.0F, 1.0F, 1.0F, 9.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.0F, 0.0F, 10.0F, -0.1715F, 0.2581F, -0.0442F));

		PartDefinition tail7 = tail6.addOrReplaceChild("tail7", CubeListBuilder.create().texOffs(62, 62).addBox(-0.5F, -0.3F, 0.0F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.0F, 0.0503F, 8.9804F, -0.2436F, 0.2544F, -0.0625F));

		PartDefinition tail8 = tail7.addOrReplaceChild("tail8", CubeListBuilder.create().texOffs(23, 35).addBox(-0.5F, -0.3F, 0.0F, 1.0F, 1.0F, 9.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.0F, -0.0073F, 5.9666F, -0.332F, 0.2996F, -0.0601F));

		return LayerDefinition.create(meshdefinition, 120, 120);
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